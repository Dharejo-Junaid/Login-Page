import javax.swing.JFrame;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class LoginPage extends JFrame {
    
    GridBagConstraints c;

    public LoginPage() {

        c = new GridBagConstraints();

        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        
        

        this.setVisible(true);

    }
}
