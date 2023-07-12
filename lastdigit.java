public class lastdigit
{

 static int lastDigit(int n)
    {
        // return the last digit
        return (n % 100);
    }
     
    // Driver program
    public static void main(String args[])
    {
        int n = 98562;
        System.out.println(lastDigit(n));
    }
}