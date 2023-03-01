# Java Servlet

Java Servlet is a Java programming language class that extends the capabilities of a server hosting the Java-based web application. It enables a Java-based web application to dynamically generate HTML, XML, or any other type of content that can be sent to a client's web browser. Java Servlets can be used to process requests and generate dynamic content, such as responding to an HTML form, accessing a database, or sending and receiving cookies.

Implementation:
- Create Form:
- Create a dynamic web project inside the Eclipse IDE. Note: check the generate web xml file when creating the project
- Create a package for my demo I have created a package as lab.
- Create a java file inside the package.
- Create a class that extends HttpServlet from jakarta.servlet.http package
- Create a doGet function with HttpServletRequest and HttpServletResponse as argument.
- Create a PrintWriter using the HttpServletResponse argument's getWriter() function and use the PrintWriter to print html tags.
- Add a annotation @WebServlet("/somepath") to create a web xml info of the class.
- Run the file or the whole project.
```
package lab;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class FormHandle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>Servlet Form</h1>");
		pw.print("<form>");
		
		pw.print("<div style='margin-bottom: 5px;'><input type='text' placeholder='name' /></div>");
		pw.print("<div style='margin-bottom: 5px;'><input type='number' placeholder='age' /></div>");
		pw.print("<div style='margin-bottom: 5px;'><input type='email' placeholder='email' /></div>");
		
		pw.print("</form>");
		pw.print("</body></html>");
		
		pw.close();
	}
}

```
- Create a servlet to handle the form data:
  
Create server:
- Download the Tomcat server of apache from internet.
- Go to the window menu of Eclispe IDE and select the Show View submenu and click on the servers option.
- A window will appear at the bottom, right click on the window and create a new server.
For that select the apache tomcat server version you downloaded from a pop up window that will appear.
- Give the path to the tomcat bin folder
- Right click the newely created server and click run server.