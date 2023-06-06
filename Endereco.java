package codigos;
public class Endereco {
    private String Cep;
    private String Logradouro;
    private int Numero;

    Endereco(String cep, String logradouro, int numero){
        this.Cep = cep;
        this.Logradouro = logradouro;
        this.Numero = numero;
        
    }
    
    public String getCep() {
        return Cep;
    }
    public void setCep(String cep) {
        Cep = cep;
    }
    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String logradouro) {
        Logradouro = logradouro;
    }
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }

}
