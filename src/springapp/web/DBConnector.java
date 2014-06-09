package springapp.web;

import java.sql.*;


 
 
public class DBConnector {
 
	public Connection conn = null;
	public Statement sta = null;
	public PreparedStatement preparedStatement = null;
 
	public DBConnector() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/Crawler";
			conn = DriverManager.getConnection(url, "root", "");
			System.out.println("conn built");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
 
	public ResultSet runSql(String sql) throws SQLException {
		sta = conn.createStatement();
		return sta.executeQuery(sql);
	}
	
	public PreparedStatement getPreparedStatement(String sql) throws SQLException {
		preparedStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		return preparedStatement;
	}
 
	public boolean runSql2(String sql) throws SQLException {
		sta = conn.createStatement();
		return sta.execute(sql);
	}
 
	@Override
	protected void finalize() throws Throwable {
		if (sta != null || !sta.isClosed()){
			sta.close();
		}
		if (conn != null || !conn.isClosed()) {
			conn.close();
		}
	}
}