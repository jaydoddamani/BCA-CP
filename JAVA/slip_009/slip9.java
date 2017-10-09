import java.io.*;
import java.util.*;
class slip9{
    public static void main(String str[]) throws IOException {
        File f=new File("f1.txt");
        Scanner sc=new Scanner(f);
        System.out.println("Content");
        String line;
        while(sc.hasNextLine()){
            line=sc.nextLine();
            System.out.println(new StringBuffer(line).reverse());
        }
    }
}