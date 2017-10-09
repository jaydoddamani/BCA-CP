import java.util.*;
import java.io.*;
class slip12{
    public static void main(String str[]) throws IOException{
        //Scanner sc=new Scanner(System.in);
        File f1=new File(str[0]);
        String files[]=f1.list();
        for(int i=0;i<files.length;i++){
            System.out.println(files[i]);
        }
    }
}