#!/bin/sh

EX_NR=$1
zip -r ABMT_Exercise"$EX_NR"_Solution.zip src/ch/ethz/ivt/abmt/exercises$EX_NR/
