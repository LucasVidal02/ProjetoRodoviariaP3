
package sistemarodoviario.menuprincipal;

import java.util.Scanner;
import sistemarodoviario.funcionalidades.FuncionalidadesAssento;
import sistemarodoviario.funcionalidades.FuncionalidadesClientes;
import sistemarodoviario.funcionalidades.FuncionalidadesOnibus;
import sistemarodoviario.funcionalidades.FuncionalidadesValidacao;
import sistemarodoviario.objetos.Assento;
import sistemarodoviario.objetos.Cliente;
import sistemarodoviario.objetos.Onibus;

public class MenuPrincipal {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       String nome, telefone, cpf, onibusrotas, lugar = "1";
       int op, idade;
       
       Onibus o;
       Cliente c;
       Assento a;
       
       FuncionalidadesClientes Cliente = new FuncionalidadesClientes();
       FuncionalidadesOnibus Onibus = new FuncionalidadesOnibus();
       FuncionalidadesAssento Assento = new FuncionalidadesAssento();
       FuncionalidadesValidacao Validacao = new FuncionalidadesValidacao();
       
       do {
            menuOpcoes();

            System.out.print("Digite uma opção: ");
            op = in.nextInt();
            in.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Digite seu Cpf :");
                    cpf = in.nextLine();
                    Validacao.validaCPF(cpf);
                    System.out.println(Validacao.imprimeCPF(cpf)); 

                    c = new Cliente(cpf);

                    System.out.print("Digite seu Nome :");
                    nome = in.nextLine();
                    c.setNome(nome);

                    System.out.print("Digite sua Idade :");
                    idade = in.nextInt();
                    in.nextLine();
                    Validacao.validaIdade(idade);
                    c.setIdade(idade);

                    System.out.print("Digite seu Telefone :");
                    telefone = in.nextLine();

                    c.setTelefone(telefone);

                    Cliente.adicionarCliente(c);
                    break;

                case 2:

                    Cliente.listar();
                    break;

                case 3:
                    System.out.println("Rota que o onibus irá realizar.");
                    onibusrotas = in.nextLine();
                    o = new Onibus(onibusrotas);
                    o.setOnibusrotas(onibusrotas);
                    Onibus.adicionarOnibus(o);

                    break;
                case 4:

                    System.out.println("Rota que o onibus irá realizar.");
                    onibusrotas = in.nextLine();
                    o = new Onibus(onibusrotas);
                    o.setOnibusrotas(onibusrotas);
                    Onibus.resevarAssento(o);
                    a = new Assento(lugar);
                    a.setLugar(lugar);
                    Assento.adicionarAssento(a);

                    break;
                case 5:

                case 0:
                    System.out.println("Sair do onibus");

                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
    }

    public static void menuOpcoes() {
        System.out.println("Digite uma opção:");
        System.out.println("1 - Cadastrar Cliente:");
        System.out.println("2 - Vizualizar cadastros de Clientes:");
        System.out.println("3 - Adicionar onibus a frota;");
        System.out.println("4 - Reservar assento:");
    }
}
       
    
    

