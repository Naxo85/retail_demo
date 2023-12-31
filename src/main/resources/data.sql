
-- EL ARCHIVO DATA.SQL ES UN ARCHIVO DE INICIALIZACIÓN DE DATOS QUE SE UTILIZA EN SPRING BOOT CON UNA BASE DE DATOS EMBEBIDA, COMO H2 EN MEMORIA.
-- EN ESTE ARCHIVO, SE DEFINEN INSTRUCCIONES SQL PARA INSERTAR DATOS DE PRUEBA EN LA BASE DE DATOS DURANTE EL ARRANQUE DE LA APLICACIÓN.

-- Creación de la tabla brands
--CREATE TABLE brands (
--  id INT PRIMARY KEY,
--  name VARCHAR(255)
--);

-- Crear la tabla "prices"
--CREATE TABLE prices (
--  id INT AUTO_INCREMENT PRIMARY KEY,
--  brand_id INT,
--  start_date DATETIME,
--  end_date DATETIME,
--  price_list INT,
--  product_id INT,
--  priority INT,
--  PRICE DECIMAL(19, 2),
--  currency VARCHAR(3)
--);

-- Añadir foreign key a la columna brand_id en la tabla prices
--ALTER TABLE prices
--ADD CONSTRAINT fk_brand_id
--FOREIGN KEY (brand_id) REFERENCES brands(id);

-- Inserción de las marcas
INSERT INTO brands (id, name)
VALUES
  (1, 'ZARA'),
  (2, 'Pull&Bear'),
  (3, 'Massimo Dutti'),
  (4, 'Bershka'),
  (5, 'Stradivarius'),
  (6, 'Oysho'),
  (7, 'Zara Home'),
  (8, 'Uterqüe'); 
  
-- Insertar datos de ejemplo en la tabla "prices"
INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr)
VALUES
  -- Zara
  (1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR'),
  (1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR'),
  (1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR'),
  (1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR'),
  (1, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 12345, 0, 50.00, 'EUR'),
  (1, '2020-06-10 00:00:00', '2020-06-10 23:59:59', 2, 12345, 2, 45.00, 'EUR'),
  (1, '2020-06-20 00:00:00', '2020-06-30 23:59:59', 3, 12345, 1, 55.00, 'EUR'),
  (1, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 98765, 0, 60.00, 'EUR'),
  (1, '2020-06-05 00:00:00', '2020-06-25 23:59:59', 2, 98765, 1, 55.00, 'EUR'),

  -- Pull&Bear
  (2, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 24680, 0, 25.00, 'EUR'),
  (2, '2020-06-10 00:00:00', '2020-06-15 23:59:59', 2, 24680, 1, 20.00, 'EUR'),
  (2, '2020-06-15 00:00:00', '2020-06-30 23:59:59', 1, 33333, 0, 22.50, 'EUR'),

  -- Massimo Dutti
  (3, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 13579, 0, 75.00, 'EUR'),
  (3, '2020-06-10 00:00:00', '2020-06-15 23:59:59', 2, 13579, 1, 70.00, 'EUR'),

  -- Bershka
  (4, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 56789, 0, 30.00, 'EUR'),

  -- Stradivarius
  (5, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 98765, 0, 35.00, 'EUR'),
  (5, '2020-06-10 00:00:00', '2020-06-15 23:59:59', 2, 98765, 1, 30.00, 'EUR'),
  (5, '2020-06-15 00:00:00', '2020-06-30 23:59:59', 1, 11111, 4, 32.50, 'EUR'),

  -- Oysho
  (6, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 75319, 0, 45.00, 'EUR'),
  (6, '2020-06-10 00:00:00', '2020-06-15 23:59:59', 2, 75319, 1, 40.00, 'EUR'),

  -- Zara Home
  (7, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 75319, 0, 85.00, 'EUR'),

  -- Uterqüe
  (8, '2020-06-01 00:00:00', '2020-06-30 23:59:59', 1, 15975, 0, 55.00, 'EUR'),
  (8, '2020-06-10 00:00:00', '2020-06-15 23:59:59', 2, 15975, 1, 50.00, 'EUR');
