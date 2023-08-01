public class Main {
    // convert a decimal number to binary
    public static String decimalToBinary(int n) {
        String binaryN = "";

        while (n != 0) {
            int binaryDigit = n % 2;
            binaryN = binaryDigit + binaryN;

            n /= 2;
        }

        return binaryN;
    }

    // convert a positive binary number to decimal
    public static int binaryToDecimal(String number) {
        int decimalN = 0;
        int powerOf2 = 0;

        for (int i = number.length() - 1; i >= 0; i--) {

            if (number.charAt(i) == '1') {
                decimalN += (int) Math.pow(2, powerOf2);
                powerOf2++;

            } else {
                powerOf2++;

            }
        }

        return decimalN;
    }

    public static void main(String[] args) {
        int n = 10000;
        String binaryN = decimalToBinary(n);

        System.out.println(binaryN);

        System.out.println(binaryToDecimal(binaryN));
    }
}