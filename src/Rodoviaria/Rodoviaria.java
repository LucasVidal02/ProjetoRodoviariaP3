package Rodoviaria;

import java.util.Scanner;

public class Rodoviaria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        cadastrocliente Cliente = new cadastrocliente();
        Cadastraonibus Onibus = new Cadastraonibus();
        Reservarassento Assento = new Reservarassento();

        String nome, telefone, cpf, onibusrotas, lugar = "1";
        int onibus, idade;
        Onibus d;
        Onibus o;
        Cliente c;
        Assento a;

        do {
            menuOpcoes();

            System.out.print("Digite opeçao: ");
            onibus = in.nextInt();
            in.nextLine();

            switch (onibus) {
                case 1:
                    System.out.print("Cpf :");
                    cpf = in.nextLine();

                    c = new Cliente(cpf);

                    System.out.print("Nome :");
                    nome = in.nextLine();
                    c.setNome(nome);

                    System.out.print("idade :");
                    idade = in.nextInt();
                    in.nextLine();
                    c.setIdade(idade);

                    System.out.print("telefone :");
                    telefone = in.nextLine();

                    c.setTelefone(telefone);

                    Cliente.addpessoa(c);
                    break;

                case 2:

                    Cliente.listar();
                    break;

                case 3:
                    System.out.println("Rota que o onibus irá realizar.");
                    onibusrotas = in.nextLine();
                    o = new Onibus(onibusrotas);
                    o.setOnibusrotas(onibusrotas);
                    Onibus.addonibus(o);

                    break;
                case 4:

                    System.out.println("Rota que o onibus irá realizar.");
                    onibusrotas = in.nextLine();
                    o = new Onibus(onibusrotas);
                    o.setOnibusrotas(onibusrotas);
                    Onibus.resevar(o);
                    a = new Assento(lugar);
                    a.setLugar(lugar);
                    Assento.addonibus(a);

                    break;
                case 5:

                case 0:
                    System.out.println("Sair do onibus");

                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (onibus != 0);
    }

    public static void menuOpcoes() {
        System.out.println("digite uma opção");
        System.out.println("1-cadastrar passageiro");
        System.out.println("2-vizualizar cadastros de pasageiros");
        System.out.println("3-adicionar onibus a frota");
        System.out.println("4-reservar assento");
    }
}
