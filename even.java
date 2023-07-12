import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
//        Scanner sc = new Scanner(System.in);
        even();
    }

    static void even()
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
// double bill=sc.nextDouble();
// dynamic method dispatch
// bill*15/100
