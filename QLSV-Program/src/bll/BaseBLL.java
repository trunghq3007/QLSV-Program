package bll;

import java.util.List;

public interface BaseBLL<T> {
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     * @throws Exception 
     */
    List<T> getAll() throws Exception;
    /**BaseDAL.java
     * ntmduyen
     * get list object by code
     * @return
     * @throws Exception 
     */
    T getByCode(String code) throws Exception;
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     * @throws Exception 
     */
    int insert(T t) throws Exception;
    /**BaseDAL.java
     * ntmduyen
     * Update the list of students
     * @return
     * @throws Exception 
     */
    int update(T object) throws Exception;
    /**BaseDAL.java
     * ntmduyen
     * Delete student
     * @return
     * @throws Exception 
     */
    int delete(String code) throws Exception;
    /**BaseDAL.java
     * ntmduyen
     * List all object T
     * @return
     * @throws Exception 
     */
    List<T> filter(String sequenceFilter) throws Exception;
}
