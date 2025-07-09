const EventEmitter = require('events');

class ChatRoom extends EventEmitter {
    join(user) {
        this.emit('userJoined',user);
    }

    sendMessage(user,message) {
        this.emit('message',{user,message});
    }
}

const chatRoom = new ChatRoom();
chatRoom.on('userJoin ed',(user) => {
    console.log(`${user} entrou na sala de chat.`);
});

chatRoom.on('message',({user,message}) => {
    console.log(`${user} diz: ${message}`);
});

chatRoom.join('Alice');
chatRoom.sendMessage('Alice', 'Olá a todos!');
chatRoom.join('Bob');
chatRoom.sendMessage('Bob','Oi, Alice!');