import java.io.* ;
class slip2a{
    public static void main(String[] args) throws IOException{
        String city[]=new String[5];
        String t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<5; i++){
            city[i]=br.readLine ();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1; j<5; j++){
                if(city[j].compareTo(city[i])>0) {
                    t=city[i];
                    city[i]=city[j];
                    city[j]=t;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println(city[i]);
        }
   }
}