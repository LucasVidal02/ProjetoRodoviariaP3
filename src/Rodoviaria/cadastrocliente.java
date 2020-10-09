package Rodoviaria;

public class cadastrocliente {

    private Cliente[] cliente;
  

    private int cont;
    private boolean flag;

    public cadastrocliente() {
        this.cont = 0;
        this.cliente = new Cliente[2000];
    }

    public void addpessoa(Cliente cli) {
        if (cli == null || cliente.length == cont || procurarcpf(cli.getCpf()) != -1) {
            System.out.println("Não foi possível adicionar o cliente pois ja existe o cpf em nosso sistema");
        } else {
            this.cliente[cont] = cli;
            cont++;
            System.out.println("Foi adicionado com sucesso");
        }
        flag = false;
    }

    private int procurarcpf(String cpf) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.cliente[i].getCpf().equals(cpf)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.cliente[meio].getCpf().compareToIgnoreCase(cpf) == 0) {
                    return meio;
                } else if (cpf.compareToIgnoreCase(this.cliente[meio].getCpf()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }
 
    public int exibir(String c) {
        for (int i = 0; i < this.cont; i++) {
            if (this.cliente[i].equals(c)) {
                return i;
            }
        }
        return -1;
    }

    public void listar() {
        int i;
        for (i = 0; i < this.cont; i++) {
            System.out.println(this.cliente[i] + " ");
        }
    }
}
