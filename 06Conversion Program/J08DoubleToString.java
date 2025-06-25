public class J08DoubleToString {
    public static void main(String[] args) {
        // Double declared
        double num = 12.345;

        // Converting Double to String
        String str = num + "";

        System.out.println(str);

        // Type of num
        System.out.println(
                "Type of num : "
                        + ((Object) num).getClass().getSimpleName());

        // Converted element to string
        System.out.println(
                "Type of str : "
                        + ((Object) str).getClass().getSimpleName());
    }
}
