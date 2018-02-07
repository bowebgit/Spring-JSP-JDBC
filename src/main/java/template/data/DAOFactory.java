package template.data;

public class DAOFactory {
	public static DAO getDAO(){
		return new BaseDAO();
	}

	public static BookDAO getBookDAO(){
		return new BookDAOImpl();
	}
	
}
