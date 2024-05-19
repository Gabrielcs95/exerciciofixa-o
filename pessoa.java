package ResumoProva;

public class pessoa {
    String nomeFunc;
    double salarioBruto;
    double imposto;

    public double salarioLiquido(){
        return this.salarioBruto - this.imposto;

    }
    public void aumentoSalarial(double porcentagem){
        this.salarioBruto += (this.salarioBruto * porcentagem) / 100.0;

    }
    public String toString(){
        return this.nomeFunc + ", $ " + String.format("%.2f", this.salarioLiquido());
    }
}
