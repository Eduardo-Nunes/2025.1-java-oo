package pratica1;

public abstract class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(){

    }
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public abstract void quemSouEu();
    public abstract void minhaAtividade();

    public void aniversario(){
        idade++;
    }

    public void greetings(){
        System.out.println("Olá, me chamo " + nome + " e tenho " + idade);
    }
}
