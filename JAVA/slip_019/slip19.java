import java.util.*;
class ZeroException extends Exception{

}
class slip19{
    static int n;
    public static void main(String args[]){
        int i,rem,sum=0;
        try{
            Scanner sr=new Scanner(System.in);
            System.out.println("Enter the Number");
            int n=sr.nextInt();
            if(n==0){
                throw new ZeroException();
            }
            else{
                rem=n%10;
                sum=sum+rem;
                if(n>9){
                    while(n>0){
                        rem=n%10;
                        n=n/10;
                    }
                    sum=sum+rem;
                }
            System.out.println("Sum of first and last digit is"+sum);
            }
        }
        catch(ZeroException e){
            System.out.println("Number is Zero");
        }
    }
}