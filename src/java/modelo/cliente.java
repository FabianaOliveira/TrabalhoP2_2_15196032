/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author CASA-PC
 */
import java.util.Date;

/** Classe que contem os atributos da tabela cliente, além de protegê-los */
/** encapsulando-os restringindo sua manipulação ao(s) gets e sets */
public class cliente {
    
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private Date datanascimento;
    private String bairro;
    private String cidade;
    private String cep;
    private String telefone;
    private String celular;
    
    public int getid()
    {
        return id;
    }
    
    public void setid(int id)
    {
        this.id= id;
    }
    
    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome)
    {
        this.nome= nome;
    }
    
    public String getcpf(){
        return cpf;
    }
    
    public void setcpf(String cpf)
    {
        this.cpf= cpf;
    }
    
    public String getendereco(){
        return endereco;
    }
    
    public void setendereco(String endereco)
    {
        this.endereco= endereco;
    }
    
     public Date getdtnasc(){
        return datanascimento;
    }
    
    public void setdtnasc(Date datanascimento)
    {
        this.datanascimento= datanascimento;
    }
    
    public String getbairro(){
        return bairro;
    }
    
    public void setbairro(String bairro)
    {
        this.bairro= bairro;
    }
    
    public String getcidade(){
        return cidade;
    }
    
    public void setcidade(String cidade)
    {
        this.cidade= cidade;
    }
    
    public String getcep(){
        return cep;
    }
    
    public void setcep(String cep)
    {
        this.cep= cep;
    }
    
    public String gettelefone(){
        return telefone;
    }
    
    public void settelefone(String telefone)
    {
        this.telefone= telefone;
    }
    
    public String getcelular(){
        return celular;
    }
    
    public void setcelular(String celular)
    {
        this.celular= celular;
    }
}
