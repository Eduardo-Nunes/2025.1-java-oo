package pratica2;

public class Carro extends  Veiculo {
    private int qntdPortas;
    private String modelo;

    public Carro(String marca, int qntdPortas, String modelo) {
        super(marca);
        this.qntdPortas = qntdPortas;
        this.modelo = modelo;
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void infosVeiculo() {
        super.infosVeiculo();
        System.out.println("Modelo: " + modelo);
        System.out.println("No de portas: " + qntdPortas);
    }
}