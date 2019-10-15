import javax.swing.*;
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

        //new SquareInputView();
        String valueStr = JOptionPane.showInputDialog("Enter an integer (or else!)");
        try {
            int value = Integer.parseInt(valueStr);
            JOptionPane.showMessageDialog(null, "Squared: " + (value * value),
                    "Result", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "That's not an integer!",
                    "Result", JOptionPane.ERROR_MESSAGE);
        }
    }
}
