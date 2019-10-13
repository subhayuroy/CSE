import java.util.*;//Importing Java Util Package
class Program9
{
    int n;//Instance variable
    Program9()//Default constructor
    {
        n=0;
    }
     void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();//User-input
    }
    boolean Increasing(int a)//For Incraesing number
    {
        boolean f=true;
        int q=a%10,r;
        a/=10;
        while(a>0)//For Extraction of digits
        {
            r=a%10;
            if(r>q)//Condition for Increasing number
            {
                f=false;
                break;
            }
            else
            {
                q=r;
                a/=10;
            }
        }
        return f;//Return statement
    }
    boolean Decreasing(int a)//For decreasing number
    {
        boolean f=true;
        int q=a%10,r;
        a/=10;
        while(a>0)
        {
            r=a%10;
            if(r<q)//Condition for Decreasing Number
            {
                f=false;
                break;
            }
            else
            {
                q=r;
                a/=10;
            }
        }
        return f;
    }
    void Bouncy()
    {
        if(Increasing(n))
            System.out.println("The number "+n+" is Increasing and not Bouncy.");//Printing statement
        else if(Decreasing(n))
            System.out.println("The number "+n+" is Decreasing and not Bouncy.");//Printing statement
        else
            System.out.println("The number "+n+" is Bouncy.");//Printing statement
    }
    public static void main(String args[])
    {
        Program9 ob=new Program9();//Object Creation
        ob.input();
        ob.Bouncy();
    }//End of main()
}//End of class
