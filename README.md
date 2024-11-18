# Here, the following tasks are implemented:
## Task 1:
Create a class that will have a static method.
This method accepts three input parameters: Login, Password, confirmation, Password. All fields have the String data type.
The login length must be less than 20 characters and must not leave spaces.
If the login does not meet these requirements, you must "throw" a WrongLoginException.
The password length must be less than 20 characters, must not leave a space, and must keep at least one digit.
Also, the password and password confirmation must be equal.
If the password does not meet these requirements, you must throw a WrongPasswordException.
The exception classes WrongPasswordException and WrongLoginException are custom exception classes with two constructors - one by default, the second takes the exception message and passes it to the exception class of the constructor.
The method returns true if the values ​​are valid, or false otherwise.
Place classes in packages: classes for checks should be in a separate package, classes for exceptions - in its.
Create a Runner class to test this class.
Let's try to solve the problem using two methods: 1. Out-of-the-box String class methods, such as the contains method. 2. Breaking down the structure of the char array (the toCharArray() string) and performing traversals and checking the array.
