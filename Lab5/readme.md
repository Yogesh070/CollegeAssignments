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
