
public class main {
    public static void main(String[] args) {
	int A=45;
        int B=55;
        System.out.println("Before Swapping:"+A+"Before Swapping:"+B);
        A=A-B;
        B=B+A;
        A=B-A;
        System.out.println("After Swapping:"+A+"After Swapping:"+B);
        
    }
}