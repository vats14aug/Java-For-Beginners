
class SubString
  {
  public static void main(String []args) throws IOException
  {
	  Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the string");
	String a=br.readLine();
  char ch[]=a.toCharArray();
	System.out.println("Enter the index from where u want to find");
	int a1=sc.nextInt();
	int a2=sc.nextInt();
	for(int i=a1;i<a2;i++)
		System.out.print(""+ch[i]);
    //with direct function
    String s1="javatpoint";  
   System.out.println(s1.substring(2,4));//returns va  
    System.out.println(s1.substring(2));//returns vatpoint  

	}
  }
