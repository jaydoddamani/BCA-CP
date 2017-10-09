import java.io.*;
class slip1{
    public static void main(String str[]) throws IOException {
        FileReader f=new FileReader("f1.txt");
        int i;
        while((i=f.read())!=-1){
            char ch=(char)i;
            if(Character.isUpperCase(ch)){
                System.out.print(Character.toLowerCase(ch));
            }
            if(Character.isLowerCase(ch)){
                System.out.print(Character.toUpperCase(ch));
            }
            if(Character.isDigit(ch)){
                System.out.print(ch);
            }
            if(Character.isSpace(ch)){
                System.out.print(" ");
            }
        }
        f.close();
    }
}