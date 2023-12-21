import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a binary number (up to 8 digits): ");
        String binaryInput = scanner.nextLine().trim();

        if (isValidBinary(binaryInput)) {
            int decimalResult = binaryToDecimal(binaryInput);
            System.out.println("Decimal equivalent: " + decimalResult);
        } else {
            System.out.println("Invalid binary input. Please enter only 0s and 1s.");
        }

        scanner.close();
    }

    private static boolean isValidBinary(String binaryInput) {
        return binaryInput.matches("[01]+") && binaryInput.length() <= 8;
    }

    private static int binaryToDecimal(String binaryInput) {
        int decimalResult = 0;
        int power = 0;

        for (int i = binaryInput.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(binaryInput.charAt(i));
            decimalResult += digit * Math.pow(2, power);
            power++;
        }

        return decimalResult;
    }
}
