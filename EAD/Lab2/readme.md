# Singleton Pattern

Singleton pattern is a creational deign pattern that restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine. The singleton class must provide a global access point to get the instance of the class. Singleton pattern is used for logging, drivers objects, caching and thread pool.

## Java Singleton Pattern Implementation

To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.

- Private constructor to restrict instantiation of the class from other classes.
- Private static variable of the same class that is the only instance of the class.
- Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.


### Eager Initialization

```
public class Singleton {
    
    private static final Singleton instance = new Singleton();

    // private constructor to avoid client applications using the constructor
    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }
}

```

## Lazy Initialization


```

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
```

