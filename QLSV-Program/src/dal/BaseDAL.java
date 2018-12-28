package dal;

import java.sql.SQLException;
import java.util.List;

/**
 * @author a
 * Description:  Base for DAL Class
 */
public interface BaseDAL<T> {
	// get all object of type T
	List<T> getAll() throws SQLException;

	// get object T by code
	T getByCode(String code) throws SQLException;

	// insert object to db
	int insert(T object) throws SQLException;

	// update an object
	int update(T object) throws SQLException;

	// delete by code
	int delete(String code) throws SQLException;

	// filter by sequenceFilter
	List<T> fillter(String sequenceFilter) throws SQLException;
}
