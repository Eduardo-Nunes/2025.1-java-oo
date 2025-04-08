package pratica2;

import pratica1.Pessoa;

public class Coordenador extends Pessoa implements iRemunerate {
    private String curso;

    public Coordenador() {
        super();
    }

    public Coordenador(String nome, int idade) {
        super(nome, idade);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o Coordenador");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Coordenar");
    }

    @Override
    public void calcularSalario() {

    }

    @Override
    public void aplicarBonus() {

    }
}
