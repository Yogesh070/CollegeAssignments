# File Handling in Java

Java FileWriter and FileReader classes are used to write and read data from text files (they are Character Stream classes).Reading and writing take place character by character, which increases the number of I/O operations and effects performance of the system.BufferedWriter can be used along with FileWriter to improve speed of execution.

## Example of FileWriter

```javascript
import java.io.FileWriter;
import java.io.IOException;
class CreateTextFiles{
    
    public static void main(String[] args) throws IOException {
        String string_A=" aa \n bb \n cc";
        String string_B=" 11 \n 22 \n 33";
    //  System.out.println(string_A.length());
        FileWriter fa=new FileWriter("a.txt");
        FileWriter fb=new FileWriter("b.txt");
        for (int i=0; i< string_A.length();i++)
        {
            fa.write(string_A.charAt(i));
        }
        for (int i=0; i< string_B.length();i++)
        {
            fb.write(string_B.charAt(i));
        }
        fa.close();
        fb.close();
    }
}
```

## Example of FileReader

```javascript
// Reading data from a file using FileReader 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
class ReadFile 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// variable declaration 
		int ch; 

		// check if File exists or not 
		FileReader fr=null; 
		try
		{ 
			fr = new FileReader("text"); 
		} 
		catch (FileNotFoundException fe) 
		{ 
			System.out.println("File not found"); 
		} 

		// read from FileReader till the end of file 
		while ((ch=fr.read())!=-1) 
			System.out.print((char)ch); 

		// close the file 
		fr.close(); 
	} 
} 
```