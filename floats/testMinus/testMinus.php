<?php

$n = $argv[1];
$f = fopen('php://stdin', 'r');
$floats = [];
while($line = fgets($f)){
    $floats[] = floatval($line);
}

$t1 = microtime(true);
$num;
for($i = 0; $i < $n; $i += 2){
    $num = $floats[$i] - $floats[$i + 1];
}
$t2 = microtime(true);

echo ($t2 - $t1) . "\n";