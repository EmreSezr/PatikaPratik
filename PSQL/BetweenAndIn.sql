

-- Örnekte "Products" tablosunun içinde "price" değerinin 10 ile 20 arasındaki değerlerini gösterir.
SELECT * FROM Products WHERE Price  BETWEEN 10 AND 20;


-- Örnekte tam tersi olarak 10-20 arasındaki değerler haricindekileri gösterir.
SELECT * FROM Products WHERE Price NOT BETWEEN 10 AND 20;


-- "Customers" tablosunda "Country" değerleri Germany,France ve UK olanları gösterir.
SELECT * FROM Customers WHERE Country IN ('Germany', 'France', 'UK');


--"Products" tablosunda "price" değeri 10-20 arasındaki ve "CategoryId" değeri 1,2,3 olmayanları gösterir.
SELECT * FROM Products
WHERE Price BETWEEN 10 AND 20
AND CategoryID NOT IN (1,2,3);

