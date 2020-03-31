import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
public class calculator extends JFrame implements ActionListener{
    JTextField screen;
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bplus,bminus,bmul,bdiv,bdot,bequal;
    calculator()
    {
        creatingUI();
        settingUI();
    }
    void creatingUI(){
        screen =new JTextField();
        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        bplus=new JButton("+");
        bminus=new JButton("-");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bdot=new JButton(".");
        bequal=new JButton("=");
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }
    void settingUI(){
        add(screen);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(bplus);
        add(bminus);
        add(bmul);
        add(bdiv);
        add(bdot);
        add(bequal);
        screen.setBounds(100, 50, 250, 50);
        //first row
        b1.setBounds(80, 150, 50, 50);
        b2.setBounds(160, 150, 50, 50);
        b3.setBounds(240, 150, 50, 50);
        bplus.setBounds(320, 150, 50, 50);
        //second row
        b4.setBounds(80, 230, 50, 50);
        b5.setBounds(160, 230, 50, 50);
        b6.setBounds(240, 230, 50, 50);
        bminus.setBounds(320, 230, 50, 50);
        //third row
        b7.setBounds(80, 310, 50, 50);
        b8.setBounds(160, 310, 50, 50);
        b9.setBounds(240, 310, 50, 50);
        bmul.setBounds(320, 310, 50, 50);
        //fourth row
        b0.setBounds(80, 390, 50, 50);
        bdot.setBounds(160, 390, 50, 50);
        bdiv.setBounds(240, 390, 50, 50);
        bequal.setBounds(320, 390, 50, 50);
        ///adding actionlistner
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bplus.addActionListener(this);
        bminus.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bdot.addActionListener(this);
        bequal.addActionListener(this);

    }
    String data;
    int data1,data2,result;
    public void actionPerformed(ActionEvent e)
    {
        // String data,data1,data2,result;
        data= screen.getText();
        if(e.getSource()==b0)
        {
            screen.setText(data + "0");
        }
        if(e.getSource()==b1)
        {
            screen.setText(data + "1");
        }
        if(e.getSource()==b2)
        {
            screen.setText(data + "2");
        }
        if(e.getSource()==b3)
        {
            screen.setText(data + "3");
        }
        if(e.getSource()==b4)
        {
            screen.setText(data + "4");
        }
        if(e.getSource()==b5)
        {
            screen.setText(data + "5");
        }
        if(e.getSource()==b6)
        {
            screen.setText(data + "6");
        }
        if(e.getSource()==b7)
        {
            screen.setText(data + "7");
        }
        if(e.getSource()==b8)
        {
            screen.setText(data + "8");
        }
        if(e.getSource()==b9)
        {
            screen.setText(data + "9");
        }
        if(e.getSource()==bdot)
        {
            screen.setText(data + ".");
        }
        if (e.getSource()==bplus || e.getSource()==bminus || e.getSource()==bmul || e.getSource()==bdiv){
            data1= Integer.parseInt(screen.getText());//storing data ahead of sign
            if (e.getSource()==bplus) {
                screen.setText(data + "+");
            }
            if (e.getSource()==bminus) {
                screen.setText(data + "-");
            }
            if (e.getSource()==bmul) {
                screen.setText(data + "*");
            }
            if (e.getSource()==bdiv) {
                screen.setText(data + "/");
            }
        }
        result=data1+readData2();
    }
    
    private int readData2() {
        // Scanner scanner = new Scanner(screen.getText());
        // String screendata = scanner.nextLine();
        String path = screen.getText();
         // Split path into segments
         if()
         String segments[] = path.split("/");
         // Grab the last segment
        String document = segments[segments.length - 1];
        // if(data.substring(data.lastIndexOf("+") + 1);
        // for (int i = 0; i < screendata.length(); i++) {
        //     if (screendata.next()) {
                
        //     }            
        // }
        // while (screendata=="+") {
        //     int i=screen.getText().length()-data.length();
        //     int j=screen.getText().length();
        //     for(i;i<j;i++)
        //     {
        //         data2=
        //     }
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}