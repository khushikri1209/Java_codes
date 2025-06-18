class J01OctalToBinary {

 static String converter(String octalValue)
    {

        // integer variable to iterate
        // the input octal string
        int i = 0;

        // string to store the result
        String binaryValue = "";

        while (i < octalValue.length()) {

            // storing character according
            // to the number of iteration
            char c = octalValue.charAt((int)i);

            // switch case to check all
            // possible 8 conditions
            switch (c) {
            case '0':
                binaryValue += "000";
                break;
            case '1':
                binaryValue += "001";
                break;
            case '2':
                binaryValue += "010";
                break;
            case '3':
                binaryValue += "011";
                break;
            case '4':
                binaryValue += "100";
                break;
            case '5':
                binaryValue += "101";
                break;
            case '6':
                binaryValue += "110";
                break;
            case '7':
                binaryValue += "111";
                break;
            default:
                System.out.println(
                    "\nInvalid Octal Digit "
                    + octalValue.charAt((int)i));
                break;
            }
            i++;
        }

        // returning the final result
        return binaryValue;
    }

    // Driver code
    public static void main(String args[])
    {

        System.out.println("Octal to Binary Conversion\n");

        // octal number which is to be converted
        String octalNumber = "315";
        System.out.println("Octal number: " + octalNumber);

        // calling the converter method and
        // storing the result in a string variable
        String result = converter(octalNumber);

        System.out.println("Binary equivalent value is: "
                           + result);
    }
}