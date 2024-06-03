const fs = require('fs')

const content = ' UNISENAI 2024!'

fs.appendFile('novo.txt', content, err => {
  if (err) {
    console.error(err)
    return
  }
  
  
})
