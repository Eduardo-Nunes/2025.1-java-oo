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

        Aluno aluno = new Aluno("Ingrid", 32, 101000, 10,10,10, 0);

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
}