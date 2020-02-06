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