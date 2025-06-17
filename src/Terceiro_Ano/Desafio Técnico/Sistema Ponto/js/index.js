// Mock database for demonstration purposes
const database = {
    users: [
        { id: 1, code: 'admin', name: 'Administrador', password: 'admin123', role: 'admin' },
        { id: 2, code: '001234', name: 'João F. Silva', password: '123456', role: 'employee' },
        { id: 3, code: '005678', name: 'Ana M. Souza', password: '123456', role: 'employee' }
    ],
    timeRecords: [
        { id: 1, userId: 2, date: '11/06/2025', morningIn: '08:02', morningOut: '12:00', afternoonIn: '14:05', afternoonOut: '18:00' },
        { id: 2, userId: 3, date: '11/06/2025', morningIn: null, morningOut: null, afternoonIn: '14:01', afternoonOut: '18:00' },
        { id: 3, userId: 2, date: '10/06/2025', morningIn: '08:00', morningOut: '11:55', afternoonIn: '13:50', afternoonOut: '18:10' }
    ]
};

// Current logged in user
let currentUser = null;

// DOM elements
const loginScreen = document.getElementById('login-screen');
const employeeDashboard = document.getElementById('employee-dashboard');
const adminDashboard = document.getElementById('admin-dashboard');
const loginBtn = document.getElementById('login-btn');
const logoutBtn = document.getElementById('logout-btn');
const adminLogoutBtn = document.getElementById('admin-logout-btn');
const loginUser = document.getElementById('login-user');
const loginPassword = document.getElementById('login-password');
const currentTime = document.getElementById('current-time');
const currentDate = document.getElementById('current-date');
const employeeName = document.getElementById('employee-name');
const morningIn = document.getElementById('morning-in');
const morningOut = document.getElementById('morning-out');
const afternoonIn = document.getElementById('afternoon-in');
const afternoonOut = document.getElementById('afternoon-out');
const morningInBtn = document.getElementById('morning-in-btn');
const morningOutBtn = document.getElementById('morning-out-btn');
const afternoonInBtn = document.getElementById('afternoon-in-btn');
const afternoonOutBtn = document.getElementById('afternoon-out-btn');
const registerMessage = document.getElementById('register-message');
const registerIcon = document.getElementById('register-icon');
const registerText = document.getElementById('register-text');
const timeRecords = document.getElementById('time-records');
const addEmployeeBtn = document.getElementById('add-employee-btn');
const addEmployeeForm = document.getElementById('add-employee-form');
const employeeCode = document.getElementById('employee-code');
const employeeNameInput = document.getElementById('employee-name');
const employeePassword = document.getElementById('employee-password');
const saveEmployeeBtn = document.getElementById('save-employee-btn');
const employeeMessage = document.getElementById('employee-message');
const employeeIcon = document.getElementById('employee-icon');
const employeeText = document.getElementById('employee-text');
const employeesList = document.getElementById('employees-list');
const searchEmployee = document.getElementById('search-employee');
const adminTimeRecords = document.getElementById('admin-time-records');
const currentAdminDate = document.getElementById('current-admin-date');
const generateReportBtn = document.getElementById('generate-report-btn');

// Function to update current time
function updateCurrentTime() {
    const now = new Date();
    const timeString = now.toLocaleTimeString('pt-BR', { hour: '2-digit', minute: '2-digit', second: '2-digit' });
    const dateString = now.toLocaleDateString('pt-BR', { weekday: 'long', day: '2-digit', month: 'long', year: 'numeric' });
    
    if (currentTime) currentTime.textContent = timeString;
    if (currentDate) currentDate.textContent = dateString;
    
    setTimeout(updateCurrentTime, 1000);
}

// Function to update current date in admin panel
function updateAdminCurrentDate() {
    const now = new Date();
    const dateString = now.toLocaleDateString('pt-BR');
    if (currentAdminDate) currentAdminDate.textContent = dateString;
}

