package bll;

import java.util.List;

/**
 * Create by: thanh - CMC
 * Create date: Dec 28, 2018
 * Modifier: thanh
 * Modified date: Dec 28, 2018
 * Description: 
 * Version 1.0
 * @param <T>
 */
public interface BaseBLL<T> {
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @return
	 */
	public List<T> getAll();

	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @param code
	 * @return
	 */
	T getByCode(String code);

	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @param object
	 * @return
	 */
	int insert(T object);

	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @param object
	 * @return
	 */
	int udpate(T object);
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @param object
	 * @return
	 */
	int delete(T object);
	/**
	 * Create by: thanh - CMC
	 * Create date: Dec 28, 2018
	 * Modifier: thanh
	 * Modified date: Dec 28, 2018
	 * Description: 
	 * Version 1.0
	 * @param sequnceFillter
	 */
	List<T> fillter(String sequnceFillter);
	/**
	 * Create by: thanh - CMC
	 * Create date: Jan 2, 2019
	 * Modifier: thanh
	 * Modified date: Jan 2, 2019
	 * Description: 
	 * Version 1.0
	 * @return
	 */
	String show();
	/**
	 * Create by: thanh - CMC
	 * Create date: Jan 2, 2019
	 * Modifier: thanh
	 * Modified date: Jan 2, 2019
	 * Description: 
	 * Version 1.0
	 * @return
	 */
	StringBuffer stringBuffer();
	/**
	 * Create by: thanh - CMC
	 * Create date: Jan 2, 2019
	 * Modifier: thanh
	 * Modified date: Jan 2, 2019
	 * Description: 
	 * Version 1.0
	 * @return
	 */
	StringBuilder stringBuilder();
}