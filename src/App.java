import javax.swing.UIManager;

public class App {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        new LoginPage();
    }
}
