public class AddLastDigits
{    
    public static int addLastDigits(int input1, int input2)
    {        
        return Math.abs(input1 % 10) + Math.abs(input2 % 10);    
        }
        public static void main(String[] args)
        {
            System.out.println(addLastDigits(123,234));
            
        }
    
}