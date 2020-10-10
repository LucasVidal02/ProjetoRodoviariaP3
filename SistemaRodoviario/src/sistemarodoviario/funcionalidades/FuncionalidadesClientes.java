
package sistemarodoviario.funcionalidades;
import sistemarodoviario.objetos.Cliente;


public class FuncionalidadesClientes {
    
    private Cliente[] cliente;
    private int cont;
    private boolean flag;
    
    /*Construtor*/
    
    public FuncionalidadesClientes(){
        
        this.cont = 0;
        this.cliente = new Cliente[2000];
        
    }
    
    /*Método para Adicionar Cliente*/
    
    public void adicionarCliente(Cliente c) {
        if (c == null || cliente.length == cont || procurarCPF(c.getCpf()) != -1) {
            System.out.println("Não foi possível adicionar o cliente pois o CPF já está cadastrado!");
        } else {
            this.cliente[cont] = c;
            cont++;
            System.out.println("O cliente foi adicionado com sucesso!");
        }
        flag = false;
    }
    
    /*Método para procurar CPF do cliente para saber se foi ou não cadastrado*/
    
    private int procurarCPF(String cpf) {
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
