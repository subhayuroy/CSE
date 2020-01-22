import java.io.*;
class Program5
{
  String s,e;
  Program5()
  {
      s=e="";
    }
    void take()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a sentence= ");
        s = br.readLine().trim();
        String t="";
        for(int i=0;i<s.length()-1;i++)
        {
            if(Character.isLetter(s.charAt(i)))
             t+=s.charAt(i);
            else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
             t+=s.charAt(i);
            if(Character.isDigit(s.charAt(i)))
            {
                System.out.println("Invalid input");
                System.exit(0);
            }
        }
        s=t;
    }
    int doSum(String x)
    {
        int sum=0;
        for(int i=0;i<x.length();i++)
           sum+=x.charAt(i);
         return sum;  
    }
    char newChar(int x, char c)
    {
        x=x%c;
        x=x%10;
        c+=x;
        if(Character.isUpperCase(c)&& Character.isLowerCase(c))
          c-=26;
        return c;
    }
    String encryptWord(String x)
    {
        int l= doSum(x);
        String newx="";
        for(int i=0;i<s.length();i++)
          newx+= newChar(l,s.charAt(i));
          return newx;
    }
    void show()
    {
        String t="";
        System.out.println("Original String= Subhayu is the Best");
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
             {
                 e+= encryptWord(t);
                 t="";
                }
                else 
                 t+=s.charAt(i);
        }
        System.out.println("Encrypted String= "+e);
    }
    public static void main(String arg[])throws IOException
    {
        Program5 ob = new Program5();
        ob.take();
        ob.show();
    }
}
