import java.awt.*;
class awtlayout extends Frame{
    awtlayout(){
        MenuBar mb=new MenuBar();
        Menu fileMenu=new Menu("File");
        MenuItem i1=new MenuItem("New");
        MenuItem i2=new MenuItem("Open");
        MenuItem i3=new MenuItem("SaveAs");
        setMenuBar(mb);
        mb.add(fileMenu);
        fileMenu.add(i1);
        fileMenu.add(i2);
        fileMenu.add(i3);
        setLayout(null);
        setBounds(20,20,20,20);
        setTitle("Information Form");
        setVisible(true);
        setSize(500, 700);
    }
    public static void main(String[] args) {
        new awtlayout();
}
}
