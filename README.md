# Retail_Demo - Aplicación de Consulta de Precios

La Retail_Demo es una aplicación de consulta de precios diseñada para proporcionar información sobre los precios finales y tarifas aplicables a productos de una cadena en un rango de fechas determinado. La aplicación está desarrollada en Spring Boot y utiliza una base de datos en memoria H2 para almacenar los datos. A continuación se detallan los requisitos y las instrucciones para ejecutar y probar la aplicación.

## Requisitos

- Java Development Kit (JDK) 11 o superior.
- Maven para compilar y ejecutar la aplicación.
- Git para clonar el repositorio de la aplicación.

## Instrucciones

1. Clonar el repositorio de la aplicación desde GitHub:

   ```bash
   git clone https://github.com/Naxo85/retail_demo.git
   ```

2. Navegar al directorio del proyecto:

   ```bash
   cd retail_demo
   ```

3. Compilar la aplicación usando Maven:

   ```bash
   mvn clean package
   ```

4. Ejecutar la aplicación:

   ```bash
   java -jar target/retail-0.0.1-SNAPSHOT.jar
   ```

5. La aplicación estará disponible en el siguiente endpoint REST:

   ```
   GET /prices?date={fecha}&productId={idProducto}&brandId={idCadena}
   ```

   - `{fecha}`: Fecha de aplicación en formato "yyyy-MM-dd HH:mm:ss".
   - `{idProducto}`: Identificador del producto.
   - `{idCadena}`: Identificador de la cadena (marca).

6. Realizar las siguientes peticiones al servicio para validar los resultados:

   - **Test 1:** Petición a las 10:00 del día 14 del producto 35455 para la cadena 1 (ZARA).
   - **Test 2:** Petición a las 16:00 del día 14 del producto 35455 para la cadena 1 (ZARA).
   - **Test 3:** Petición a las 21:00 del día 14 del producto 35455 para la cadena 1 (ZARA).
   - **Test 4:** Petición a las 10:00 del día 15 del producto 35455 para la cadena 1 (ZARA).
   - **Test 5:** Petición a las 21:00 del día 16 del producto 35455 para la cadena 1 (ZARA).

## Detalles de la Base de Datos

La base de datos en memoria H2 está preconfigurada con datos de ejemplo. Tiene dos tablas: BRAND y PRICES. 
Entre los datos de ejemplo encontramos las siguientes entradas en la tabla PRICES:

```
Tabla: PRICES

| BRAND_ID | START_DATE               | END_DATE                 | PRICE_LIST | PRODUCT_ID | PRIORITY | PRICE | CURR |
|----------|--------------------------|--------------------------|------------|------------|----------|-------|------|
| 1        | 2020-06-14 00:00:00.000  | 2020-12-31 23:59:59.000  | 1          | 35455      | 0        | 35.50 | EUR  |
| 1        | 2020-06-14 15:00:00.000  | 2020-06-14 18:30:00.000  | 2          | 35455      | 1        | 25.45 | EUR  |
| 1        | 2020-06-15 00:00:00.000  | 2020-06-15 11:00:00.000  | 3          | 35455      | 1        | 30.50 | EUR  |
| 1        | 2020-06-15 16:00:00.000  | 2020-12-31 23:59:59.000  | 4          | 35455      | 1        | 38.95 | EUR  |
```


## Notas adicionales

- Si deseas modificar los datos de ejemplo o agregar nuevos campos a la tabla, puedes hacerlo en el archivo `data.sql` dentro de la carpeta de resources del proyecto, y a continuación relanzar la aplicación
- Si deseas abrir la app en un IDE (por ejemplo eclipse), es necesario instalar [Lombok](https://projectlombok.org/) en el mismo
