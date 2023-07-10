public class Palindrome
{
	public static void main(String[] args) {
	    
	    //Palindrome String
	    String str = "MADAM";
	    String newstr = "";
	    
	    for(int i=str.length()-1;i>=0;i--)
	    {
           newstr += str.charAt(i);
	    }

	    if(str.equals(newstr))
	    {
	        System.out.println(str + ":"+"is Palindrome");
	    }
	    else
	    {
	       System.out.println(str + ":" + "is not Palindrome");
	    }
	    
        //Palindrome Number
        int num = 3553, reversedNum = 0, remainder;
        
        // store the number to originalNum
        int originalNum = num;
        
        // get the reverse of originalNum
        while (num != 0) {
          remainder = num % 10;
          reversedNum = reversedNum * 10 + remainder;
          num /= 10;
        }
    
        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
          System.out.println(originalNum + " : is Palindrome.");
        }
        else {
          System.out.println(originalNum + " : is not Palindrome.");
        }
    }
	
}
