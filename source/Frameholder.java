import javax.swing.*;

/**
 * Created by doetken on 24.06.2016.
 */
public class Frameholder {
    public Frameholder() {
        JFrame frame = new JFrame();

        NotizAnzeige anzeige=new NotizAnzeige();

        frame.add(anzeige.zeigeNotiz);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
