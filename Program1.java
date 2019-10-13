import java.util.*;//Importing Java Util Package
class Program1
{
  int d,m;
  long y;
  Program1()//Default Constructor
  {
      d=0;
      m=0;
      y=0l;
    }
  void compute()
  {
      Scanner sc=new Scanner(System.in);
      String month[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
      int month1[]={0,31,28,31,30,31,30,31,31,30,31,30,31};//Number of Days in each Month
      System.out.println("Enter the date(dd/mm/yyyy) :");
      d= sc.nextInt();//User-Input
      m=sc.nextInt();//User-Input
      y=sc.nextLong();//User-Input
      if(((y%400==0)||((y%4==0)&&(y%100!=0)))&&(m==2))//Condition for Leap year
      {
          month1[2]++;
          if(d>29)//Checking validity of Date
          {
           System.out.println("Invalid date, number of days exceeding month limit ");
           System.exit(0);//Exiting from this Program
        }
      }
      if(m>12||m<1)//Checking validity of Month
      {
          System.out.println("Month is invalid");
          System.exit(0);//Exiting from this Program
        }
      if(month1[m]<d)//Checking validity of Date
      {
          System.out.println("Invalid date, exceeding month limit");
          System.exit(0);
        }
        System.out.println("Date is valid");
        int x=d%10;
        if(x>3)
          System.out.print(d+"th ");//For Printing succeeding of last digit of a number
         else if(x==1)
         System.out.print(d+"st ");//For Printing succeeding of last digit of a number
         else if(x==2)
         System.out.print(d+"nd ");//For Printing succeeding of last digit of a number
         else if(x==3)
         System.out.print(d+"rd ");//For Printing succeeding of last digit of a number
         System.out.println(month[m]+" "+y);
    }
    public static void main(String arg[])
    {
        Program1 ob = new Program1();//Object Creation
        ob.compute();//Object Calling
    }//End of main()
}//End of class