import package_one.ClassOne; 
import package_two.ClassTwo; 
  
public class Testing { 
    public static void main(String[] args){ 
        ClassTwo a = new ClassTwo(); 
        ClassOne b = new ClassOne(); 
        a.methodClassTwo(); 
        b.methodClassOne(); 
    } 
} 