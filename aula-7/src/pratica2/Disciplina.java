package pratica2;

import pratica1.Aluno;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;
    private final ArrayList<Aluno> alunos;
    private Professor professor;

    public Disciplina() {
        alunos = new ArrayList<>();
    }

    public Disciplina(String nome, int cargaHoraria, Aluno aluno, Professor professor) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.alunos.add(aluno);
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", alunos=" + alunos +
                ", professor=" + professor +
                '}';
    }

    public void cadastrarAluno(Aluno aluno){
        if (this.alunos.contains(aluno)){
            return;
        }
        this.alunos.add(aluno);
    }

    public void ministrarDisciplina(Professor professor){
        this.professor = professor;
    }
}
