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
		
		for(AccountVO row : list) {
			System.out.print(row.getIdx() + "\t" + row.getUserid() + "\t\t");
			
			String userpw = row.getUserpw() + "";
			
			if(userpw.length() >= 6) {
				System.out.print(userpw.substring(0, 6) + "\t");
			}
			else {
				System.out.print(userpw + "\t");
			}
			
			System.out.print(row.getNick() + "\t" + row.getEmail() + "\t" + row.getJoin_date() + "\n");
		}
	}

}
