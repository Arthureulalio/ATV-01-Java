package codigos;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("Esse e o menu de funcionalidades do sistema vc pode fazer as seguintes funcionalidades \n1-cadastrar cliente.\n2-listar clientes.\n3-excluir clientes.\n4-sair do programa. ");
        
        int opcao = sc.nextInt();
        System.out.println("===============================");
        Registro reg = new Registro();
        while (opcao != 5) {

            switch (opcao) {
                case 1:
                    reg.Inserir();
                    System.out.println("===============================");
                    System.out.println("Esse e o menu de funcionalidades do sistema vc pode fazer as seguintes funcionalidades \n1-cadastrar cliente.\n2-listar clientes.\n3-excluir clientes.\n4-sair do programa. ");
                    
                    opcao = sc.nextInt();
                    System.out.println("===============================");
                    break;
                case 2:
                    reg.listar();
                    System.out.println("===============================");
                    System.out.println("Esse e o menu de funcionalidades do sistema vc pode fazer as seguintes funcionalidades \n1-cadastrar cliente.\n2-listar clientes.\n3-excluir clientes.\n4-sair do programa. ");
            
                    opcao = sc.nextInt();
                    System.out.println("===============================");
                    break;
                case 3:
                    reg.excluir();
                    System.out.println("===============================");
                    System.out.println("Esse e o menu de funcionalidades do sistema vc pode fazer as seguintes funcionalidades \n1-cadastrar cliente.\n2-listar clientes.\n3-excluir clientes.\n4-sair do programa. ");
            
                    opcao = sc.nextInt();
                    System.out.println("===============================");
                    break;
                case 4:
                   reg.sair();
                    break;

                default:
                    System.out.println("error 404");
                    break;
            }
        sc.close();
        }

    }
}
