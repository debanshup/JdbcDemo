**Java JDBC Customer Database**

This repository contains a Java program that demonstrates the use of JDBC (Java Database Connectivity) concepts. The program allows customers to insert their data, including name, mobile number, address, and pin code, into a database. Additionally, it provides functionality for database administrators to access the information inserted by customers.

### Prerequisites

Before running the program, ensure that you have created a table named `Customers` in your database. You can create the table by executing the following SQL command:

```sql
CREATE TABLE Customers (
    name VARCHAR(255),
    mobile_no VARCHAR(15),
    full_address VARCHAR(255),
    pin_code VARCHAR(6)
);
```

### Usage

- When the program is run, customers can insert their data by following the prompts in the console.
- Database administrators can access the inserted customer information by logging in using their credentials.

### Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