// Function to show message
function showMessage(element, iconElement, textElement, type, message) {
    element.classList.remove('hidden');
    
    // Remove all color classes from icon and text
    ['text-green-500', 'text-red-500', 'text-yellow-500', 'bg-green-50', 'bg-red-50', 'bg-yellow-50'].forEach(cls => {
        iconElement.classList.remove(cls);
        textElement.classList.remove(cls);
        element.firstElementChild.classList.remove(cls);
    });
    
    if (type === 'success') {
        iconElement.classList.add('text-green-500', 'fa-check-circle');
        textElement.classList.add('text-green-700');
        element.firstElementChild.classList.add('bg-green-50');
    } else if (type === 'error') {
        iconElement.classList.add('text-red-500', 'fa-times-circle');
        textElement.classList.add('text-red-700');
        element.firstElementChild.classList.add('bg-red-50');
    } else if (type === 'warning') {
        iconElement.classList.add('text-yellow-500', 'fa-exclamation-circle');
        textElement.classList.add('text-yellow-700');
        element.firstElementChild.classList.add('bg-yellow-50');
    }
    
    iconElement.classList.remove('fa-check-circle', 'fa-times-circle', 'fa-exclamation-circle');
    if (type === 'success') {
        iconElement.classList.add('fa-check-circle');
    } else if (type === 'error') {
        iconElement.classList.add('fa-times-circle');
    } else if (type === 'warning') {
        iconElement.classList.add('fa-exclamation-circle');
    }
    
    textElement.textContent = message;
    
    setTimeout(() => {
        element.classList.add('hidden');
    }, 5000);
}

// Function to check if current time is within allowed window
function isTimeInWindow(type) {
    const now = new Date();
    const hours = now.getHours();
    const minutes = now.getMinutes();
    
    // Convert to minutes since midnight for easier comparison
    const currentMinutes = hours * 60 + minutes;
    
    // Define time windows (in minutes since midnight)
    const windows = {
        'morningIn': { start: 7 * 60 + 45, end: 8 * 60 + 15 },
        'morningOut': { start: 11 * 60 + 45, end: 12 * 60 + 15 },
        'afternoonIn': { start: 13 * 60 + 45, end: 14 * 60 + 15 },
        'afternoonOut': { start: 17 * 60 + 45, end: 18 * 60 + 15 }
    };
    
    return currentMinutes >= windows[type].start && currentMinutes <= windows[type].end;
}

// Function to get time record for today
function getTodayTimeRecord(userId) {
    const today = new Date().toLocaleDateString('pt-BR');
    return database.timeRecords.find(record => record.userId === userId && record.date === today);
}

// Function to update employee's time records display
function updateEmployeeTimeRecords(userId) {
    const today = new Date().toLocaleDateString('pt-BR');
    const records = database.timeRecords.filter(record => record.userId === userId);
    
    // Update today's records
    const todayRecord = records.find(record => record.date === today);
    if (todayRecord) {
        morningIn.textContent = todayRecord.morningIn || '--:--';
        morningOut.textContent = todayRecord.morningOut || '--:--';
        afternoonIn.textContent = todayRecord.afternoonIn || '--:--';
        afternoonOut.textContent = todayRecord.afternoonOut || '--:--';
    } else {
        morningIn.textContent = '--:--';
        morningOut.textContent = '--:--';
        afternoonIn.textContent = '--:--';
        afternoonOut.textContent = '--:--';
    }
    
    // Update history table
    timeRecords.innerHTML = '';
    records.slice(0, 5).forEach(record => {
        const row = document.createElement('tr');
        
        const dateCell = document.createElement('td');
        dateCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        dateCell.textContent = record.date;
        
        const morningInCell = document.createElement('td');
        morningInCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        morningInCell.textContent = record.morningIn || '--:--';
        
        const morningOutCell = document.createElement('td');
        morningOutCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        morningOutCell.textContent = record.morningOut || '--:--';
        
        const afternoonInCell = document.createElement('td');
        afternoonInCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        afternoonInCell.textContent = record.afternoonIn || '--:--';
        
        const afternoonOutCell = document.createElement('td');
        afternoonOutCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        afternoonOutCell.textContent = record.afternoonOut || '--:--';
        
        row.appendChild(dateCell);
        row.appendChild(morningInCell);
        row.appendChild(morningOutCell);
        row.appendChild(afternoonInCell);
        row.appendChild(afternoonOutCell);
        
        timeRecords.appendChild(row);
    });
    
    if (records.length === 0) {
        const emptyRow = document.createElement('tr');
        const emptyCell = document.createElement('td');
        emptyCell.className = 'px-6 py-4 text-sm text-gray-500 text-center';
        emptyCell.colSpan = 5;
        emptyCell.textContent = 'Nenhum registro encontrado';
        emptyRow.appendChild(emptyCell);
        timeRecords.appendChild(emptyRow);
    }
}

