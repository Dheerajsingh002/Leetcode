# Write your MySQL query statement below
SELECT firstName, lastName, city, state FROM Address
RIGHT JOIN Person
ON Person.personId = Address.personId;
