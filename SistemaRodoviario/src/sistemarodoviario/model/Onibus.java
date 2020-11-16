package sistemarodoviario.model;

import sistemarodoviario.dao.ExceptionDao;
import sistemarodoviario.dao.OnibusDao;

public class Onibus {

    private String Rota;
    private Onibus[] onibus2 = new Onibus[2000];

    public Onibus(String Rota) {
        this.Rota = Rota;
    }

    public String getRota() {
        return Rota;
    }

    public Onibus[] getOnibus() {
        return onibus2;
    }

    public void setRota(String Rota) {
        this.Rota = Rota;
    }

    public void setOnibus(Onibus[] onibus) {
        this.onibus2 = onibus;
    }

    public void cadastrarOnibus2(Onibus onibus) throws ExceptionDao {
        new OnibusDao().cadastrarOnibus(onibus);
    }

}
