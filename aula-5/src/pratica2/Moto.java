package pratica2;

public class Moto extends Veiculo {
    private int qntdCilindradas;

    public Moto(String marca, int qntdCilindradas) {
        super(marca);
        this.qntdCilindradas = qntdCilindradas;
    }

    public int getQntdCilindradas() {
        return qntdCilindradas;
    }

    public void setQntdCilindradas(int qntdCilindradas) {
        this.qntdCilindradas = qntdCilindradas;
    }

    @Override
    public void infosVeiculo() {
        super.infosVeiculo();
        System.out.println("Cilindradas: " + qntdCilindradas);
    }
}