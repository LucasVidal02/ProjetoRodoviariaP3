package sistemarodoviario.objetos;


public class Assento {
    
    private String lugar;
    
    /*Construtor*/

    public Assento(String lugar) {
        this.lugar = lugar;
    }
    
    /*Gets e Sets para Assento*/

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
}
