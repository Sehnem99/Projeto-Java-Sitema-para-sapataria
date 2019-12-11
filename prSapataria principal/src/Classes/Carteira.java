
package Classes;


public class Carteira {
    private String valorInicial;
    private String valorSaldo;
    private Float valorDespesa;
    private String valorTotalDespesa;
    private String descDespesa;
    private String dataAtual;
    

    public Carteira(String valorInicial, String valorSaldo, Float valorDespesa,
            String valorTotalDespesa, String descDespesa,String dataAtual) {
        this.valorInicial = valorInicial;
        this.valorSaldo = valorSaldo;
        this.valorDespesa = valorDespesa;
        this.valorTotalDespesa = valorTotalDespesa;
        this.descDespesa = descDespesa;
        this.dataAtual = dataAtual;
    }
    
    public Carteira(){
        
    }
    public String getValorInicial() {
        return valorInicial;
    }
    
    public String getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(String dataAtual) {
        this.dataAtual = dataAtual;
    }
    
    public void setValorInicial(String valorInicial) {
        this.valorInicial = valorInicial;
    }

    public String getValorSaldo() {
        return valorSaldo;
    }

    public void setValorSaldo(String valorSaldo) {
        this.valorSaldo = valorSaldo;
    }

    public Float getValorDespesa() {
        return valorDespesa;
    }

    public void setValorDespesa(Float valorDespesa) {
        this.valorDespesa = valorDespesa;
    }

    public String getValorTotalDespesa() {
        return valorTotalDespesa;
    }

    public void setValorTotalDespesa(String valorTotalDespesa) {
        this.valorTotalDespesa = valorTotalDespesa;
    }

    public String getDescDespesa() {
        return descDespesa;
    }

    public void setDescDespesa(String descDespesa) {
        this.descDespesa = descDespesa;
    }
    
}
