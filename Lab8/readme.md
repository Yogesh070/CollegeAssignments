# What is an Event?

Change in the state of an object is known as event i.e. event describes the change in state of source. Events are generated as result of user interaction with the graphical user interface components. For example, clicking on a button, moving the mouse, entering a character through keyboard,selecting an item from list, scrolling the page are the activities that causes an event to happen.

# What is Event Handling?

Event Handling is the mechanism that controls the event and decides what should happen if an event occurs. This mechanism have the code which is known as event handler that is executed when an event occurs. Java Uses the Delegation Event Model to handle the events. This model defines the standard mechanism to generate and handle the events.Let's have a brief introduction to this model.

The Delegation Event Model has the following key participants namely:

- Source - The source is an object on which event occurs. Source is responsible for providing information of the occurred event to it's handler. Java provide as with classes for source object.

- Listener - It is also known as event handler.Listener is responsible for generating response to an event. From java implementation point of view the listener is also an object. Listener waits until it receives an event. Once the event is received , the listener process the event an then returns.

## Java Event classes and Listener interfaces

Event Classes | Listener Interfaces
--------------|--------------------
ActionEvent | ActionListener
MouseEvent | MouseListener and MouseMotionListener
MouseWheelEvent | MouseWheelListener
KeyEvent | KeyListener
ItemEvent | ItemListener
TextEvent | TextListener
AdjustmentEvent | AdjustmentListener
WindowEvent | WindowListener
ComponentEvent | ComponentListener
ContainerEvent | ContainerListener
FocusEvent | FocusListener

## Steps to perform Event Handling

Following steps are required to perform event handling:

- Register the component with the Listener

## Registration Methods

For registering the component with the Listener, many classes provide the registration methods. For example:

- Button

```javascript
public void addActionListener(ActionListener a){}
```

- MenuItem

```javascript
public void addActionListener(ActionListener a){}
```

- TextField

```javascript
public void addActionListener(ActionListener a){}
public void addTextListener(TextListener a){}
```

- TextArea

```javascript
public void addTextListener(TextListener a){}
```

- Checkbox

```javascript
public void addItemListener(ItemListener a){}
```

- Choice

```javascript
public void addItemListener(ItemListener a){}
```

- List

```javascript
public void addActionListener(ActionListener a){}
public void addItemListener(ItemListener a){}
```

## Java Event Handling Code

We can put the event handling code into one of the following places:

- Within class
- Other class
- Anonymous class

## Java event handling by implementing ActionListener

```javascript
import java.awt.*;  
import java.awt.event.*;  
class AEvent extends Frame implements ActionListener{  
TextField tf;  
AEvent(){  
  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
  
//register listener  
b.addActionListener(this);//passing current instance  
  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome");  
}  
public static void main(String args[]){  
new AEvent();  
}  
}
```

## Java event handling by outer class

```javascript
import java.awt.*;  
import java.awt.event.*;  
class AEvent2 extends Frame{  
TextField tf;  
AEvent2(){  
//create components  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(100,120,80,30);  
//register listener  
Outer o=new Outer(this);  
b.addActionListener(o);//passing outer class instance  
//add components and set size, layout and visibility  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new AEvent2();  
}  
}  
import java.awt.event.*;  
class Outer implements ActionListener{  
AEvent2 obj;  
Outer(AEvent2 obj){  
this.obj=obj;  
}  
public void actionPerformed(ActionEvent e){  
obj.tf.setText("welcome");  
}  
}
```

### Java event handling by anonymous class

```javascript
import java.awt.*;  
import java.awt.event.*;  
class AEvent3 extends Frame{  
TextField tf;  
AEvent3(){  
tf=new TextField();  
tf.setBounds(60,50,170,20);  
Button b=new Button("click me");  
b.setBounds(50,120,80,30);  
  
b.addActionListener(new ActionListener(){  
public void actionPerformed(){  
tf.setText("hello");  
}  
});  
add(b);add(tf);  
setSize(300,300);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String args[]){  
new AEvent3();  
}  
}  
```
