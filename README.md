# Car Rental System

## Overview

This project is a Car Rental System developed using Object-Oriented Programming (OOP) principles in Java. The system is designed to manage car rentals, customer details, and rental transactions efficiently. It encapsulates the data and behaviors in separate classes for modularity and maintainability.

## Classes

The project includes three main classes:

1. **Car**
2. **Customer**
3. **RentalAgency**

### Car Class

The `Car` class represents a car with its details such as number plate, brand, and make. It includes methods to input and retrieve these details.

### Customer Class

The `Customer` class represents a customer with personal details like ID number, first name, last name, and phone number. It includes methods to input and retrieve these details.

### RentalAgency Class

The `RentalAgency` class handles rental operations, including calculating the total rental cost based on the number of hours the car is rented.

## How to Use

1. **Clone the Repository:**

    ```bash
    git clone <repository-url>
    cd CarRentalSystem
    ```

2. **Compile the Code:**

    ```bash
    javac Car.java Customer.java RentalAgency.java
    ```

3. **Run the Application:**

    ```bash
    java RentalAgency
    ```

4. **Input Details:**

    Follow the prompts to enter car details, customer details, and rental hours.

5. **Output:**

    The system will display the rental summary and the total payable amount.

## Example

Here's an example of how the system works:

```plaintext
Enter the number plate: XYZ123
Enter the car brand: Toyota
Enter the car make: Corolla

Customer details
Enter the customer's ID number: 12345678
Enter the customer's first name: John
Enter the customer's last name: Doe
Enter the customer's phone number: 9876543210

Enter the hours: 5

    John Doe of ID number 12345678 and phone number 09876543210, has hired the car Toyota Corolla of plate number XYZ123.
    As per our agreement of him/her having the car for 5 hrs, the total payable amount is Ksh5000/=
