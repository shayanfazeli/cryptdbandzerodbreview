#!/bin/bash
inputfile = "table_values.txt"
cat $inputfile | while read val1, val2, val3; do
	echo "insert into mytablenew(val1, val2, val3) values('$val1', '$val2', '$val3');"
done | mysql -u root -p123 -h 172.16.29.133 -P 3307 mydbnew