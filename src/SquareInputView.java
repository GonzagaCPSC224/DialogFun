import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareInputView extends JFrame {

    public SquareInputView() {
        super("Squarer");

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(200, 200));

        setupUI();
        pack();
    }

    private void setupUI() {
        // JLabel, then JTextField, then JButton, then JLabel
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JLabel promptLabel = new JLabel("Enter an integer (or else): ");
        contentPanel.add(promptLabel);

        JTextField inputTextField = new JTextField();
        contentPanel.add(inputTextField);

        JLabel statusLabel = new JLabel(" ");

        JButton calculateButton = new JButton("Calculate!");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputTextField.getText();
                try {
                    int value = Integer.parseInt(text);
                    statusLabel.setText("Squared: " + value * value);

                    // JDialog - like a mini JFrame
                    // little window that pops up and the user has to interact with it
                    // use static methods in JOptionPane
                    // message dialg
//                    JOptionPane.showMessageDialog(SquareInputView.this,
//                            "Squared: " + value * value);
//                    JOptionPane.showMessageDialog(SquareInputView.this,
//                            "Squared: " + value * value,
//                            "Invalid Input",
//                            JOptionPane.ERROR_MESSAGE);



                } catch(NumberFormatException ex) {
                    statusLabel.setText("Hey that's not an integer");

                    // confirmation dialog
//                    int choice = JOptionPane.showConfirmDialog(SquareInputView.this,
//                            "That isn't an integer. Do you want to try again?",
//                            "Invalid Input",
//                            JOptionPane.YES_NO_CANCEL_OPTION,
//                            JOptionPane.QUESTION_MESSAGE);

                    // option dialog...
                    // customize the labels on the buttons
                    String[] options = {"Yes, please", "No way", "Cancel"};
                    int choice = JOptionPane.showOptionDialog(SquareInputView.this,
                            "That isn't an integer. Do you want to try again?",
                            "Invalid Input",
                            JOptionPane.YES_NO_CANCEL_OPTION,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            options[0]);
                    if (choice == JOptionPane.NO_OPTION) { // 1
                        System.exit(0);
                    }

                }
            }
        });
        contentPanel.add(calculateButton);
        contentPanel.add(statusLabel);


        getContentPane().add(contentPanel);
    }

}
