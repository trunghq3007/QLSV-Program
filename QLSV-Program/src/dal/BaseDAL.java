package dal;

import java.util.List;

public interface BaseDAL<T> {
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     */
    List<T> getAll();
    /**BaseDAL.java
     * ntmduyen
     * get list object by code
     * @return
     */
    T getByCode(String code);
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     */
    int insert(T t);
    /**BaseDAL.java
     * ntmduyen
     * Update the list of students
     * @return
     */
    int update(T object);
    /**BaseDAL.java
     * ntmduyen
     * Delete student
     * @return
     */
    int delete(String code);
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     */
    List<T> filter(String sequenceFilter);
}
