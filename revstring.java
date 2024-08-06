public class revString {
    public static void main(String[] args) {
        String given = "Balaji";
        StringBuffer buffer = new StringBuffer(); // Corrected variable name
        buffer.append(given); // Appending the given string to the buffer
        System.out.println(buffer.reverse()); // Printing the reversed string
    }
}