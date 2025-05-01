# Write your MySQL query statement below


Select Distinct (author_id) AS id
From Views
Where author_id = viewer_id 
Order By author_id ASC;

