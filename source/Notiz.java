import java.time.LocalDateTime;

/**
 * Created by doetken on 23.06.2016.
 */
public class Notiz {
    private final String titel;
    private final String text;
    private final int prioritaet;
    private final LocalDateTime zeit;

    public Notiz(String titel, int prioritaet, String text) {
        this.titel = titel;
        this.text = text;
        this.prioritaet = prioritaet;
        this.zeit = LocalDateTime.now();
    }

    public Notiz(String titel, String text) {
        this.titel = titel;
        this.text = text;
        this.zeit = LocalDateTime.now();
        this.prioritaet = 1;
    }

    public String getTitel() {
        return titel;
    }

    public String getText() {
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
