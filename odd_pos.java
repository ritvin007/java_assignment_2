import java.util.Scanner;

public class Odd_Char {
    public static void main(String[] args) {
        Scanner input_txt = new Scanner(System.in);
        System.out.println("Enter a String:");
        String inputString = input_txt.nextLine();
        print_remain(inputString);
        input_txt.close();
    }

    public static void print_remain(String inputString) {
        inputString = inputString.replaceAll("\\s+", "");

        System.out.print("Here are other remaining letters: ");
        for (int i = 0; i < inputString.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(inputString.charAt(i) + " ");
            }
        }
    }
}
