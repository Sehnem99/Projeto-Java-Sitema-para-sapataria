
package Classes;


public class CorSapato {
    private Integer codCorSapato;
    private String nomeCorSapato;

    
    public CorSapato(Integer codSapato, String nomeCorSapato) {
        this.codCorSapato = codSapato;
        this.nomeCorSapato = nomeCorSapato;
    }
     public CorSapato() {
        codCorSapato=0;
    }
        
    
    public Integer getCodCorSapato() {
        return codCorSapato;
    }

    public void setCodCorSapato(Integer codCorSapato) {
        this.codCorSapato = codCorSapato;
    }

    public String getNomeCorSapato() {
        return nomeCorSapato;
    }

    public void setNomeCorSapato(String nomeCorSapato) {
        this.nomeCorSapato = nomeCorSapato;
    }

    @Override
    public String toString() {
        return getNomeCorSapato();
    }   
    
}
