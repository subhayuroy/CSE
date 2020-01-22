import java.util.*;//Importing Java Util Package
class Program2
{
  String n,s,w;//Instance Variable
  Program2()//Default Constructor
  {
      n="";
      s="";
      w="";
    }
  void compute()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a sentence which will be terminated by a dot(.) only after a space :");
    for(int i=0;;i++)
    {
        n=sc.nextLine();//User-Input
        if(n.charAt(n.length()-1)=='.')//Checking whether this sentence is terminating with a dot(.)
          break;
        else
        n+=sc.nextLine();//User-Input
    }
    n=" "+n.substring(0,n.length()-1);//To add a space before starting
    for(int i=0;i<n.length()-2;i++)
    {
      for(int j=0;j<n.length();j++)
      {
          char c= n.charAt(j);
          if(c!=' ')
            s+=c;//Formation of a word
          else
          {
              if(s.length()==i)
                w= w+" "+s;//Formation of the resultant sentence
               s=""; 
            }
        }
    }
      System.out.println("Output: "+w+".");//Printing that sentence with a valid output message  
    }
    public static void main(String arg[])
    {
        Program2 ob = new Program2();//Object Creation
        ob.compute();
    }//End of main()
}//End of class
