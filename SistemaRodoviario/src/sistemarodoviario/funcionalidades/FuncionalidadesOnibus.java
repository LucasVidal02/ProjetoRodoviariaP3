
package sistemarodoviario.funcionalidades;
import sistemarodoviario.objetos.Assento;
import sistemarodoviario.objetos.Onibus;

public class FuncionalidadesOnibus {
    
    private Onibus[] onibus;
    private int cont;
    private boolean flag;
    private Assento a;
    private String lugar;
    
    
    public FuncionalidadesOnibus(Assento[] assento){
        
        this.cont = 0;
        
    }
    
    public FuncionalidadesOnibus(){
        
        this.cont = 0;
        this.onibus = new Onibus[30];
    }
    
    public void adicionarOnibus(Onibus o) {
        if (o == null || onibus.length == cont || procurarOnibus(o.getOnibusrotas()) != -1) {
            System.out.println("Não foi possível adicionar o onibus pois ja existe em nosso sistema!");
        } else {
            this.onibus[cont] = o;
            cont++;
            System.out.println("seu onibus foi adicionado com sucesso a sua empresa");
        }
        flag = false;
    }
    
    private int procurarOnibus(String Onibusrotas) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.onibus[i].getOnibusrotas().equals(Onibusrotas)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.onibus[meio].getOnibusrotas().compareToIgnoreCase(Onibusrotas) == 0) {
                    return meio;
                } else if (Onibusrotas.compareToIgnoreCase(this.onibus[meio].getOnibusrotas()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }
     
    public void resevarAssento(Onibus o) {
      
       if (o == null || onibus.length == cont || procurarOnibus(o.getOnibusrotas()) != -1) {
            System.out.println("o seu onibus existe e sua reserva foi feita");
            
        } else {
            this.onibus[cont] = o;
           System.out.println("esse onibus ainda noao exite");
        }
      
        flag = false;
    }
    
    public void exibir() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.onibus + " ");
        }
    }

}
    

