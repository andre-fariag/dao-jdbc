package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { // classe responsável por fabricar os DAOS. 
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(); // faz com que a implementaçao nao seja explicita no programa principal.
	}
	
	
	
	
	 

}
