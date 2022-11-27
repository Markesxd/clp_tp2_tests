const { argv } = require('process')
const readline = require('readline')

const floats = []
const n = argv[2]
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
  terminal: false
});


rl.on('line', (line) => {
    floats.push(parseFloat(line))
});

rl.once('close', () => {
    const t1 = process.hrtime()[1]
    let num
    for(let i = 0; i < n; i += 2){
      num = floats[i] / floats[i + 1]
    }
    const t2 = process.hrtime()[1]
    console.log((t2 - t1) / 1000000)
});