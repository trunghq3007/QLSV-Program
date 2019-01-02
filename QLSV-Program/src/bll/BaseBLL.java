/**
 * 
 */
package bll;

import java.util.List;

/**
 * Create by: pvhao - CMC
 * Create date: Dec 28, 2018
 * Modifier: pvhao
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public interface BaseBLL<T> {
    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: .list all object T
     * Version 1.0
     * @return
     */
    List<T> getAll();

    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @return
     */
    T getByCode(String code);

    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int insert(T object);

    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int update(T object);

    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int delete(String code);

    /**
     * Create by: pvhao - CMC
     * Create date: Dec 28, 2018
     * Modifier: pvhao
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param sequenceFilter
     * @return
     */
    List<T> fillter(String sequenceFilter);

    /**
     * Create by: pvhao - CMC
     * Create date: Jan 2, 2019
     * Modifier: pvhao
     * Modified date: Jan 2, 2019
     * Description: ....
     * Version 1.0
     * @return
     */
    public String show();
    /**
     * Create by: pvhao - CMC
     * Create date: Jan 2, 2019
     * Modifier: pvhao
     * Modified date: Jan 2, 2019
     * Description: ....
     * Version 1.0
     * @return
     */
    public StringBuilder showBuilder();

}
