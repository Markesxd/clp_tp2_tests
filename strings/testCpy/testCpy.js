const { argv } = require('process')
const readline = require('readline')

const strings = []
const n = argv[2]
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
});


rl.on('line', (line) => {
    strings.push(line)
});

rl.once('close', () => {
    const t1 = process.hrtime()[1]
    let buffer = '';
    for(let i = 0; i < n; i++){
        buffer = strings[i]
    }
    const t2 = process.hrtime()[1]
    console.log((t2 - t1) / 1000000)
});