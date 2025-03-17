import java.util.Scanner;

import pratica1.Aluno;
import pratica1.Pessoa;
import pratica2.Barco;
import pratica2.Carro;
import pratica2.Moto;
import pratica2.Veiculo;

public class Main {
    public static void main(String[] args) {
      pratica1();

      pratica2();
    }

    private static void pratica1(){
        Pessoa pessoa = new Pessoa("Dudu", 31 );

        pessoa.greetings();

        Aluno aluno = new Aluno("Ingrid", 32, 101000);

        aluno.setNota1(10);
        aluno.setNota2(9.9);
        aluno.setNota3(10);

        aluno.calcularMedia();

        aluno.greetings();
    }

    private static void pratica2(){

        Carro carro = new Carro("Chevrolet", 5, "Cruze");

        carro.infosVeiculo();

        Moto moto = new Moto("Kawasaki", 300);

        moto.infosVeiculo();

        Barco barco = new Barco("Beneteau", 1000);

        barco.infosVeiculo();


    }
     private static void menu() {
        int option = 10;
        Scanner sc = new Scanner(System.in);

        while (option > 0) {
            System.out.println("--------- Inicio do Programa ---------");
            System.out.println("---------------- MENU ----------------");
            System.out.println("1 - Cadastrar Pessoa ");
            System.out.println("2 - Cadastrar Aluno ");
            System.out.println("3 - Cadastrar Veiculo ");
            System.out.println("4 - Cadastrar Carro ");
            System.out.println("5 - Cadastrar Moto ");
            System.out.println("6 - Cadastrar Barco ");
            System.out.println("0 - Sair ");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    option1();
                    break;
                case 2:
                    option2();
                    break;
                case 3:
                    option3();
                    break;
                case 4:
                    option4();
                    break;
                case 5:
                    option5();
                    break;
                case 6:
                    option6();
                    break;
                case 0:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("opção inválida");
                    break;
            }
        }

    }

    private static void option1() {

    }

    private static void option2() {

    }

    private static void option3() {

    }

    private static void option4() {

    }

    private static void option5() {

    }

    private static void option6() {

    }
}