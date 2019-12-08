
package Classes;

import java.util.Date;


public class Venda {
    private Integer codVenda;
    private Integer codSapato;
    private Date data_entrada, 
                 data_saida,
                 data_pagamento;
    private Float valorPrevisto, 
                  valorFinal;

    public Venda(Integer codVenda, Integer codSapato, Date data_entrada, Date data_saida, Date data_pagamento, Float valorPrevisto, Float valorFinal) {
        this.codVenda = codVenda;
        this.codSapato = codSapato;
        this.data_entrada = data_entrada;
        this.data_saida = data_saida;
        this.data_pagamento = data_pagamento;
        this.valorPrevisto = valorPrevisto;
        this.valorFinal = valorFinal;
    }
    
    public Venda(){
        this.codSapato = 0;
        this.codVenda = 0;
    }

    public Integer getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(Integer codVenda) {
        this.codVenda = codVenda;
    }

    public Integer getCodSapato() {
        return codSapato;
    }

    public void setCodSapato(Integer codSapato) {
        this.codSapato = codSapato;
    }

    public Date getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Date data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Date getData_saida() {
        return data_saida;
    }

    public void setData_saida(Date data_saida) {
        this.data_saida = data_saida;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public Float getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(Float valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    
       
}
