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

/** Classe que contem os atributos da tabela produto, além de protegê-los */
/** encapsulando-os restringindo sua manipulação ao(s) gets e sets */

public class Produto {
    
    private int id;
    private String descricao;
    private String marca;
    private int quantidade;
    private float preco;
    
    public int getid(){
        return id;
    }
    
    public void setid(int id)
    {
        this.id = id;
    }
    
    public String getdescricao(){
        
        return descricao;
    }
    
    public void setdescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getmarca(){
        
        return marca;
    }
    public void setmarca(String marca)
    {
        this.marca= marca;
    }
    
    public int getquantidade(){
        return quantidade;
    }
    
    public void setquantidade(int quantidade)
    {
        this.quantidade= quantidade;
    }
    
    public float getpreco()
    {
        return preco;
    }
    
    public void setpreco(float preco)
    {
        this.preco = preco;
    }
}
