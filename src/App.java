import java.math.BigDecimal;

public class App {
    /* public static void main(String[] args) throws Exception {
            //Snack 1
        Studente studente1 = new Studente("Ansemio", "Bitta", 24);
        Studente studente2 = new Studente("Pippo", "Baudo", 20);
        Studente studente3 = new Studente("Tom", "Titta", 18);

        System.out.println("Snack 1: " + studente1.concatenaValori());
        System.out.println("Snack 1: " + studente2.concatenaValori());
        System.out.println("Snack 1: " + studente3.concatenaValori());
        System.out.println();



            //Snack 2
        ContoBancario contoBancario = new ContoBancario(1234567890);

        contoBancario.deposita(10);

        contoBancario.preleva(5.66);

        System.out.println("Snack 2: " + contoBancario.getSaldo());
        System.out.println();

            //Snack 3
        RegistroStudenti registro = new RegistroStudenti();

        registro.aggiungiStudente(studente1);
        registro.aggiungiStudente(studente2);
        registro.aggiungiStudente(studente3);

        System.out.println("Snack 3: Lista dei studenti nel registro: " );
        registro.stampaStudenti();


    } */


    // CORREZIONE

   
    public static void main(String[] args) {
        //primo snack
        Studente gianna = new Studente("Gianna", "Nonnini", 44);
        Studente giovanni = new Studente("Giovanni", "Mucciaccio", 37);
        Studente lorella = new Studente("Lorella", "Cuccarelli", 55);
        Studente johnny = new Studente("Johhny", "Dorelli", 22);
        
        System.out.println(gianna.getInfoStudente());
        System.out.println(giovanni.getInfoStudente());
        System.out.println(lorella.getInfoStudente());
        System.out.println(johnny.getInfoStudente());

        //secondo snack
        ContoBancario conto = new ContoBancario(123152);
        ContoBancario conto2 = new ContoBancario();
        System.out.println(conto.getSaldo());

        conto.deposita(new BigDecimal(5551));
        System.out.println(conto.getSaldo());

        conto.deposita(new BigDecimal(-444));
        System.out.println(conto.getSaldo());

        conto.ritira(new BigDecimal(2000));
        System.out.println(conto.getSaldo());

        conto.ritira(new BigDecimal(-2000));
        System.out.println(conto.getSaldo());

        System.out.println(conto.getNumeroConto());
        System.out.println(conto2.getNumeroConto());


        //terzo snack
        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);

        registroStudenti.addStudente(gianna);
        registroStudenti.addStudente(johnny);

        System.out.println(registroStudenti.toString());

        registroStudenti.addStudente(giovanni);
        registroStudenti.addStudente(lorella);

        System.out.println(registroStudenti.toString());

    }
}
