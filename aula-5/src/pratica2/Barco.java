package pratica2;

public class Barco extends Veiculo {
    private int potMotor;

    public Barco(String marca, int potMotor) {
        super(marca);
        this.potMotor = potMotor;
    }

    public int getPotMotor() {
        return potMotor;
    }

    public void setPotMotor(int potMotor) {
        this.potMotor = potMotor;
    }

    @Override
    public void infosVeiculo() {
        super.infosVeiculo();
        System.out.println("Potência do motor: " + potMotor);
    }
}