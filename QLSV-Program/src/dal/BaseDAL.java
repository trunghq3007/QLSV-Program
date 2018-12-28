package dal;

import java.util.List;

/**
 * @author User
 *
 * @param <T>
 */
public interface BaseDAL<T> {
    /**
     * Create by: Yen Trinh - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: List all object
     * Version 1.0
     * @return
     */
    List<T> getAll();

    /**
     * Create by: Yen Trinh - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @return
     */
    T getByCode(String code); // TH neu co so, ep kieu ve

    int insert(T object);

    /**
     * Create by: Yen Trinh - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int update(T object);

    /**
     * Create by: Yen Trinh - CMC
     * Create date: Dec 28, 2018
     * Modifier: User
     * Modified date: Dec 28, 2018
     * Description: ....
     * Version 1.0
     * @param object
     * @return
     */
    int delete(String object);
    
    List<T>filter(String sequencefilter);
    
    

}
