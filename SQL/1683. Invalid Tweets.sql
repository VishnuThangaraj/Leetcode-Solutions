-- https://leetcode.com/problems/invalid-tweets/?envType=study-plan-v2&envId=top-sql-50

/*
+----------------+---------+
| Column Name    | Type    |
+----------------+---------+
| tweet_id       | int     |
| content        | varchar |
+----------------+---------+
tweet_id is the primary key (column with unique values) for this table.
This table contains all the tweets in a social media app.
*/

SELECT tweet_id FROM tweets
WHERE LENGTH(content) > 15;
