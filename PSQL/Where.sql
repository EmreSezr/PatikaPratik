-- WHERE İŞLEMLERİ

--Customers tablosunda "Country" değeri "Ankara" olan verileri getir
SELECT * FROM Customers WHERE Country='Ankara';



--Customers tablosunda "CustomerID" değeri "1" olan verileri getir
SELECT * FROM Customers WHERE CustomerID=1;



-- Customer tablosunda örnek bir pattern arar LIKE 'london' yazsaydık london değerlerini getirecekti
-- % operatorü "a" karakterinin önünde ve sonunda herhangi bir karakter varsa getir demek
SELECT * FROM Customers WHERE City LIKE '%a%';



-- "Exam" tablosunda "FinalNote" değeri 60 ile 100 arasında olanları getir
SELECT * FROM Exam WHERE FinalNote BETWEEN 60 AND 100;



-- Bir sütun içinde birden çok değer belirtmek için "IN" kullanılır
SELECT * FROM Customers WHERE City IN ('Paris','London');



-- "Products" tablosunda değeri "18" olmayanları getir
SELECT * FROM Products WHERE Price != 18;



-- "actor" tablosunda adı "Penelope" olanları veya "Bob" olanları getir
SELECT * FROM actor  WHERE first_name = 'Penelope' OR first_name = 'Bob' ;



-- "film" tablosunda rental_rate değeri "2.99" veya "4.99" olmayanları getir.
SELECT * FROM film WHERE NOT (rental_rate = 4.99 OR rental_rate = 2.99)