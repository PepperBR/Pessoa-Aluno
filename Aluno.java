public class Aluno extends Pessoa{
    private String matricula;
    private String instituicaoEnsino;

    // Construtor:

    public Aluno(String nome, String cpf , String dataNascimento, String logradouro, String numero, String bairro, String cidade, String uf, String matricula, String instituicaoEnsino){
        super(nome, cpf, dataNascimento, logradouro, numero, bairro, cidade, uf);
        this.matricula = matricula;
        this.instituicaoEnsino = instituicaoEnsino;
    }

    // Métodos Set:

    public void setMatricula (String matricula){
        this.matricula = matricula;
    }
    public void setInstituicaoEnsino (String instituicaoEnsino){
        this.instituicaoEnsino = instituicaoEnsino;
    }

    // Métodos Get:

    public String getMatricula (){
        return this.matricula;
    }
    public String getInstituicaoEnsino (){
        return this.instituicaoEnsino;
    }

    // Método ToString:

    public String toString (){
        String str = "";
        str += "Nome = " + getNome();
        str += "\nCPF = " + getCpf();
        str += "\nData de Nascimento = " + getDataNascimento();
        str += "\nLogradouro = " + getLogradouro();
        str += "\nNumero = " + getNumero();
        str += "\nBairro = " + getBairro();
        str += "\nCidade = " + getCidade();
        str += "\nUF = " + getUf();
        str += "\nMatricula = " + getMatricula();
        str += "\nInstituição de Ensino = " + getInstituicaoEnsino();
        return str;
    }
    
    public static void main (String [] args){
    Aluno aluno1 = new Aluno("João Marcelo", "052.468.153-82", "05/082004", "Rua Carlota Pinheiro", "255", "Guararapes", "Fortaleza", "CE", "20231015020144", "IFCE");
    
    System.out.println(aluno1.toString());
}
}
