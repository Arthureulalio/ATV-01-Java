package codigos;
import java.util.ArrayList;

public class Clientes {
    private String nome;
    private String cpf;
    private ArrayList <Conta> contas = new ArrayList<>();
    private Endereco endereco;
    private ArrayList <Telefone> telefones = new ArrayList<>();

    Clientes(String nome,String cpf, Endereco endereco, ArrayList<Conta> conta, ArrayList <Telefone> telefones){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefones = telefones;
        this.contas = conta;

    }
    public ArrayList<Conta> getContas() {
        return contas;
    }
    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    
}
