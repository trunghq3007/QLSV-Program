<<<<<<< HEAD
<<<<<<< HEAD
/**
 * 
 */
package dal;

import java.util.List;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public interface BaseDAL<T> {
        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: .list all object T
         * Version 1.0
         * @return
         */
        List<T> getAll();

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @return
         */
        T getByCode(String code);

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param object
         * @return
         */
        int insert(T object);

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param object
         * @return
         */
        int update(T object);

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param object
         * @return
         */
        int delete(String code);

        /**
         * Create by: HQTrung - CMC
         * Create date: Dec 28, 2018
         * Modifier: HQTrung
         * Modified date: Dec 28, 2018
         * Description: ....
         * Version 1.0
         * @param sequenceFilter
         * @return
         */
        List<T> fillter(String sequenceFilter);
=======
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
    
    
>>>>>>> branch 'tthyen' of https://github.com/trunghq3007/QLSV-Program.git
=======
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
    
    
>>>>>>> refs/remotes/origin/tthyen

}