// Function to register time
function registerTime(type) {
    if (!currentUser) return;
    
    // Check if time is within window
    if (!isTimeInWindow(type)) {
        showMessage(registerMessage, registerIcon, registerText, 'error', 'Fora da janela de tempo permitida para este registro.');
        return;
    }
    
    // Get today's record for user
    const today = new Date().toLocaleDateString('pt-BR');
    const timeString = new Date().toLocaleTimeString('pt-BR', { hour: '2-digit', minute: '2-digit' });
    
    let record = database.timeRecords.find(r => r.userId === currentUser.id && r.date === today);
    
    if (!record) {
        // Create new record
        record = {
            id: database.timeRecords.length + 1,
            userId: currentUser.id,
            date: today,
            morningIn: null,
            morningOut: null,
            afternoonIn: null,
            afternoonOut: null
        };
        
        database.timeRecords.push(record);
    }
    
    // Check if this type is already registered
    if (record[type] !== null) {
        showMessage(registerMessage, registerIcon, registerText, 'error', 'Você já registrou este tipo de ponto hoje.');
        return;
    }
    
    // Update the record
    record[type] = timeString;
    
    // Show success message
    showMessage(registerMessage, registerIcon, registerText, 'success', 'Ponto registrado com sucesso!');
    
    // Update display
    updateEmployeeTimeRecords(currentUser.id);
}

// Function to update admin's employees list
function updateEmployeesList() {
    employeesList.innerHTML = '';
    
    database.users
        .filter(user => user.role === 'employee')
        .forEach(user => {
            const row = document.createElement('tr');
            
            const codeCell = document.createElement('td');
            codeCell.className = 'px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900';
            codeCell.textContent = user.code;
            
            const nameCell = document.createElement('td');
            nameCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
            nameCell.textContent = user.name;
            
            const actionsCell = document.createElement('td');
            actionsCell.className = 'px-6 py-4 whitespace-nowrap text-sm font-medium';
            
            const deleteBtn = document.createElement('button');
            deleteBtn.className = 'text-red-600 hover:text-red-900 mr-3';
            deleteBtn.innerHTML = '<i class="fas fa-trash"></i>';
            deleteBtn.onclick = () => deleteEmployee(user.id);
            
            actionsCell.appendChild(deleteBtn);
            
            row.appendChild(codeCell);
            row.appendChild(nameCell);
            row.appendChild(actionsCell);
            
            employeesList.appendChild(row);
        });
    
    if (employeesList.children.length === 0) {
        const emptyRow = document.createElement('tr');
        const emptyCell = document.createElement('td');
        emptyCell.className = 'px-6 py-4 text-sm text-gray-500 text-center';
        emptyCell.colSpan = 3;
        emptyCell.textContent = 'Nenhum funcionário cadastrado';
        emptyRow.appendChild(emptyCell);
        employeesList.appendChild(emptyRow);
    }
}

