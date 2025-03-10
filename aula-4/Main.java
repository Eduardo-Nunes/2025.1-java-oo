import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("PESO");
        p.setPeso(sc.nextDouble());
        System.out.println("ALTURA");
        p.setAltura(sc.nextDouble());
        p.calcularImc();
        System.out.println("IMC: " + p.getImc());
        p.imprimirImc();

        sc.close();
    }
}