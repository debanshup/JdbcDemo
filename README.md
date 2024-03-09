This repository is about java JDBC concepts

The program allows CUSTOMERS to insert their data (name,mobile_no,address,pin_code) and DB ADMIN to access the infos provided by customers.




Prerequisite(S) to run the program ->

create a table ' Customer ' by running the following SQL command ->

CREATE TABLE Customers (
    name VARCHAR(255),
    mobile_no VARCHAR(15),
    full_address VARCHAR(255),
    pin_code VARCHAR(6)
);