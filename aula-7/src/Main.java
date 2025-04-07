import pratica1.Aluno;
import pratica1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Eduardo", 31);
        Aluno a1 = new Aluno(p1.getNome(), p1.getIdade(), "2009734274929");
        System.out.println("Hello, World!");
        a1.setNota1(9);
        a1.setNota2(10);
        a1.calcularMedia();
        System.out.println(p1);
        System.out.println(a1);
    }
}