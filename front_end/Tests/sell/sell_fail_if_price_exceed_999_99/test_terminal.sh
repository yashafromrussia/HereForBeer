#!/bin/bash
red='\033[0;31m'
green='\033[0;32m'
success='\u2713'
fail='\u2717'
NC='\033[0m' # No Color
./../../../a.out <input.inp >output.bto
DIFF=$(diff -q -w output.bto expected_output.bto)
if [ "$DIFF" = "" ];then
	echo -e ${green}$success PASS - SELL FAIL IF PRICE EXCEEDS 999.99: TERMINAL OUTPUT ${NC}
else
	echo -e ${red}$fail FAIL - SELL FAIL IF PRICE EXCEEDS 999.99: TERMINAL OUTPUT ${NC}
fi
