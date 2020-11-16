package sistemarodoviario.controller;


import sistemarodoviario.dao.ClienteDao;
import sistemarodoviario.dao.ExceptionDao;
import sistemarodoviario.model.Cliente;

public class ClinteControler {

    private final Cliente[] cliente2;
    private int cont;
    private boolean flag;

    public ClinteControler() {

        this.cont = 0;
        this.cliente2 = new Cliente[2000];

    }
    public boolean adicionarCliente2(Cliente c) throws ExceptionDao {
        if (c == null || cliente2.length == cont || procurarCPF(c.getCpf()) != -1) {
            return false;
        } else {
            this.cliente2[cont] = c;
            cont++;
            new ClienteDao().cadastrarCliente(c);
        }
        return true;
    }

    private int procurarCPF(String cpf) {
        if (flag == true) {
            for (int i = 0; i < cont; i++) {
                if (this.cliente2[i].getCpf().equals(cpf)) {
                    return i;
                }
            }
            return -1;
        } else {

            int inicio = 0, fim = this.cont - 1, meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (this.cliente2[meio].getCpf().compareToIgnoreCase(cpf) == 0) {
                    return meio;
                } else if (cpf.compareToIgnoreCase(this.cliente2[meio].getCpf()) < 0) {
                    fim = meio - 1;
                } else {
                    inicio = meio + 1;
                }
            }
            return -1;
        }
    }

}
