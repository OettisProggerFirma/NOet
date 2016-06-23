/**
 * Created by doetken on 23.06.2016.
 */
public class Runner {
    public static void main(String[] args) {
       new Frameholder();

//        toDo: Löschen, weil Testfall
        Notiz testNotiz = new Notiz("Titel 1",3,"Dies ist der Testtext");
        NotizAnzeige anzeige=new NotizAnzeige();
        anzeige.zeigeNotiz(testNotiz);

        anzeige.anzeigeLeeren();

    }
}
