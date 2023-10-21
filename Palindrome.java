import java.util.Scanner;

public class Palindrome {
    private String inputString;

    public Palindrome() {
        inputString = "";
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public boolean isPalindrome() {
        String reversedString = "";

        // remove non-alphanumeric characters and convert to lowercase for case-insensitive comparison
        String cleanString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // reverse the string
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            reversedString += cleanString.charAt(i);
        }

        // compare the cleaned string with the reversed string
        return cleanString.equals(reversedString);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindromeChecker = new Palindrome();

        // read the number of test cases to check
        int numNumbers = scanner.nextInt();
        scanner.nextLine();
        
        String[] numbers = new String[numNumbers];
        for (int i = 0; i < numNumbers; i++) {
            numbers[i] = scanner.nextLine();
        }

        for (int i = 0; i < numNumbers; i++) {
            palindromeChecker.setInputString(numbers[i]);
            if (palindromeChecker.isPalindrome()) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }

        scanner.close();
    }
}
