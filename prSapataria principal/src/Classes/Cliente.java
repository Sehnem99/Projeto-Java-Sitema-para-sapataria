
package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private Integer codigo;
    private String nome;
    private String cpf;
    private String data_nasc;
    private Integer cep;
    private String num;
    private String logradouro, bairro, cidade, uf;
    private String contato;
    private Integer ativo;

    @Override
    public String toString() {
        String s = "Cliente" + "nome=" + nome+
                "\nCPF" + cpf + 
                "\nData de Nasciemtno " + data_nasc +
                "\nContato" + contato +
                "logradouro " + logradouro + "Nº " + 
                "\nBairro " + bairro + " - Cidade " + cidade  +
                "\nCEP " + cep +" -  UF " + uf +
                "\nCliente Ativo: " + ativo +
                "\n------------------------------------------------------------";
                for(Sapato p: lista){
                    s += p.toString() + "\n";
                }
                return s;
    }
//Construtor
    public Cliente(String nome, String cpf, String data_nasc, String contato,
                   Integer cep, String logradouro, String num,
                   String bairro, String cidade, String uf, Integer ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.data_nasc = data_nasc;
        this.contato = contato;
        this.cep = cep;
        this.logradouro = logradouro;
        this.num = num;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.ativo = ativo;
    }
    
 //Construtor
    public Cliente(){
       this.codigo = 0; 
    }
    
    
 //agregação
 private ArrayList<Sapato> lista =
          new ArrayList<>(); 
    
     public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
    public Integer getCodigo() {
        return codigo;
    }

    public String getContato() {
        return contato;
    }

    public Integer getAtivo() {
        return ativo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setAtivo(Integer ativo) {
        this.ativo = ativo;
    }  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
    
    
            
    
    
}
