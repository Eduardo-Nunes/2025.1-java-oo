package pratica2;

import pratica1.Pessoa;

public final class Professor extends Pessoa implements iRemunerate {
    private String especialidade;
    private Cargo cargo;

    public Professor() {
        super();
    }

    public Professor(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "especialidade='" + especialidade + '\'' +
                ", cargo=" + cargo +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o Professor");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Ensinar");
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void aplicarBonus() {

    }
}
