
package Classes;


public class Sapato {
    private Integer codigo;
    private Integer tipoSapato;
    private Integer numSapato;       
    private String cor;       
    private String marca;
    private String conserto;
    private Float valor;        

    public Sapato(Integer codigo, Integer TipoSapato, Integer NumSapato, String Cor, String Marca, String Conserto, Float Valor) {
        this.codigo = codigo;
        this.tipoSapato = TipoSapato;
        this.numSapato = NumSapato;
        this.cor = Cor;
        this.marca = Marca;
        this.conserto = Conserto;
        this.valor = Valor;
    }

    public Sapato() {
        this.codigo = 0;
    }
 

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getTipoSapato() {
        return tipoSapato;
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

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setTipoSapato(Integer tipoSapato) {
        this.tipoSapato = tipoSapato;
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
