const Path = require('path')  
const { promises: Fs } = require('fs')

const oldPath = Path.join(__dirname, "novo.txt")  
const newPath = Path.join(__dirname, "ArquivoNovoRenomeado.txt")

await Fs.rename(oldPath, newPath)