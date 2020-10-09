package Rodoviaria;

public class Reservarassento {

    private final Assento[] onibus;
    private int cont;

    public Reservarassento() {
        this.cont = 0;
        this.onibus = new Assento[2];
    }

    public void addonibus(Assento a) {
        if (onibus.length == cont) {
            System.out.println("onibus lotado!");
        } else {
            this.onibus[cont] = a;
            cont++;
        }
    }

    public void listar() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.onibus + " ");
        }
    }

}
    
        
    


    
    
    
    

