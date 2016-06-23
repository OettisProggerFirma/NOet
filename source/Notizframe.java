import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by doetken on 23.06.2016.
 */
public class Notizframe {
    public JPanel Notizframe() {
        JPanel NotizAnzeige = new JPanel(new BorderLayout());


        JTextField titel = new JTextField();

//        TitledBorder titelRand=new TitledBorder("Titel");
//        titel.setBorder(titelRand);

        NotizAnzeige.add(titel);

        NotizAnzeige.add(titel);
        return NotizAnzeige;
    }
}
