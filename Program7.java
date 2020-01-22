class Program7
{
    static boolean isUnique(String q)
    {
        int A[] = {0,0,0,0,0,0,0,0,0,0}; //to store frequency of every digit from '0' to '9'
        int i, flag = 0;
        char ch;
        for(i=0; i<q.length(); i++)
        {
            ch = q.charAt(i);
            A[ch-48]++; 
            /*  increasing A[5] if ch='5' as '5'-48 = 53-48=5 
             *  (ASCII values of '0' to '9' are 48 to 57) */
        }
        for(i=1; i<10; i++)
        {
         //checking if every digit from '1' to '9' are present exactly once or not
          if(A[i]!=1)
          {
              flag = 1; //flag is set to 1 if frequency is not 1
              break;
          }
        }
       if(flag == 1)
          return false;
       else
          return true;
     }
    public static void main(String arg[])
    {
    	int count=0;
    	for(int i=100;;i++)
    	{
    		 String s = Integer.toString(i*1) + Integer.toString(i*2) + Integer.toString(i*3);
             /*  Joining the first, second and third multiple of the number
              *  by converting them to Strings and concatenating them*/
               if(isUnique(s)==true)
               {
               	System.out.print(i+" ");
               	count++;
               }
               if(count==10)
                 break;
    	}
    }
}
