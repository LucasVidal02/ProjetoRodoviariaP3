package sistemarodoviario.objetos;


public class Cliente {
    
    private String nome;
    private String telefone;
    private int idade;
    private String cpf;
     
   
    /*Construtor*/
    
    public Cliente(String cpf) {
        this.cpf = cpf;
    }
   
    /*Gets e Sets para Cliente*/
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /*Método toString*/
    
    @Override
    public String toString() {
        return "Cliente{" + "Nome: " + nome + ", Telefone: " + telefone + ", Idade: " + idade + ", CPF: " + cpf + '}';
    }
   
}
    

