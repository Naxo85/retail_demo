-- Crear la tabla "prices"
--CREATE TABLE prices (
--  id INT AUTO_INCREMENT PRIMARY KEY,
--  brand_id INT,
--  start_date TIMESTAMP,
--  end_date TIMESTAMP,
--  price_list INT,
--  product_id INT,
--  priority INT,
--  price DOUBLE,
--  currency VARCHAR(255)
--);

-- Insertar datos de ejemplo en la tabla "prices"
 INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
 VALUES
   (1, '2023-06-01 00:00:00', '2023-06-30 23:59:59', 1, 35455, 0, 35.50, 'EUR'),
   (1, '2023-06-15 16:00:00', '2023-06-15 18:30:00', 2, 35455, 1, 25.45, 'EUR'),
   (1, '2023-06-15 00:00:00', '2023-12-31 23:59:59', 3, 35455, 1, 30.50, 'EUR'),
   (1, '2023-06-15 00:00:00', '2023-06-15 23:59:59', 4, 35455, 1, 38.95, 'EUR'),
   (1, '2023-06-15 00:00:00', '2023-06-30 23:59:59', 5, 35455, 1, 40.00, 'EUR');
