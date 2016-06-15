/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.cliente;

/**
 *
 * @author CASA-PC
 */
/** tornei uma classe abstrata para implementar a interface */
public abstract class ClienteDao  implements ClienteDaoInterface{
    
    /** cria o método para inserir os dados na tabela cliente*/
    public Boolean Inserir(cliente clnt)
    {
        Boolean retorno= false;
        String sql;
        /** instãncia o método conexão para se conectar com a base*/
        conexao conn= new conexao();
        
        try{
            
            /** instãncia o método Statement para realizar a inserção*/
            Statement stmt = (Statement) conn.getconn().createStatement();
  
            sql="insert into cliente (nome,cpf,endereco,bairro,cidade,cep,telefone,celular)";
            sql = sql + "values('" + clnt.getnome() + "','";
            sql = sql + clnt.getcpf() + "','";
            sql = sql + clnt.getendereco() + "','";
            sql = sql + clnt.getbairro()+ "','";
            sql = sql + clnt.getcidade() + "','";
            sql = sql + clnt.getcep()+ "','";
            sql = sql + clnt.gettelefone() + "','";
            sql = sql + clnt.getcelular() + "')";
            
            /** executa a inserção*/
            stmt.execute(sql);
            retorno= true;
            
        }catch(Exception e)
        {
            e.printStackTrace();;
        }finally{
            conn.fechaconexao();
        }
        
        return retorno;
    }
    
    /** cria o método listar para listar os clientes*/
    public List<cliente> listar()
    {   
        /** cria o atributo cliente, através do método List, para retorna uma lista*/
        List<cliente> clientes= new ArrayList<cliente>();
        
        conexao conn = new conexao();
        
        try{
            
            Statement stmt = (Statement) conn.getconn().createStatement();
            /** instancia o método ResultSet para selecionar informações da tabela*/
            ResultSet rs = stmt.executeQuery("select * from cliente where id >0");
            
            /** enquanto existir informação, realiza o loop*/
            while (rs.next())
            {
                 /** Instancia a classe cliente */
                cliente clnt = new cliente();
                
                 /** "alimenta" os atributos da classe cliente com os dados da tabela*/
                clnt.setid(rs.getInt("id")); 
                clnt.setnome(rs.getString("nome"));
                clnt.setcpf(rs.getString("cpf")); 
                clnt.setendereco(rs.getString("endereco"));
                clnt.setbairro(rs.getString("bairro")); 
                clnt.setcidade(rs.getString("cidade"));
                clnt.setcep(rs.getString("cep")); 
                clnt.settelefone(rs.getString("telefone"));
                clnt.setcelular(rs.getString("celular")); 
 
                 /** "alimenta" a lista criada anteriormente*/
                clientes.add(clnt);
                
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        finally{
            conn.fechaconexao();
        }
        /** retorna a lista*/
        return clientes;
    }
    
    /** cria o método existe_cliente cujo objetivo é evitar duplicidade de cadastro*/
    public boolean existe_cliente(String cpf)
    {   
        /** instancia o metodo conexao*/
        conexao conn= new conexao();
        Boolean retorno= false;
        
        try{
        /** cria o método Statement */
        Statement stmt = (Statement) conn.getconn().createStatement();
        /** cria o método ResultSet para verificar se o cpf ja foi cadastrado */
        ResultSet rs = stmt.executeQuery("select * from cliente where cpf='" + cpf + "'");
        
        /** Se existir registro, retorna true */
        if (rs.next())
        {
            retorno=true;
        }
        
        }catch(Exception e)
        {
            e.fillInStackTrace();
        }finally{
            conn.fechaconexao();
        }
        
        return retorno;
        
    }
    
    /** cria o método excluir cliente*/
    public boolean excluir_cliente(int id)
    {
        boolean retorno = false;
         /** instancia o metodo conexao*/
        conexao conn = new conexao();
        
        try{
            /** instancia o método Statement */
            Statement stmt = (Statement) conn.getconn().createStatement();
            /** executa a exclusão*/
            stmt.execute("delete from cliente where id=" + id);
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
