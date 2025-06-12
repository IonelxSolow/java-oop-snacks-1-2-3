public class App {
    public static void main(String[] args) throws Exception {
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


    }
}
