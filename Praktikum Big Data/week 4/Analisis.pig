students = LOAD 'C:/Users/MyWindows10/Downloads/Premier League Points Table 2019-20.csv' USING PigStorage(',') AS (Previous:int, position:int, Club:chararray, Played:int, Won:int, Drawn:int, Lost:int, GF:int, GA:int, GD:int, Points:int);
filtered_students = FILTER students BY Won > 15;
grouped_by_age = GROUP filtered_students BY Lost;
-- DUMP grouped_by_age;
STORE grouped_by_age INTO 'C:/Users/MyWindows10/Downloads/output1' USING PigStorage(',');