# Retail_Demo - Price Query Application

The Retail_Demo is a price query application designed to provide information about final prices and applicable rates for products within a specific date range of a retail chain. The application is developed using Spring Boot and utilizes an in-memory H2 database to store the data. Below are the requirements and instructions to build, run, and test the application.

## Requirements

- Java Development Kit (JDK) 11 or higher.
- Maven to compile and run the application.
- Git to clone the application repository.

## Instructions

1. Clone the application repository from GitHub:

   ```bash
   git clone https://github.com/Naxo85/retail_demo.git
   ```

2. Navigate to the project directory:

   ```bash
   cd retail_demo
   ```

3. Build the application using Maven:

   ```bash
   mvn clean package
   ```

4. Run the application:

   ```bash
   java -jar target/retail-0.0.1-SNAPSHOT.jar
   ```

5. The application will be available at the following REST endpoint:

   ```
   GET /prices?date={date}&productId={productId}&brandId={brandId}
   ```

   - `{date}`: Application date in "yyyy-MM-dd HH:mm:ss" format.
   - `{productId}`: Product identifier.
   - `{brandId}`: Chain (brand) identifier.

6. Perform the following requests to the service to validate the results:

   - **Test 1:** Request at 10:00 on day 14 for product 35455 and chain 1 (ZARA).
   - **Test 2:** Request at 16:00 on day 14 for product 35455 and chain 1 (ZARA).
   - **Test 3:** Request at 21:00 on day 14 for product 35455 and chain 1 (ZARA).
   - **Test 4:** Request at 10:00 on day 15 for product 35455 and chain 1 (ZARA).
   - **Test 5:** Request at 21:00 on day 16 for product 35455 and chain 1 (ZARA).

## Database Details

The in-memory H2 database is preconfigured with example data and has two tables: BRAND and PRICES. 
Among the example data, the following entries exist in the PRICES table:

```
Table: PRICES

| BRAND_ID | START_DATE               | END_DATE                 | PRICE_LIST | PRODUCT_ID | PRIORITY | PRICE | CURR |
|----------|--------------------------|--------------------------|------------|------------|----------|-------|------|
| 1        | 2020-06-14 00:00:00.000  | 2020-12-31 23:59:59.000  | 1          | 35455      | 0        | 35.50 | EUR  |
| 1        | 2020-06-14 15:00:00.000  | 2020-06-14 18:30:00.000  | 2          | 35455      | 1        | 25.45 | EUR  |
| 1        | 2020-06-15 00:00:00.000  | 2020-06-15 11:00:00.000  | 3          | 35455      | 1        | 30.50 | EUR  |
| 1        | 2020-06-15 16:00:00.000  | 2020-12-31 23:59:59.000  | 4          | 35455      | 1        | 38.95 | EUR  |
```


## Additional Notes

- If you want to modify the example data or add new fields to the table, you can do so in the `data.sql` file inside the project's resources folder and then relaunch the application.
- If you want to open the app in an IDE (e.g., Eclipse), it is necessary to install [Lombok](https://projectlombok.org/) in the IDE.
- Additionally, there is an exported Postman file (Price.postman_collection.json) available in the root folder of the project repository. This file contains pre-configured queries that you can import into Postman to test the application's functionality easily.
