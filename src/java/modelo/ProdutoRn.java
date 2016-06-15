/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import dao.ProdutoDao;
import java.util.List;
/**
 *
 * @author CASA-PC
 */ 
public class ProdutoRn {
    
    public Boolean cadastro_produto_dao(Produto produto)
    {
        boolean retorno=false;
        
        if (produto.getdescricao()=="" || produto.getmarca()=="" || produto.getquantidade()==0 || produto.getpreco()==0)
        {
            retorno=false;
        }
        else
        {
            ProdutoDao dao = new ProdutoDao();
            retorno= dao.inserir(produto);
        }
        return retorno;
    }
    
    public boolean excluir_produto_dao(int id)
   {
      ProdutoDao dao = new ProdutoDao();
      return  dao.excluir_produto(id);

   }
    public List<Produto> listar()
    {
        ProdutoDao dao = new ProdutoDao();
        List<Produto> produto = dao.listar();
        
        return produto;
    }
}
