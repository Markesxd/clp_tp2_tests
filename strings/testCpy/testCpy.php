<?php

$n = $argv[1];
$f = fopen('php://stdin', 'r');
$strings = [];
while($line = fgets($f)){
    $strings[] = $line;
}

$t1 = microtime(true);
$buffer = '';
for($i = 0; $i < $n; $i += 2){
    $buffer = $strings[$i];
}
$t2 = microtime(true);

echo ($t2 - $t1) . "\n";