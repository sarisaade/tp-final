package ar.com.codoacodo.controllers;

import java.util.Date;

import ar.com.codoacodo.dao.IProductoDAO;
import ar.com.codoacodo.dao.impl.ProductoDAOMysqlImpl;
import ar.com.codoacodo.domain.Producto;

public class CreateProductoControler {

	public static void main(String[] args)throws Exception {
		
		IProductoDAO dao = new ProductoDAOMysqlImpl();
		Producto newProducto = new Producto( "codigo00", "codo a codo FullStack Java", 1D, new Date(), "autor", null );
		
		dao.create(newProducto);
		System.out.println("id generado para el nuevo producto:" + newProducto.getId());
		
	

	}

}
