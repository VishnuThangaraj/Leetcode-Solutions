-- https://leetcode.com/problems/big-countries/?envType=study-plan-v2&envId=top-sql-50

/*
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| name        | varchar |
| continent   | varchar |
| area        | int     |
| population  | int     |
| gdp         | bigint  |
+-------------+---------+
name is the primary key (column with unique values) for this table.
Each row of this table gives information about the name of a country, the continent to which it belongs, its area, the population, and its GDP value.
*/

SELECT name, population, area FROM world
WHERE area >= 3000000 OR population >= 25000000;
