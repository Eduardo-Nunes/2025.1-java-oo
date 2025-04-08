package pratica1;

public class Aluno extends Pessoa{
    private String matricula;

    private double nota1, nota2, nota3, media;

    public Aluno(){
     super();
    }
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou um Aluno");
    }

    @Override
    public void minhaAtividade() {
        System.out.println("Aprender");
    }

    public void calcularMedia(){
        if (nota3 == 0.0){
            media = (nota1 + nota2)/2;
        }else{
            media = (nota1 + nota2 + nota3)/3;
        }
    }

    public String getMatricula() {
        return  matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public void greetings() {
        super.greetings();
        System.out.println("Minha média é: " + media );
        System.out.println("Minha matricula é: " + matricula );
    }
}
