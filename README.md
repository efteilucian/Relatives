This Java class is designed to manage database operations, specifically creating and switching to a database using JDBC for MariaDB.
It includes a constructor that takes the name of the database as a parameter and executes the necessary SQL queries to create and switch to the database.
The class also contains a method for displaying detailed information about SQL exceptions.
The main method is used to instantiate the EfteiLucian class with the provided database name from the command line.
It's important to note that this class performs database operations without considering security measures such as parameterized queries. 
In a production environment, it is advisable to use prepared statements to prevent SQL injection attacks.
