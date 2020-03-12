import java.io.FileWriter;
import java.io.IOException;
class CreateTextFiles{
    
    public static void main(String[] args) throws IOException {
        String string_A="aa \nbb \ncc";
        String string_B="11 \n22 \n33";
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
