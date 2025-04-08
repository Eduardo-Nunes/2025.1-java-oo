import pratica1.Aluno;
import pratica1.Pessoa;
import pratica2.Cargo;
import pratica2.Disciplina;
import pratica2.Professor;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Hello, World!");

        pratica1();
        pratica2();
    }

    public static void pratica1(){
        Aluno a1 = new Aluno("Eduardo", 31, "2009734274929");
        a1.setNota1(9);
        a1.setNota2(10);
        a1.calcularMedia();
        System.out.println(a1);
    }

    public  static void pratica2(){
        Aluno a1 = new Aluno("Eduardo", 31, "2009734274929");
        Professor p1 = new Professor("Fernanda", 42, "Java");
        p1.setCargo(Cargo.PROFESSOR);
        Disciplina d1 = new Disciplina();

        System.out.println("Digite o nome da disciplina: ");
        d1.setNome(sc.nextLine());
        d1.cadastrarAluno(a1);
        d1.ministrarDisciplina(p1);

        System.out.println("\nInformações da Disciplina:");
        System.out.println(d1);
    }
}