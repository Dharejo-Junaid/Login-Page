import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class LoginPage extends JFrame {
    
    GridBagConstraints c;

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

        JTextField username = new JTextField();
        username.setPreferredSize(new Dimension(200, 30));
        c.gridy++;
        this.add(username, c);

        
        JLabel passwordLabel = new JLabel("Password:");
        c.gridy++;
        this.add(passwordLabel, c);

        JTextField password = new JTextField();
        password.setPreferredSize(new Dimension(200, 30));
        c.gridy++;
        this.add(password, c);


        this.setVisible(true);

    }
}
