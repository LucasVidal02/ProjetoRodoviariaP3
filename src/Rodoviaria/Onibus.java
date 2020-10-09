
package Rodoviaria;


public class Onibus {
      private String Onibusrotas;
    
    private Onibus onibus[] = new Onibus[2000];
    
   

   
    
    
    public Onibus(String Onibusrotas){
        this.Onibusrotas = Onibusrotas;
    }    

    public Onibus[] getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus[] onibus) {
        this.onibus = onibus;
    }

    public String getOnibusrotas() {
        return Onibusrotas;
    }

    public void setOnibusrotas(String Onibusrotas) {
        this.Onibusrotas = Onibusrotas;
    }
}
