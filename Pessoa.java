public class Pessoa{
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String uf;

    // Construtor:

    public Pessoa(String nome, String cpf , String dataNascimento, String logradouro, String numero, String bairro, String cidade, String uf){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
    }

    // Métodos Set:

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setCpf (String cpf){
        this.cpf = cpf;
    }
    public void setDataNascimento (String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    public void setLogradouro (String logradouro){
        this.logradouro = logradouro;
    }
    public void setNumero (String numero){
        this.numero = numero;
    }
    public void setBairro (String bairro){
        this.bairro = bairro;
    }
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
    public void setUf (String uf){
        this.uf = uf;
    }

    // Métodos Get:

    public String getNome (){
        return this.nome;
    }
    public String getCpf (){
        return this.cpf;
    }
    public String getDataNascimento (){
        return this.dataNascimento;
    }
    public String getLogradouro (){
        return this.logradouro;
    }
    public String getNumero (){
        return this.numero;
    }
    public String getBairro (){
        return this.bairro;
    }
    public String getCidade (){
        return this.cidade;
    }
    public String getUf (){
        return this.uf;
    }

    // Método ToString:


}