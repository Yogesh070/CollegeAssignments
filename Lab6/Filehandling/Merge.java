import java.io.*;
class Merge{
    public static void main(String[] args) throws IOException {
        FileReader fr1=new FileReader("a.txt");
        FileReader fr2=new FileReader("b.txt");
        BufferedReader br1=new BufferedReader(fr1);
        BufferedReader br2=new BufferedReader(fr2);
        FileWriter output =new FileWriter("Output.txt");
        int i,j;
        while((i=br1.read())!=-1)
        {
            output.write((char)i); 
        }
        output.write("\n");
        while((j=br2.read())!=-1)
        {
            output.write((char)j);
        }   
        br2.close();
        fr2.close();
        br1.close();
        fr1.close();
        output.close();
        
    }
}