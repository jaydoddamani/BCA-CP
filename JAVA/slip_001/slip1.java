import java.io.*;
class slip1{
    public static void main(String str[]) throws IOException {
        FileReader f=new FileReader("f1.txt");
        int i;
        while((i=f.read())!=-1){
            System.out.println((char)i);
        }
        f.close();
    }
}