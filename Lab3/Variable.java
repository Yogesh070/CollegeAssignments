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
