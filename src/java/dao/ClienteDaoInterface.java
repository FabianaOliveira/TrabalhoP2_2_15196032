/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.cliente;
import util.JavaWebException;
import java.util.List;

/**
 *
 * @author CASA-PC
 */
public interface ClienteDaoInterface {
    
    public boolean inserir(cliente c) throws Exception;
    public List<cliente> listar() throws Exception;  
    public boolean existe_cliente(String cpf) throws Exception;
    public boolean excluir_cliente(int id) throws Exception;
    
}
