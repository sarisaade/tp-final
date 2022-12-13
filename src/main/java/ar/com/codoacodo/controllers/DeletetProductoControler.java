package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IProductoDAO;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;

public class DeletetProductoControler {

	public static void main(String[] args)throws Exception {
		
		IProductoDAO dao = new ProductoDAOMysqlImpl();
		
		Long id = 1l;
		
		
		
		
		dao.delete(id);
		
		

	}

}
