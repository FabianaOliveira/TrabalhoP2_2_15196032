/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author CASA-PC
 */

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/** Importa a classe modelo*/
import modelo.Produto;


public class ProdutoDao implements ProdutoDaoInterface{
    
    /** cria o método para inserir os dados na tabela produto*/
    public boolean inserir(Produto produto){
        Boolean retorno = false;
        String sql;
        /** instãncia o método conexão para se conectar com a base*/
        conexao conn = new conexao();
        try{
            
            /** instãncia o método Statement para realizar a inserção*/
            Statement stmt = (Statement) conn.getconn().createStatement();
            
            sql ="insert into produto(descricao,marca,quantidade,preco)values('";
            sql = sql + produto.getdescricao() + "','";
            sql = sql + produto.getmarca() + "',";
            sql = sql + produto.getquantidade() + ",";
            sql = sql + produto.getpreco() + ")";
            /** executa a inserção*/
            stmt.execute(sql);
            
            retorno = true;
            
        }catch(Exception e){
            e.fillInStackTrace();
        }finally{
            conn.fechaconexao();
        }
        
        return retorno;
    }
    
     /** cria o método listar para listar os produtos*/
    public List<Produto> listar()
    {
       conexao conn = new conexao();
       /** cria o atributo produto, através do método List, para retorna uma lista*/
       List<Produto> produto= new ArrayList<Produto>();
        
        try{
            
            Statement stmt = (Statement) conn.getconn().createStatement();
            /** instancia o método ResultSet para selecionar informações da tabela*/
            ResultSet rs = stmt.executeQuery("select * from produto");
            
             /** enquanto existir informação, realiza o loop*/
            while (rs.next())
            { 
                /** Instancia a classe produto */
                Produto produtos = new Produto();
                /** "alimenta" os atributos da classe produto com os dados da tabela*/
                produtos.setid(rs.getInt("id")); 
                produtos.setdescricao(rs.getString("descricao"));
                produtos.setmarca(rs.getString("marca")); 
                produtos.setquantidade(rs.getInt("quantidade"));
                produtos.setpreco(rs.getFloat("preco")); 
                /** "alimenta" a lista criada anteriormente*/
                produto.add(produtos);
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaconexao();
        }
        
        /** retorna a lista*/
        return produto;
    }
    
     /** cria o método excluir produto*/
    public boolean excluir_produto(int id)
    {
        boolean retorno = false;
        /** instancia o metodo conexao*/
        conexao conn = new conexao();
        
        try{
            /** instancia o método Statement */
            Statement stmt = (Statement) conn.getconn().createStatement();
            /** executa a exclusão*/
            stmt.execute("delete from produto where id=" + id);
            retorno= true;  
            
        }catch(Exception e)
        {
            e.fillInStackTrace();
        }finally{
            conn.fechaconexao();
        }
      
        return retorno;
        
    }
}
