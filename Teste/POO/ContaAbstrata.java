
public abstract class ContaAbstrata implements ContaIF{
    
    private int numero;
    private Agencia agencia;
    
    public Agencia getAgencia(){
        return agencia;
    }
    public void setAgencia(Agencia agencia){
        this.agencia = agencia;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int Numero){
        this.numero = numero;
    }
    
    
}
