package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import bean.Book;

public class BookDAOImpl {

	private DataSource datasource;
	private Connection con;
	public DataSource getDatasource() {
		return datasource;
	}
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	@Override
	public String toString() {
		return "BookDAOImpl [datasource=" + datasource + ", con=" + con + "]";
	}
	
	public Book getBookByID(int id)
	{
		Book book=null;
		try {
			
			con=(Connection) datasource.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from book where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				book=new Book();
				book.setAuthor(rs.getString("author"));
				book.setId(id);
				book.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return book;
	}
}
