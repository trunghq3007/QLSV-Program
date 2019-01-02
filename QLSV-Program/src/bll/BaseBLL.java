package bll;

import java.util.List;

/**
 * @author a
 * Description:  Base for BLL Class
 */
public interface BaseBLL<T> {
	// get all object of type T
	List<T> getAll();

	// get object T by code
	T getByCode(String code);

	// insert object to db
	boolean insert(T object);

	// update an object
	boolean update(T object);

	// delete by code
	int delete(String code);

	// filter by sequenceFilter
	List<T> fillter(String sequenceFilter);

	StringBuilder getStringBuilderFromList(List<T> list);

	boolean display(List<T> list);
}
