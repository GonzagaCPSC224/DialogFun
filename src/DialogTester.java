import java.util.InputMismatchException;
import java.util.Scanner;

public class DialogTester {
    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        int userNum = 0;
//
//        boolean valid = true;
//        do {
//            valid = true;
//            System.out.print("Enter an integer (or else!): ");
//            try {
//                userNum = kb.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("Hey, that's not an integer!!");
//                valid = false;
//            } finally {
//                kb.nextLine(); // flush the input buffer
//            }
//        } while(!valid);

        new SquareInputView();
    }
}
