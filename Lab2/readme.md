# Constructor in Java

Constructor is a block of code that initializes the newly created object. A constructor resembles an instance method in java but it’s not a method as it doesn’t have a return type.It is of two types:
* Default constructor
* Parameterized constructor

## Default constuctor

If you do not implement any constructor in your class, Java compiler inserts a default constructor into your code on your behalf. This constructor is known as default constructor. 

### Example of default constructor

```javascript
public class Hello {
   String name;
   //Constructor
   Hello(){
      this.name = "hello world";
   }
   public static void main(String[] args) {
      Hello obj = new Hello();
      System.out.println(obj.name);
   }
}
```

## Parameterized constructor
Constructor with arguments(or you can say parameters) is known as Parameterized constructor.

### Example of Parameterized constructor
```javascript
class Example3
{
      private static int var;
      public Example3(int num)
      {
             var=num;
      }
      public static void main(String args[])
      {
              Example3 myobj = new Example3(3);
              System.out.println("value of var is:"+ var);
      }
}
```
### Output

value of var is 3