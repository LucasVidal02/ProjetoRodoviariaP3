package Rodoviaria;

public class Cadastraonibus {

    private Onibus[] onibus;
    private int cont, contador;
    private boolean flag;
    private Assento a;
    private String lugar;
    
  Reservarassento Assento = new  Reservarassento();
    public Cadastraonibus(Assento[] assento) {
        this.contador = 0;
        
    }
    
  

    public Cadastraonibus() {
        this.cont = 0;
        this.onibus = new Onibus[30];

    }

    public void addonibus(Onibus o) {
        if (o == null || onibus.length == cont || procuraronibus(o.getOnibusrotas()) != -1) {
            System.out.println("Não foi possível adicionar o onibus pois ja existe em nosso sistema!");
        } else {
            this.onibus[cont] = o;
            cont++;
            System.out.println("seu onibus foi adicionado com sucesso a sua empresa");
        }
        flag = false;
    }

    private int procuraronibus(String Onibusrotas) {
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
    
    
  public void resevar(Onibus o) {
      
       if (o == null || onibus.length == cont || procuraronibus(o.getOnibusrotas()) != -1) {
            System.out.println("o seu onibus existe e sua reserva foi feita");
            
        } else {
            this.onibus[cont] = o;
           System.out.println("esse onibus ainda noao exite");
        }
      
        flag = false;
    }

    public int exibir(String c) {
        for (int i = 0; i < this.cont; i++) {
            if (this.onibus[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public void listar() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.onibus + " ");
        }
    }
}

/*
    public boolean adicionaPassageiro(int lugar, Cliente c) {

        if (lugar < this.lugares.length && lugar >= 0) {
            if (lugares[lugar] == null) {
                Assento a = new Assento();
                a.setCliente(c);
                this.lugares[lugar] = a;
                return true;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public String imprimePassageiros() {
        String lista = "";
        for (int cont = 0; cont < this.lugares.length; cont++) {
            if (lugares[cont] != null) {
                lista += "Passageiro " + lugares[cont].getCliente().getNome() + "Assento "
                        + (cont + 1) + "\n";
            }
        }
        return lista;
    }
}*/