package codigos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Registro {
    private ArrayList<Clientes> clientes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void Inserir() {
        System.out.println("digite o nome: ");
        String nome = sc.nextLine();

        System.out.println("digite o cpf:");
        String cpf = sc.nextLine();

        System.out.println("digite o cep: ");
        String cep = sc.nextLine();

        System.out.println("digite o logradouro:  ");
        String log = sc.nextLine();

        System.out.println("digite o numero: ");
        int numn = sc.nextInt();

        System.out.println("digite o numero da conta:  ");
        int numeroDaConta = sc.nextInt();

        System.out.println("digite a agencia:  ");
        int agencia = sc.nextInt();

        System.out.println("digite a ddd:");
        int ddd = sc.nextInt();

        System.out.println("digite a numero de telefone:  ");
        int numt = sc.nextInt();

        clientes.add(new Clientes(nome, cpf, (new Endereco(cep, log, numn)),
                (new ArrayList<>(Arrays.asList(new Conta(numeroDaConta, agencia)))),
                (new ArrayList<>(Arrays.asList(new Telefone(ddd, numt))))));
    }

    public void listar() {
        if(clientes.size() >0 ){
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("O cliente numero " + (i + 1) + "\nNome do cliente:" + clientes.get(i).getNome()
                    + "\nCom o Cpf:" + clientes.get(i).getCpf() + "\nCom o Cep: "
                    + clientes.get(i).getEndereco().getCep() + "\nTendo o Logradouro "
                    + clientes.get(i).getEndereco().getLogradouro() + "\nE com tendo o numero da casa "
                    + +clientes.get(i).getEndereco().getNumero()
                    + "\nCom o seu numero da conta sendo " + clientes.get(i).getContas().get(i).getNumeroDaConta()
                    + "\nE com a agencia de numero " + clientes.get(i).getContas().get(i).getAgencia()
                    + "\nCom o telefone de  " + clientes.get(i).getTelefones().get(i).getDDD() + " - "
                    + clientes.get(i).getTelefones().get(i).getNumero());
        }
    }
    else{
        System.out.println("Não a clientes para se listar");
    }

    }

    public void excluir() {

        for (int j = 0; j < clientes.size(); j++) {
            System.out.println("o cliente numero " + (j+1) + " o cliente de nome " +
                    clientes.get(j).getNome() + " com a conta " +
                    clientes.get(j).getContas().get(j).getNumeroDaConta());
            System.out.println("Qual cliente voce dejesa excluir:");
            int opcao = sc.nextInt();
                opcao-=1;

            if (clientes.size() < 0) {
                System.out.println("Nao e possivel exculuir nem um cliente, tente cadrastrar novos clieentes");

            } else {
                System.out.println("Seu clientes ");
                clientes.remove(opcao);

            }

        }

    }
    public void sair() {
        System.out.println("voce quis sair do programa tchau");
        System.exit(0);
        
    }
}
