import javax.swing.*;

/**
 * Created by doetken on 24.06.2016.
 */
public class Frameholder {
    public Frameholder() {
        JFrame frame = new JFrame();

        NotizAnzeige anzeige = new NotizAnzeige();
        Notiz test1 = new Notiz("Test", "Dies ist ein erster Test", 3);
        anzeige.zeigeNotiz(test1);

        frame.add(anzeige);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
