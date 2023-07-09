public class PrimeNumber
{
	public static void main(String[] args) {
	    int n = 26;
	    
	    //Using for loop - time complexity O(n)
	    if(n ==0 || n==1)
        {
                    System.out.println(n +":it's not a prime number");
        }
        else{
            for(int i=2;i<n;i++)
            {
                if(n%i ==0)
                {
                    	    System.out.println(n +":it's not a prime number");
                    	    break;
                }
                else{
                    	    System.out.println(n + ":is a prime number");
                    	    break;
                }
        	}
        }
        
    	// approach 2(decreases time complexity) - without using for loop 
        if(n%2==0)
        {
            System.out.print("number is even:"+" "+n);
        }
        else if(n%2!=0)
        {
            if(n%3!=0 && n%5!=0 && n%7!=0)
            {
                 System.out.print("number is prime:"+" "+n);
            }
            else
            {
                System.out.print("number is odd and not prime:"+"  "+n);
            }
        }
        else
         System.out.println("number either decimal or a negative not catared for:"+" "+n);
	}
	
}

