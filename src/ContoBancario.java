/*Snack 2: Gestione di un Conto
Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.*/


public class ContoBancario {
    private long conto;
    private double saldo;

        //Costruttore che accetta il numero di conto e inizializza il saldo a zero
    public ContoBancario(long conto){
        this.conto = conto;
        this.saldo = 0.0;
    }
        //metodo publico per depositare denaro sul conto
    public void deposita(double importo) {
        if(importo > 0){
        this.saldo += importo;
        }
    }

    public void preleva(double preleva){
        if(saldo > 0 && preleva < saldo){
            this.saldo -= preleva;
        }
    }


        //metodo per ottenere il saldo corrente
    public double getSaldo(){
        return this.saldo;
    }
        

   

}
