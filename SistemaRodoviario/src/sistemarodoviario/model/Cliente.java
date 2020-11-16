package sistemarodoviario.model;

import sistemarodoviario.dao.ClienteDao;
import sistemarodoviario.dao.ExceptionDao;

public class Cliente {

    private String nome;
    private String telefone;
    private int idade;
    private String cpf;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

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

    public void cadastrarCliente2(Cliente cliente) throws ExceptionDao {
        new ClienteDao().cadastrarCliente(cliente);
    }

}
