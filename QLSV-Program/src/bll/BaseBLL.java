/**
 * 
 */
package bll;

import java.util.List;

/**
 * Create by: NVDiem
 * Create date: Jan 1, 2019
 * Modifier: NVDIEM
 * Modified date: Jan 1, 2019
 * Description: ....
 * Version 1.0
 */
public interface BaseBLL<T> {

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @return
	 */
	List<T> getAll();

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @param code
	 * @return
	 */
	T getByCode(String code);

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @param object
	 * @return
	 */
	int insert(T object);

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @param object
	 * @return
	 */
	int update(T object);

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @param code
	 * @return
	 */
	int delete(String code);

	/**
	 * Create by: NVDiem
	 * Create date: Jan 1, 2019
	 * Modifier: NVDIEM
	 * Modified date: Jan 1, 2019
	 * Description: ....
	 * Version 1.0
	 *
	 * @param sequenceFilter
	 * @return
	 */
	List<T> fillter(String sequenceFilter);

}
