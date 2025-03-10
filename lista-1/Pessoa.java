public class Pessoa {
    private String nome;
    private int idade, cpf;
    private double altura;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(int idade){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public int getCpf(int cpf){
        return this.cpf;
    }
}
