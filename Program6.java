import java.util.*;//Importing Java Util Package
class Program6
{
  public static void main(String args[])
  {
      int x,dummy,remainder,i=0,vampire,f1=0,f2=0;
      boolean isvamp= false;
      int arr[]=new int[4];
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a 4 digit no.= ");
      x = sc.nextInt();//User-input
      dummy = x;//To store the number in a temporary variable
      while(dummy!=0)
      {
          remainder= dummy%10;//To extract the last digit
          arr[i]= remainder;
          dummy/=10;
          i++;
        }
      for(int z=0;z<4;z++)
        for(int j=0;j<4;j++)
          for(int k=0;k<4;k++)
            for(int l=0;l<4;l++)
            {
                f1=(arr[z]*10+arr[j]);//1st Fang 
                f2=(arr[k]*10+arr[l]);//2nd Fang
                int fang= f1*f2;
                if(fang==x)//Checking of Condition
                {
                    isvamp=true;
                    break;
                }
            }
            if(isvamp)
              System.out.println(x+" is a Vampire no. and the fangs are= 21 , 60");//Printing Statement
            else
              System.out.println(x+" is not Vampire no.");//Printing statement
    }//End of main()
}//End of class