// Function to update admin's time records
function updateAdminTimeRecords() {
    adminTimeRecords.innerHTML = '';
    
    const today = new Date().toLocaleDateString('pt-BR');
    const todayRecords = database.timeRecords.filter(record => record.date === today);
    
    // For each user, ensure there's a record for today
    database.users.forEach(user => {
        if (user.role === 'employee') {
            let record = todayRecords.find(r => r.userId === user.id);
            
            if (!record) {
                record = {
                    id: database.timeRecords.length + 1,
                    userId: user.id,
                    date: today,
                    morningIn: null,
                    morningOut: null,
                    afternoonIn: null,
                    afternoonOut: null
                };
                
                database.timeRecords.push(record);
                todayRecords.push(record);
            }
        }
    });
    
    todayRecords.forEach(record => {
        const user = database.users.find(u => u.id === record.userId);
        if (!user || user.role !== 'employee') return;
        
        const row = document.createElement('tr');
        
        const codeCell = document.createElement('td');
        codeCell.className = 'px-6 py-4 whitespace-nowrap text-sm font-medium text-gray-900';
        codeCell.textContent = user.code;
        
        const nameCell = document.createElement('td');
        nameCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        nameCell.textContent = user.name;
        
        const dateCell = document.createElement('td');
        dateCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        dateCell.textContent = record.date;
        
        const morningInCell = document.createElement('td');
        morningInCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        morningInCell.textContent = record.morningIn || 'PENDENTE';
        
        const morningOutCell = document.createElement('td');
        morningOutCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        morningOutCell.textContent = record.morningOut || 'PENDENTE';
        
        const afternoonInCell = document.createElement('td');
        afternoonInCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        afternoonInCell.textContent = record.afternoonIn || 'PENDENTE';
        
        const afternoonOutCell = document.createElement('td');
        afternoonOutCell.className = 'px-6 py-4 whitespace-nowrap text-sm text-gray-500';
        afternoonOutCell.textContent = record.afternoonOut || 'PENDENTE';
        
        row.appendChild(codeCell);
        row.appendChild(nameCell);
        row.appendChild(dateCell);
        row.appendChild(morningInCell);
        row.appendChild(morningOutCell);
        row.appendChild(afternoonInCell);
        row.appendChild(afternoonOutCell);
        
        adminTimeRecords.appendChild(row);
    });
    
    if (adminTimeRecords.children.length === 0) {
        const emptyRow = document.createElement('tr');
        const emptyCell = document.createElement('td');
        emptyCell.className = 'px-6 py-4 text-sm text-gray-500 text-center';
        emptyCell.colSpan = 7;
        emptyCell.textContent = 'Nenhum registro encontrado para hoje';
        emptyRow.appendChild(emptyCell);
        adminTimeRecords.appendChild(emptyRow);
    }
}

// Function to add new employee
function addEmployee() {
    const code = employeeCode.value.trim();
    const name = employeeNameInput.value.trim();
    const password = employeePassword.value.trim();
    
    if (!code || !name || !password) {
        showMessage(employeeMessage, employeeIcon, employeeText, 'error', 'Preencha todos os campos!');
        return;
    }
    
    // Check if code already exists
    if (database.users.some(user => user.code === code)) {
        showMessage(employeeMessage, employeeIcon, employeeText, 'error', 'Matrícula já cadastrada!');
        return;
    }
    
    // Add new employee
    const newEmployee = {
        id: database.users.length + 1,
        code,
        name,
        password,
        role: 'employee'
    };
    
    database.users.push(newEmployee);
    
    // Clear form
    employeeCode.value = '';
    employeeNameInput.value = '';
    employeePassword.value = '';
    
    // Show success message
    showMessage(employeeMessage, employeeIcon, employeeText, 'success', 'Funcionário cadastrado com sucesso!');
    
    // Update employees list
    updateEmployeesList();
    
    // Hide form after 3 seconds
    setTimeout(() => {
        addEmployeeForm.classList.add('hidden');
    }, 3000);
}

// Function to delete employee
function deleteEmployee(id) {
    if (confirm('Tem certeza que deseja excluir este funcionário? Esta ação não pode ser desfeita.')) {
        // Find employee index
        const index = database.users.findIndex(user => user.id === id);
        
        if (index !== -1) {
            // Remove employee
            database.users.splice(index, 1);
            
            // Also remove time records for this employee
            database.timeRecords = database.timeRecords.filter(record => record.userId !== id);
            
            // Update UI
            updateEmployeesList();
            updateAdminTimeRecords();
            
            // Show success message
            showMessage(employeeMessage, employeeIcon, employeeText, 'success', 'Funcionário excluído com sucesso!');
        }
    }
}

