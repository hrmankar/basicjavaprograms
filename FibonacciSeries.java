
public class FibonacciSeries
{
	public static void main(String[] args) {
	    int num1 = 0;
	    int num2 = 1;
	    
	    System.out.println(num1+num2);
	    
	    for(int i=0;i<10;i++)
	    {
	    int sum = num1 + num2;
	    num1 = num2;
	    num2 = sum;
	    System.out.println(sum);
	    }
	    
	}
}
