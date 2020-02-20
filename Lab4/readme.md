# Exception Handling in Java

An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time, that disrupts the normal flow of the program’s instructions.\
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the application can be maintained.
There are two types of exception:

- Unchecked Exception

The classes which inherit RuntimeException are known as unchecked exceptions e.g. ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException etc. Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

- Checked Exception

The classes which directly inherit Throwable class except RuntimeException and Error are known as checked exceptions e.g. IOException, SQLException etc. Checked exceptions are checked at compile-time.

## There are 5 keywords used for handling exceptions:

* try

The try keyword is used to specify a block where we should place exception code. The try block must be followed by either catch or finally.

* catch

The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

* throw

The "throw" keyword is used to throw an exception.

* finally

Java finally block is always executed whether exception is handled or not.

* throws

The "throws" keyword is used to declare exceptions. It doesn't throw an exception. It specifies that there may occur an exception in the method. It is always used with method signature.

## Example of Illustration of Exception handling in Java

```javascript
class Exception{
    static int a=6;
    public static void main(String[] args) {
        try {
            a=a/0;
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println("Cannot divide by zero");
        }
        finally{
            System.out.println("this finally block gets executed anyways");
        }
    }
}
```
### Output
Cannot divide by zero\
this finally block gets executed anyways

# Packages In Java

Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.Its uses are:

* Preventing naming conflicts
* Packages can be considered as data encapsulation
* Making searching/locating and usage of classes, interfaces, enumerations and annotations easier

## How package works?

Package names and directory structure are closely related. For example if a package name is college.staff.cse, then there are three directories, college, staff and cse such that cse is present in staff and staff is present college. Also, the directory college is accessible through CLASSPATH variable, i.e., path of parent directory of college is present in CLASSPATH. The idea is to make sure that classes are easy to locate.
