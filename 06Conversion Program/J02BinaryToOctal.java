public class J02BinaryToOctal {

    // Method to convert binary to decimal
    int binaryToDecimal(long binary) {
        int decimalNumber = 0, i = 0;

        while (binary > 0) {
            int digit = (int) (binary % 10);
            decimalNumber += digit * (1 << i); // 2^i using bitwise shift
            binary /= 10;
            i++;
        }

        return decimalNumber;
    }

    // Method to convert binary to octal
    int binaryToOctal(long binary) {
        int decimal = binaryToDecimal(binary);
        return Integer.parseInt(Integer.toOctalString(decimal));
    }

    public static void main(String[] args) {
        J02BinaryToOctal ob = new J02BinaryToOctal(); 
        System.out.println("Octal number: " + ob.binaryToOctal(100100));
    }
}
