public class Poupanca extends ContaAbstrata{
    private double variacao; //Especifico de conta. Nao se aplica a poupanca

    
    public void setVariacao(double variacao) {
        this.variacao = variacao;
    }

    public double getVariacao() {
        return variacao;
    }

       
}
