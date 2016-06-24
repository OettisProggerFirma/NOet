import javax.swing.*;
import java.awt.*;

/**
 * Created by Denis on 24.06.2016.
 */
public class NotizAnzeige extends JPanel {

    private final JTextField titel;
    private final JTextArea text;
    private final JTextField prioritaet;

    public NotizAnzeige() {
        this.setLayout(new BorderLayout());
        this.titel = new JTextField(50);
        this.titel.setBorder(BorderFactory.createTitledBorder("Titel"));

        this.text = new JTextArea(20, 55);
        this.text.setLineWrap(true);
        this.text.setWrapStyleWord(true);

        JScrollPane scroller = new JScrollPane(text, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroller.setBorder(BorderFactory.createTitledBorder("Text"));

        this.prioritaet = new JTextField(4);
        this.prioritaet.setBorder(BorderFactory.createTitledBorder("Prio"));

        JPanel titelPanel = new JPanel();
        titelPanel.add(titel);
        titelPanel.add(prioritaet);

        this.add(titelPanel, BorderLayout.NORTH);
        this.add(scroller, BorderLayout.CENTER);
    }

    public void zeigeNotiz(Notiz n) {
        this.titel.setText(n.getTitel());
        this.text.setText(n.getText());
        this.prioritaet.setText(Integer.toString(n.getPrioritaet()));

    }

    public void anzeigeLeeren() {
        this.titel.setText("");
        this.text.setText("");
        this.prioritaet.setText("");
    }
}
