
package Classes;

import java.util.Date;


public class Venda {
    private Integer codVenda;
    private Integer codSapato;
    private String data_pagamento;
    private Float valorFinal;

    public Venda(Integer codVenda, Integer codSapato, String data_pagamento, Float valorFinal) {
        this.codVenda = codVenda;
        this.codSapato = codSapato;
        this.data_pagamento = data_pagamento;
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

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }
    
    public Float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Float valorFinal) {
        this.valorFinal = valorFinal;
    }
    
    
       
}
