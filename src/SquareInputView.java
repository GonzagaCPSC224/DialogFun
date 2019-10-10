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
                } catch(NumberFormatException ex) {
                    statusLabel.setText("Hey that's not an integer");
                }
            }
        });
        contentPanel.add(calculateButton);
        contentPanel.add(statusLabel);


        getContentPane().add(contentPanel);
    }

}
