package sistemarodoviario.funcionalidades;

import sistemarodoviario.objetos.Assento;


public class FuncionalidadesAssento {
    
    private final Assento[] onibus;
    private int cont;

    public FuncionalidadesAssento() {
        
        this.cont = 0;
        this.onibus = new Assento[2];      
    }

    /*Método para criar novo Assento.*/
    
    public void adicionarAssento(Assento a) {
        if (onibus.length == cont) {
            System.out.println("Onibus lotado!");
        } else {
            this.onibus[cont] = a;
            cont++;
        }
    }
    
    /*Método para Exibir os Assentos*/
    
    public void exibir() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.onibus + " ");
        }
    }
    
    
}
