/*Snack 2: Gestione di un Conto
Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.*/


/* public class ContoBancario {
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
        

   

} */

//CORREZIONE

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(){
        Random rand = new Random();
        this.numeroConto = rand.nextInt(999999);
        this.saldo = new BigDecimal(0);
    }

    public ContoBancario(int numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = new BigDecimal(0);
    }

    public int getNumeroConto(){
        return this.numeroConto;
    }

    public void setNumeroConto(int numeroConto){
        this.numeroConto = numeroConto;
    }

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    private void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public void deposita(BigDecimal sommaDaDepositare){
        if (sommaDaDepositare.compareTo(new BigDecimal(0)) == 1) {
            this.saldo = this.saldo.add(sommaDaDepositare);
        }
    }

    public boolean ritira(BigDecimal sommaDaRitirare){
        if(sommaDaRitirare.compareTo(new BigDecimal(0)) == 1 && this.saldo.compareTo(sommaDaRitirare) == 1){
            this.saldo = this.saldo.subtract(sommaDaRitirare);
            return true;
        }
        return false;
    }
    
}