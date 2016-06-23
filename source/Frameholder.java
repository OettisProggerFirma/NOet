import javax.swing.*;
import java.awt.*;

/**
 * Created by doetken on 23.06.2016.
 */
public class Frameholder {

    public Frameholder() {
        JFrame frame = new JFrame();
        JPanel panel=new JPanel(new BorderLayout());

//        Notizframe notiz = new Notizframe();
//        panel.add(notiz, BorderLayout.CENTER);

        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
