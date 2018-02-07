package template.action;

import java.sql.Connection;
import java.util.ArrayList;

import template.data.*;
import template.model.Book;

public class ViewAction {
	
	private Connection conn = null;
	
	public synchronized ArrayList<Book> getAllBooks(){
		ArrayList<Book> books = new ArrayList<Book>();
		BookDAO bookDAO = DAOFactory.getBookDAO();
		DAO dao = DAOFactory.getDAO();
		
		try{
			conn = dao.getConnection();
			books = bookDAO.findAllBooks(conn);
		}catch(DAOException e){
			e.printStackTrace();
		}finally{
			dao.closeResources(conn);
		}
		return books;
	}
	
	
}
