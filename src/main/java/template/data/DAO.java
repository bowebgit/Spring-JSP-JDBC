/**
 * DAO.java
 * 
 */
package template.data;

import java.sql.Connection;

public interface DAO {
	Connection getConnection();
	void closeResources(Connection conn);
}
