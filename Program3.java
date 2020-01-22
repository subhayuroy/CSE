import java.util.*;//Importing Java Util Package
class Program3 extends Fraction//Use Inheritance
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numerator and denominator of 1st fraction:");
		int n1 = sc.nextInt();//User-Input
		int d1 = sc.nextInt();//User-Input
		System.out.println("Enter numerator and denominator of 2nd fraction:");
		int n2 = sc.nextInt();//User-Input
		int d2 = sc.nextInt();//User-Input
		Fraction ob1 = new Fraction(n1,d1);//Object creation
		Fraction ob2 = new Fraction(n2,d2);//Object creation
		Fraction ob3 = new Fraction(0,0);//Object creation
		Fraction ob4 = new Fraction(0,0);//Object creation
		Fraction ob5 = new Fraction(0,0);//Object creation
		ob4 = ob3.addFraction(ob1,ob2);
		ob5 = ob3.reduceFraction(ob4);
		System.out.println("Fraction 1: ");//Printing 1st Fraction 
		ob1.displayFraction();
		System.out.println("Fraction 2: ");//Printing 2nd Fraction
		ob2.displayFraction();
		System.out.println("Added Fraction: ");//Printing the Added Fraction
		ob4.displayFraction();
		System.out.println("Reduced Fraction : ");//Printing the Reduced Fraction
		ob5.displayFraction();
	}//Enf of main()
}//End of class 
