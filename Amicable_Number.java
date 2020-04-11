import java.util.*;
class Amicable_Number
{
    void Amicable(int x,int y)
    {
        int s=0,s1=0;
        for(int i=1;i<=x/2;i++)
            if(x%i==0)
                s+=i;
        for(int i=1;i<=y/2;i++)
            if(y%i==0)
                s1+=i;
        System.out.println((s+s1==x+y)?"Amicamble pairs":"Not Amicable Pairs");
    }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Amicable_Number ob=new Amicable_Number();
        ob.Amicable(m,n);
    }
}