import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class WebBrowser {
    private JFrame frame;
    private JTextField urlField;
    private JEditorPane displayPane;

    public WebBrowser() {
        frame = new JFrame("Web Browser");
        displayPane  = new JEditorPane();
        urlField = new JTextField("https://www.google.com");

        frame.getContentPane().add(urlField);
        frame.getContentPane().add(displayPane);

        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
        
    }
}

