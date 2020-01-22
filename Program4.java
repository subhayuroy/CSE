import java.util.*;//Importing Java Util Package
class Program4
{
  String s;//Instance Variable
  int n[];//Instance Variable
  Program4()
  {
      s="";
      n=new int[26];
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence= ");
        s = sc.nextLine();//User-Input
        s = s.trim().toUpperCase();//To take Capitalised form of String
    }
    void freq()
    {
        char c=' ';
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            a=c-'A';
            if(Character.isLetter(c))
            n[a]+=1;
        }
    }//End of freq()
    int highestFreq()
    {
        int a=0;
        for(int i=0;i<26;i++)
          if(n[i]>a)
            a=n[i];
            return a;//Return statement
    }
    void show()
    {
        System.out.println("The Histogram is:");//Printing statement
        for(char c ='A';c<='Z';c++)
          System.out.print(c);//1st Line to form Tabular Format 
        System.out.println();
        for(int i=0;i<=highestFreq();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(n[j]<=i)
                 System.out.print(" ");//For printing gaps in the Histogram
                else
                 System.out.print("*");//For forming a Histogram
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Program4 ob = new Program4();//Object creation
        ob.input();
        ob.freq();
        ob.show();
    }//End of main()
}//End of class
