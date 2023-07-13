-- 코드를 입력하세요
SELECT a.author_id, a.author_name, b.category, SUM(bs.sales * b.price) as total_sales
FROM book_sales AS bs 
INNER JOIN book AS b ON b.book_id = bs.book_id
INNER JOIN author AS a ON b.author_id = a.author_id
WHERE bs.sales_date BETWEEN '2022-01-01' AND '2022-01-31'
GROUP BY a.author_id, b.category
ORDER BY a.author_id, b.category DESC 

