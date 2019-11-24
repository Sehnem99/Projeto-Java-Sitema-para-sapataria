
package Classes;


public class Sapato {
    private Integer codSapato;
    private Integer codCliente;
    private Integer codTipoSapato;
    private Integer numSapato;       
    private String cor;       
    private String marca;
    private String conserto;
    private Float valor;        

    public Sapato(Integer codigo,Integer codCliente ,Integer TipoSapato, Integer NumSapato, String Cor, String Marca, String Conserto, Float Valor) {
        this.codSapato = codigo;
        this.codCliente = codCliente;
        this.codTipoSapato = TipoSapato;
        this.numSapato = NumSapato;
        this.cor = Cor;
        this.marca = Marca;
        this.conserto = Conserto;
        this.valor = Valor;
    }

    public Sapato() {
        this.codSapato = 0;
        this.codCliente = 0;
    }
    
    
    public Integer getCodCliente() {
        return codCliente;
    }

    public Integer getCodSapato() {
        return codSapato;
    }

    public Integer getCodTipoSapato() {
        return codTipoSapato;
    }

    public Integer getNumSapato() {
        return numSapato;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getConserto() {
        return conserto;
    }

    public Float getValor() {
        return valor;
    }

    public void setCodSapato(Integer codSapato) {
        this.codSapato = codSapato;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }
    
    public void setCodTipoSapato(Integer codTipoSapato) {
        this.codTipoSapato = codTipoSapato;
    }

    public void setNumSapato(Integer numSapato) {
        this.numSapato = numSapato;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setConserto(String conserto) {
        this.conserto = conserto;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
            
}
