public class J04HexadecimalToDecimal {
   
    // Method to convert a hexadecimal string to decimal
    public static int convertHexToDecimal(String hex) {
        int decimalValue = 0;
        int base = 1;  // Represents 16^0 initially

        // Loop from right to left (least significant digit to most significant)
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);

            // If character is between '0' and '9'
            if (ch >= '0' && ch <= '9') {
                decimalValue += (ch - '0') * base;
            }
            // If character is between 'A' and 'F'
            else if (ch >= 'A' && ch <= 'F') {
                decimalValue += (ch - 'A' + 10) * base;
            }

            // Update base (multiply by 16 for next digit)
            base *= 16;
        }

        return decimalValue;
    }

    // Main method
    public static void main(String[] args) {
        String hexNumber = "1A";
        int decimalNumber = convertHexToDecimal(hexNumber);

        System.out.println("Hexadecimal: " + hexNumber);
        System.out.println("Decimal: " + decimalNumber);
    }
}

    
}
