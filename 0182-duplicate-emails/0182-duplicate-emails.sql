# Write your MySQL query statement below
SELECT email
FROM Person 
GROUP BY EMAIL
HAVING COUNT(email) >1
