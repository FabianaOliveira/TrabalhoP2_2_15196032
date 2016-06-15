/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import dao.ClienteDao;
import java.util.List;

/**
 *
 * @author CASA-PC
 */

public class ClienteRn {
    
    public boolean cadastro_cliente_dao(cliente cliente){
        
        Boolean retorno = false;
        
         if (cliente.getnome()=="" || cliente.getcpf()=="" || cliente.getendereco()=="" || cliente.getbairro()=="" || cliente.getcidade()=="" || cliente.getcep()=="" || cliente.gettelefone()=="")
        {
           retorno =false;
           
        }else
        {
            ClienteDao dao = new ClienteDao() {
                @Override
                public boolean inserir(cliente c) throws Exception {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
            retorno=dao.Inserir(cliente);
        }
        return retorno;
    }
    
   public boolean existe_cliente_dao(String cpf)
   {    
        ClienteDao dao = new ClienteDao() {
            @Override
            public boolean inserir(cliente c) throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        return dao.existe_cliente(cpf);
    
   }
   
   public boolean excluir_cliente_dao(int id)
   {
       ClienteDao dao = new ClienteDao() {
           @Override
           public boolean inserir(cliente c) throws Exception {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       };
       return dao.excluir_cliente(id);
   }
   
   public List<cliente> listar()
   {
        
        ClienteDao dao = new ClienteDao() {
            @Override
            public boolean inserir(cliente c) throws Exception {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        List<cliente> clientes= dao.listar();
        
        return clientes;
        
   }
    
}
