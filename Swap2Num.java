   
public class main {
    public static void main(String[] args) {
	int B = 60000;
        int M = 75000;
        
        System.out.println("Number before Swapping B:" + B +"Number before Swapping M:" + M);
        int temp = B;
        B = M;
        M = temp;
        System.out.println("Number after Swapping B:" + B +"Number after Swapping M:" + M);
        
    }
}
