import java.io.* ;
class slip2a{
    public static void main(String[] args) throws IOException{
        BufferedReader no=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Citys");
        int n;
        n=Integer.parseInt(no.readLine());
        System.out.println("Enter Cities");
        String city[]=new String[n];
        String t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<n; i++){
            city[i]=br.readLine ();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n; j++){
                if(city[j].compareTo(city[i])>0) {
                    t=city[i];
                    city[i]=city[j];
                    city[j]=t;
                }
            }
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.println(city[i]);
        }
   }
}