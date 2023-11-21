package jdbc;

import model.DAO;

public class Print {
	public static void main(String[] args) {
		DAO dao = new DAO();
		
		System.out.println(dao.test());
	}

}
