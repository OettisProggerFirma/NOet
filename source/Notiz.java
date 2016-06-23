import javax.swing.*;
import java.time.LocalDateTime;

/**
 * Created by doetken on 23.06.2016.
 */
public class Notiz {
    private final JTextField titel;
    private final JTextField text;
    private final int prioritaet;
    private final LocalDateTime zeit;

    public Notiz(JTextField titel, JTextField text, int prioritaet) {
        this.titel = titel;
        this.text = text;
        this.prioritaet = prioritaet;
        this.zeit = LocalDateTime.now();
    }

    public Notiz(JTextField titel, JTextField text) {
        this.titel = titel;
        this.text = text;
        this.zeit = LocalDateTime.now();
        this.prioritaet = 1;
    }

    public JTextField getTitel() {
        return titel;
    }

    public JTextField getText() {
        return text;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public LocalDateTime getZeit() {
        return zeit;
    }

    @Override
    public String toString() {
        return "Notiz{" +
                "titel=" + titel +
                '}';
    }
//todo:     Comparator (Prio)
}
