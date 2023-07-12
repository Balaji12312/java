public class last2
{

 static int last2(int a)
    {
        int secl;
        secl=(a%100)/10;
        secl=(a/10)%10;
        return secl;
    }
     
    // Driver program
    public static void main(String args[])
    {
        int a = 98562;
        System.out.println(last2(a));
    }
}