# LAB 3: TYPES OF VARIABLES, INHERITANCE AND ABSTRACT CLASS

# THEORY:

## VARIABLE

Variables are the name given to a memory location which hold the values while the program  is executed.

## TYPES OF VARIABLES

* Local Variables
A variable defined within a block or method or constructor is called local variable.

* Instance Variables
Instance variables are non-static variables and are declared in a class outside any method, constructor or block.These variables are created when an object of the class is created and destroyed when the object is destroyed.

* Static Variables
These variables are declared similarly as instance variables, the difference is that static variables are declared using the static keyword within a class outside any method constructor or block.
You can create a single copy of static variable and share among all the instances of the class.

### Implentation of types of Variables

```javascript
public class Variable{ 
	int b=5; //instance variable
	static int a=6; //static variable
	public void method() 
	{ 	
		int a = 10; // local variable age 
		System.out.println(a); 
	} 

	public static void main(String args[]) 
	{ 
		Variable obj = new Variable(); 
		obj.method(); 
		System.out.println(obj.b);
		System.out.println(a); //calling static variable  
	} 
}
```

## INHERITANCE IN JAVA

Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

### SYNTAX

```javascript
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
}  
```
## TYPES OF INHERITANCE

* Single Inheritance
* Multilevel Inheritance
* Hierarchical Inheritance

### Implentation of Single Inheritance
```javascript
class Parent{
    void hi(){
        System.out.println("hello");
    }
}

class child extends Parent{
    void hello(){
        System.out.println("world");
    }
}

class Inherit{
public static void main(String[] args) {
    child obj = new child();
    obj.hello();
    obj.hi();
    
}
}
```

## ABSTRACT CLASS

A class which is declared with the abstract keyword is known as an abstract class in Java.