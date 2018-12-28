package bll;

import java.util.List;

public interface BaseBLL<T> {
    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: get all object
     * Version 1.0
     * @return
     */
    List<T> getAll();

    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: get object by code
     * Version 1.0
     * @param code
     * @return
     */
    T getByCode(String code);

    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: insert object
     * Version 1.0
     * @param object
     * @return
     */
    int insert(T object);

    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: update object
     * Version 1.0
     * @param object
     * @return
     */
    int update(T object);

    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: delete object
     * Version 1.0
     * @param code
     * @return
     */
    int delete(String code);

    /**
     * Create by: VVDONG - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: filter
     * Version 1.0
     * @param sequenceFilter
     * @return
     */
    List<T> fillter(String sequenceFilter);
}