// Function to generate PDF report
function generatePDFReport() {
    const { jsPDF } = window.jspdf;
    const doc = new jsPDF();
    
    // Report title
    doc.setFontSize(18);
    doc.text('Relatório de Ponto - ' + new Date().toLocaleDateString('pt-BR'), 105, 20, { align: 'center' });
    
    // Company info
    doc.setFontSize(12);
    doc.text('UniSenai - Joinville', 105, 30, { align: 'center' });
    doc.text('Análise e Desenvolvimento de Sistemas', 105, 36, { align: 'center' });
    
    // Current date and time
    doc.setFontSize(10);
    doc.text('Gerado em: ' + new Date().toLocaleString('pt-BR'), 14, 45);
    
    // Table data
    const today = new Date().toLocaleDateString('pt-BR');
    const todayRecords = database.timeRecords.filter(record => record.date === today);
    const data = [];
    
    // Header row
    data.push([
        'Matrícula',
        'Nome',
        'Ent. Manhã',
        'Saí. Manhã',
        'Ent. Tarde',
        'Saí. Tarde'
    ]);
    
    // Data rows
    todayRecords.forEach(record => {
        const user = database.users.find(u => u.id === record.userId);
        if (!user || user.role !== 'employee') return;
        
        data.push([
            user.code,
            user.name,
            record.morningIn || 'PENDENTE',
            record.morningOut || 'PENDENTE',
            record.afternoonIn || 'PENDENTE',
            record.afternoonOut || 'PENDENTE'
        ]);
    });
    
    // Generate table
    doc.autoTable({
        head: [data[0]],
        body: data.slice(1),
        startY: 50,
        theme: 'grid',
        headStyles: {
            fillColor: [51, 103, 214], // blue
            textColor: 255,
            fontStyle: 'bold'
        },
        alternateRowStyles: {
            fillColor: [240, 240, 240]
        },
        styles: {
            cellPadding: 5,
            fontSize: 10,
            valign: 'middle'
        },
        columnStyles: {
            0: { cellWidth: 25 },
            1: { cellWidth: 45 },
            2: { cellWidth: 25 },
            3: { cellWidth: 25 },
            4: { cellWidth: 25 },
            5: { cellWidth: 25 }
        }
    });
    
    // Footer
    doc.setFontSize(8);
    doc.text('Sistema de Registro de Ponto - Desenvolvido para desafio técnico', 105, doc.internal.pageSize.height - 10, { align: 'center' });
    
    // Save the PDF
    doc.save('relatorio_ponto_' + today.replace(/\//g, '-') + '.pdf');
}

// Event listeners
loginBtn.addEventListener('click', () => {
    const user = loginUser.value.trim();
    const password = loginPassword.value.trim();
    
    if (!user || !password) {
        alert('Preencha matrícula e senha!');
        return;
    }
    
    // Find user
    const foundUser = database.users.find(u => u.code === user && u.password === password);
    
    if (!foundUser) {
        alert('Matrícula ou senha incorretos!');
        return;
    }
    
    // Login successful
    currentUser = foundUser;
    
    // Hide login screen
    loginScreen.classList.add('hidden');
    
    // Show appropriate dashboard
    if (currentUser.role === 'admin') {
        employeeDashboard.classList.add('hidden');
        adminDashboard.classList.remove('hidden');
        
        // Update admin UI
        updateEmployeesList();
        updateAdminTimeRecords();
    } else {
        adminDashboard.classList.add('hidden');
        employeeDashboard.classList.remove('hidden');
        
        // Update employee UI
        employeeName.textContent = currentUser.name;
        updateEmployeeTimeRecords(currentUser.id);
    }
});

logoutBtn.addEventListener('click', () => {
    currentUser = null;
    employeeDashboard.classList.add('hidden');
    loginScreen.classList.remove('hidden');
    loginUser.value = '';
    loginPassword.value = '';
});

adminLogoutBtn.addEventListener('click', () => {
    currentUser = null;
    adminDashboard.classList.add('hidden');
    loginScreen.classList.remove('hidden');
    loginUser.value = '';
    loginPassword.value = '';
});

addEmployeeBtn.addEventListener('click', () => {
    addEmployeeForm.classList.toggle('hidden');
    employeeMessage.classList.add('hidden');
});

saveEmployeeBtn.addEventListener('click', addEmployee);

morningInBtn.addEventListener('click', () => registerTime('morningIn'));
morningOutBtn.addEventListener('click', () => registerTime('morningOut'));
afternoonInBtn.addEventListener('click', () => registerTime('afternoonIn'));
afternoonOutBtn.addEventListener('click', () => registerTime('afternoonOut'));

generateReportBtn.addEventListener('click', generatePDFReport);

// Search functionality
searchEmployee.addEventListener('input', () => {
    const searchTerm = searchEmployee.value.toLowerCase();
    const rows = employeesList.querySelectorAll('tr');
    
    rows.forEach(row => {
        const cells = row.querySelectorAll('td');
        let match = false;
        
        cells.forEach(cell => {
            if (cell.textContent.toLowerCase().includes(searchTerm)) {
                match = true;
            }
        });
        
        if (match || row.querySelector('td[colspan]')) {
            row.style.display = '';
        } else {
            row.style.display = 'none';
        }
    });
});

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    updateCurrentTime();
    updateAdminCurrentDate();
});