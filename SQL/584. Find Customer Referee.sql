-- https://leetcode.com/problems/find-customer-referee/?envType=study-plan-v2&envId=top-sql-50

/*
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| referee_id  | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.
*/

SELECT name FROM customer
WHERE referee_id != 2 or referee_id IS null;
