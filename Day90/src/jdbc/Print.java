package jdbc;

import java.util.List;

import dto.AccountVO;
import model.AccountDAO;

public class Print {
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		
		System.out.println("test : " + dao.test());
		
		System.out.println();
		
		List<AccountVO> list = dao.selectAll();
		
		String msg = "%d\t %s\t %s\t %s\t %s\n";
		
		for(AccountVO row : list) {
			System.out.printf(msg, row.getIdx(), row.getUserid(), 
					row.getNick(), row.getEmail(), row.getJoin_date());
		}
	}

}
