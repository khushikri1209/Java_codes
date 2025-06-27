public class J10LongToString {
    public static void main(String[] args) {

        // Declare a Long variable
        Long number = 999999999999L;

        // Convert Long to String using + operator
        String str = number + "";

        // Print the type of the converted variable
        System.out.println("Converted type: " + str.getClass().getName());

        // Print the String value
        System.out.println("Converted String: " + str);
    }
}
