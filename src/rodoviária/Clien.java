
package rodoviaria;


public class Cliente {
        private String nome;
    private String telefone;
    private int idade;
    
/*Construtor Padrão*/
public Cliente(){
    this.nome = "não informado";
    this.idade = 0;
    this.telefone = "não informado";
}    
/*Construtor que cria a pessoa*/
public Cliente(String nome, String telefone, int idade){
    if(nome != null && !nome.trim().equals("")){
        this.nome = nome;
    }else{
        this.nome = "não informado";
    }
    if(idade > 0 && idade <= 110){
        this.idade = idade;
    }else{
        this.idade = 0;
    }
    if(telefone != null && telefone.trim().equals("")){
        this.telefone = telefone;
    }else{
        this.telefone = "não informado";
    }
}
/*Gets e sets da classe pessoa*/
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.trim().equals("")){
        this.nome = nome;
        }
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
        if(idade > 0 && idade <= 110){
        this.idade = idade;
        System.out.println("Digite a idade entre 1 e 110.");
        }
    }
    
    
}

    

