package Classes;
import Interface.frmLogin;
import db.ServicoConexao;
import db.ServicoLogin;

public class Login {
    private int codUsuario;
    private String login;
    private String senha;

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void validaLogin(){
        
    }
    
}
