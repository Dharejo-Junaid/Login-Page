import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame implements ActionListener {
    
    GridBagConstraints c;
    JTextField username, password;

    public LoginPage() {

        c = new GridBagConstraints();
        c.insets = new Insets(10, 20, 10, 20);
        c.gridy = 0;

        this.setSize(350, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());
        
        JLabel login = new javax.swing.JLabel("Login");
        login.setFont(new Font("Lucida Consolas", Font.BOLD, 30));
        this.add(login, c);

        JLabel usernameLabel = new JLabel("Username:");
        c.gridy++;
        this.add(usernameLabel, c);

        username = new JTextField();
        username.setPreferredSize(new Dimension(200, 30));
        c.gridy++;
        this.add(username, c);

        
        JLabel passwordLabel = new JLabel("Password:");
        c.gridy++;
        this.add(passwordLabel, c);

        password = new JTextField();
        password.setPreferredSize(new Dimension(200, 30));
        c.gridy++;
        this.add(password, c);

        JButton loginButton = new JButton("\t\tLogin\t\t");
        loginButton.addActionListener(this);
        c.gridy++;
        this.add(loginButton, c);


        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = this.username.getText().trim();
        String password = this.password.getText().trim();

        if(username.equals("Junaid") && password.equals("123456")) {
            JOptionPane.showMessageDialog(this, "Login successful",
             "Successful", JOptionPane.INFORMATION_MESSAGE);
        }

        else {
            JOptionPane.showMessageDialog(this, "Login Failed",
            "Failed", JOptionPane.ERROR_MESSAGE);
        }

    }
}
