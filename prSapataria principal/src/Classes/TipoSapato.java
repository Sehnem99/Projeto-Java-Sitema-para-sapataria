
package Classes;

public class TipoSapato {
    private Integer codTipoSapato;
    private String nomeTipoSapato;

    public TipoSapato(Integer codTipoSapato, String nomeTipoSapato) {
        this.codTipoSapato = codTipoSapato;
        this.nomeTipoSapato = nomeTipoSapato;
    }
    public TipoSapato(){
        this.codTipoSapato = 0;
    }
    
    public Integer getCodTipoSapato() {
        return codTipoSapato;
    }

    public String getNomeTipoSapato() {
        return nomeTipoSapato;
    }

    public void setCodTipoSapato(Integer codTipoSapato) {
        this.codTipoSapato = codTipoSapato;
    }

    public void setNomeTipoSapato(String nomeTipoSapato) {
        this.nomeTipoSapato = nomeTipoSapato;
    } 

    @Override
    public String toString() {
        return getNomeTipoSapato(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
