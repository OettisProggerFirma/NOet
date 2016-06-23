import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

/**
 * Created by doetken on 23.06.2016.
 */
public class NotizAnzeige {

    JTextField titel;
    JTextField prio;
    JTextArea textFeld;
    JPanel notiz = new JPanel(new BorderLayout());


    public NotizAnzeige() {
    }

    public JPanel notizErstellen(String titel, Integer prio, String textFeld) {

        this.titel = new JTextField(50);
        this.titel.setText(titel);
        this.titel.setBorder(new TitledBorder("Titel"));
        this.notiz.add(this.titel, BorderLayout.CENTER);

        this.prio = new JTextField(5);
        this.prio.setText(prio.toString());
        this.prio.setBorder(new TitledBorder("Prio"));
        this.notiz.add(this.prio, BorderLayout.EAST);

        this.textFeld = new JTextArea(20, 55);
        this.textFeld.setText(textFeld);
        this.textFeld.setBorder(new TitledBorder("Text"));
        this.notiz.add(this.textFeld, BorderLayout.SOUTH);

    return this.notiz;
    }

    public void zeigeNotiz(Notiz n) {
        notizErstellen(n.getTitel().toString(), n.getPrioritaet(), n.getText().toString());
    }

    public void anzeigeLeeren(){
        this.notiz.add(notizErstellen("", 0, ""));
    }
}
