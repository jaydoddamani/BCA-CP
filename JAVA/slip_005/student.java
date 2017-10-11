class student{
	int rno;
	String snm;
	static int i=0;
	student(){
		rno=0;
		snm=null;
	}
	student(int r,String nm){
	 i++;
	 rno=r;
	 snm=nm;
	 System.out.println("Object "+i+" is created");
	}
	public String toString(){
	String str;
	str=rno+""+snm;
	return str;
	}
	public static void main(String args[]){
	student s1=new student(1,"Jay");
	student s2=new student(2,"Sagar");
	student s3=new student(3,"jimmy");
	System.out.println(s1.toString());
	System.out.println(s2.toString());
	System.out.println(s3.toString());
	}	
}