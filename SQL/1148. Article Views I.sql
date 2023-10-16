-- https://leetcode.com/problems/article-views-i/?envType=study-plan-v2&envId=top-sql-50

/*
+---------------+---------+
| Column Name   | Type    |
+---------------+---------+
| article_id    | int     |
| author_id     | int     |
| viewer_id     | int     |
| view_date     | date    |
+---------------+---------+
There is no primary key (column with unique values) for this table, the table may have duplicate rows.
Each row of this table indicates that some viewer viewed an article (written by some author) on some date. 
Note that equal author_id and viewer_id indicate the same person.
*/

SELECT DISTINCT author_id as id 
FROM views
WHERE author_id = viewer_id
ORDER BY author_id ASC;
