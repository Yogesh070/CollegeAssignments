# Java Applet

Applet is a special type of program that is embedded in the webpage to generate the dynamic content. It runs inside the browser and works at client side.

## Advantage of Applet

There are many advantages of applet. They are as follows:

- It works at client side so less response time.
- Secured
- It can be executed by browsers running under many plateforms, including Linux, Windows, Mac Os etc.

## Lifecycle of Java Applet

1. Applet is initialized.
2. Applet is started.
3. Applet is painted.
4. Applet is stopped.
5. Applet is destroyed.

### Java.applet.Applet class

For creating any applet java.applet.Applet class must be inherited. It provides 4 life cycle methods of applet.

* public void init(): is used to initialized the Applet. It is invoked only once.
* public void start(): is invoked after the init() method or browser is maximized. It is used to start the Applet.
* public void stop(): is used to stop the Applet. It is invoked when Applet is stop or browser is minimized.
* public void destroy(): is used to destroy the Applet. It is invoked only once.

#### Applet example:

First.class

```javascript

import java.applet.Applet;  
import java.awt.Graphics;  
public class First extends Applet{  
  
public void paint(Graphics g){  
g.drawString("welcome",150,150);  
}  
  
}
```
#### Html code:

```javascript
<html>  
<body>  
<applet code="First.class" width="300" height="300">  
</applet>  
</body>  
</html> 
```

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