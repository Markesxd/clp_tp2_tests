<?php

$n = $argv[1];
$f = fopen('php://stdin', 'r');
$strings = [];
while($line = fgets($f)){
    $strings[] = $line;
}

$t1 = microtime(true);
for($i = 0; $i < $n; $i += 2){
    $strings[$i] = $strings[$i] . $strings[$i + 1];
}
$t2 = microtime(true);

echo ($t2 - $t1) . "\n";