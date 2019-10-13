import java.util.*;//Importing Java Util Package
class Program8
{
    static int n;//Static instance variable
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n= ");
	    n= sc.nextInt();//User-input
	}
	void display(int x)
	{
		int T=(x*(x+1)*(x+2))/6;//Computing nth-Tetrahedral number
		System.out.println("nth Tetrahedral number="+T);//Printing that number
	}
	public static void main(String arg[])
	{
		Program8 ob=new Program8();//Object creation
		ob.accept();
		ob.display(n);
	}//End of main()
}//End of class 
