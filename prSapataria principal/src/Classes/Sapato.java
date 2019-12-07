
package Classes;


public class Sapato {
    private Integer codSapato;
    private Integer codCliente;
    private Integer codTipoSapato;
    private Integer codCorSapato; 
    private String tipoSapato;
    private String corSapato;
    private Integer numSapato;       
    private String marca;
    private String conserto;
    private Float valor;
    private String valorFormat;
    

    public Sapato(Integer codigo,Integer codCliente ,Integer codTipoSapato,
                  String tipoSapato, String corSapato, Integer NumSapato, Integer codCorSapato,
                  String Marca, String Conserto, Float Valor,String valorFormat) {
        this.codSapato = codigo;
        this.codCliente = codCliente;
        this.codTipoSapato = codTipoSapato;
        this.tipoSapato = tipoSapato;
        this.corSapato = corSapato;
        this.numSapato = NumSapato;
        this.codCorSapato = codCorSapato;
        this.marca = Marca;
        this.conserto = Conserto;
        this.valor = Valor;
        this.valorFormat = valorFormat;
    }

    public String getValorFormat() {
        return valorFormat;
    }

    public void setValorFormat(String valorFormat) {
        this.valorFormat = valorFormat;
    }

    public String getTipoSapato() {
        return tipoSapato;
    }

    public void setTipoSapato(String tipoSapato) {
        this.tipoSapato = tipoSapato;
    }

    public Sapato() {
        this.codSapato = 0;
        this.codCliente = 0;
        this.codTipoSapato = 0;
        this.codCorSapato = 0;
    }

    public String getCorSapato() {
        return corSapato;
    }

    public void setCorSapato(String corSapato) {
        this.corSapato = corSapato;
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

    public Integer getCodCorSapato() {
        return codCorSapato;
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

    public void setCodCorSapato(Integer codCorSapato) {
        this.codCorSapato = codCorSapato;
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
