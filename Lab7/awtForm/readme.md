# Abstract Window Toolkit

Java AWT (Abstract Window Toolkit) is an API to develop GUI or window-based applications in java.

Java AWT components are platform-dependent i.e. components are displayed according to the view of operating system. AWT is heavyweight i.e. its components are using the resources of OS.

![Image of AWT hierarchy](https://static.javatpoint.com/images/awthierarchy.jpg)

## Useful Methods of Component class

Method | Description
-------|------------
public void add(Component c) | inserts a component on this component.
public void setSize(int width,int height) | sets the size (width and height) of the component.
public void setLayout(LayoutManager m) | defines the layout manager for the component.
public void setVisible(boolean status) | changes the visibility of the component, by default false.

### To create simple awt example, you need a frame. There are two ways to create a frame in AWT.

- By extending Frame class (inheritance)
- By creating the object of Frame class (association)


### Example: AWT by extending Frame class (inheritance)

```javascript
import java.awt.*;  
class First extends Frame{  
First(){  
Button b=new Button("click me");  
b.setBounds(30,100,80,30);// setting button position  
add(b);//adding button into frame  
setSize(300,300);//frame size 300 width and 300 height  
setLayout(null);//no layout manager  
setVisible(true);//now frame will be visible, by default not visible  
}  
public static void main(String args[]){  
First f=new First();  
}}  
```

### Example: AWT by creating the object of Frame class (association)

```javascript
import java.awt.*;  
class First2{  
First2(){  
Frame f=new Frame();  
Button b=new Button("click me");  
b.setBounds(30,50,80,30);  
f.add(b);  
f.setSize(300,300);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[]){  
First2 f=new First2();  
}}  
```
