public class Conta extends ContaAbstrata{
    
    private double limite; //Especifico de conta. Nao se aplica a poupanca
        
    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}
