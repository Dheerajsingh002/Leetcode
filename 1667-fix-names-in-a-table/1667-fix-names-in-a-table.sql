# Write your MySQL query statement below
select user_id, concat(upper(LEFT(name, 1)), lcase(RIGHT(name, length(name)-1))) as name from Users order by user_id;