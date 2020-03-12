import java.io.*;
class alternate{
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("a.txt");
        FileReader fr2=new FileReader("b.txt");
        BufferedReader br1=new BufferedReader(fr1);
        BufferedReader br2=new BufferedReader(fr2);
        FileWriter alternate =new FileWriter("alternate.txt");
        String line1=br1.readLine();
        String line2=br2.readLine();
        while (line1!=null || line2 !=null) {
            
        if (line1!=null) {
            alternate.write(line1);
            line1=br1.readLine();
        }
        if (line2!=null) {
            alternate.write(line2);
            line2=br2.readLine();
        }
    }
        br2.close();
        fr2.close();
        br1.close();
        fr1.close();
        alternate.close();
        
    }
}