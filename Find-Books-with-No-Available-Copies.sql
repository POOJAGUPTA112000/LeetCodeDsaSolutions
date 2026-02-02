1# Write your MySQL query statement below
2select t1.book_id,t1.title,t1.author,t1.genre,t1.publication_year,count(t2.book_id) as current_borrowers
3from library_books t1 join borrowing_records t2
4 on t1.book_id =t2.book_id 
5 where t2.return_date is null 
6 group by t1.book_id,
7--  t1.title,
8--  t1.author,
9--  t1.genre,
10--  t1.publication_year,
11 t1.total_copies
12 having t1.total_copies= count(t2.book_id) 
13 order by current_borrowers desc , t1.title;