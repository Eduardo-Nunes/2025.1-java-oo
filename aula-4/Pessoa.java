public class Pessoa {
    private String nome, cpf, rg;
    private int idade;
    private double altura, peso, imc;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(int idade){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getRg(){
        return this.rg;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return this.peso;
    }

    public void imprimirImc(){
        System.out.println("O IMC dessa pessoa é = "+ this.imc);
        String indice = new String();

        if (this.imc < 18.5) {
            indice = "Baixo Peso";
        } else if(this.imc < 25){
            indice = "Peso Normal";
        } else if(this.imc < 30){
            indice = "Pré Obesidade";
        } else if(this.imc < 35){
            indice = "Obesidade Grau 1";
        } else if(this.imc < 40){
            indice = "Obesidade Grau 2";
        } else {
            indice = "Obesidade Grau 3";
        }

        System.out.println("O indice de Obesidade dessa pessoa é o " + indice);
    }

    public void calcularImc(){
        this.imc = this.peso/(this.altura*this.altura);
    }

    public double getImc(){
        return this.imc;
    }

}
