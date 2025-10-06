public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public Aluno(String cpf, String rg, char sexo, String nome, int ra) {
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.nome = nome;
        this.ra = ra;
    }


    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dia, int mes, int ano) {
        this.dataNasc = new Data(dia, mes, ano);
    }

    public void imprimir () {
        System.out.println("RA: " + this.ra);
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Telefone: " + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de nascimento: " + this.dataNasc.formatarData());
    }
}
