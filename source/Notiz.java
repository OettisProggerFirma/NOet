import javax.swing.*;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by doetken on 24.06.2016.
 */
//todo comparable

public class Notiz implements Comparable<Notiz> {

    private final String titel;
    private final String text;
    private final int prioritaet;
    LocalDateTime erstellung;

    public Notiz(String titel, String text) {
        this.text = text;
        this.titel = titel;
        this.prioritaet = 1;
    }

    public Notiz(String titel, String text, int prioritaet) {
        this.titel = titel;
        this.text = text;
        this.prioritaet = prioritaet;
        this.erstellung = LocalDateTime.now();

    }

    //GETTER
    public String getTitel() {
        return titel;
    }

    public String getText() {
        return text;
    }

    public int getPrioritaet() {
        return prioritaet;
    }

    public LocalDateTime getErstellung() {
        return erstellung;
    }

    //Prio-Comparator
    @Override
    public int compareTo(Notiz o) {
        return this.prioritaet - o.prioritaet;
    }

    //toString-Methode

    @Override
    public String toString() {
        return this.titel;
    }
}
