package model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.AccountVO;

public class AccountDAO extends DAO {
	public List<AccountVO> selectAll() {
		String sql = "select * from account order by idx desc";
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			List<AccountVO> list = new ArrayList<AccountVO>();
			
			while(rs.next()) {
				AccountVO row = new AccountVO();
				
				row.setIdx(rs.getInt("idx"));
				row.setUserid(rs.getString("userid"));
				row.setUserpw(rs.getString("userpw"));
				row.setNick(rs.getString("nick"));
				row.setEmail(rs.getString("email"));
				row.setJoin_date(rs.getDate("join_date"));
				
				list.add(row);
			}
			
			return list;
			
		} catch (SQLException e) {
			System.out.println("selectAll 예외 : " + e.getMessage());
			
		} finally {
			close();
		}
		
		
		return null;
	}
}
