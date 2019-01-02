/**

 * 
 */

package bll;

import java.util.List;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public interface BaseBll<T> {
  /**
   * Create by: Yen Trinh - CMC
   * Create date: Dec 28, 2018
   * Modifier: User
   * Modified date: Dec 28, 2018
   * Description: At all object T
   * Version 1.0
   * @return
   */
  List<T> Add();

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
  T getByCode();

  /**
   * Create by: HQTrung - CMC
   * Create date: Dec 28, 2018
   * Modifier: HQTrung
   * Modified date: Dec 28, 2018
   * Description: ....
   * Version 1.0
   * 
   * @return
   */
  int insert();

  /**
   * Create by: HQTrung - CMC
   * Create date: Dec 28, 2018
   * Modifier: HQTrung
   * Modified date: Dec 28, 2018
   * Description: ....
   * Version 1.0
   * 
   * @return
   */
  int update();

  /**
   * Create by: HQTrung - CMC
   * Create date: Dec 28, 2018
   * Modifier: HQTrung
   * Modified date: Dec 28, 2018
   * Description: ....
   * Version 1.0
   * 
   * @return
   */
  int delete();

  /**
   * Create by: HQTrung - CMC
   * Create date: Dec 28, 2018
   * Modifier: HQTrung
   * Modified date: Dec 28, 2018
   * Description: ....
   * Version 1.0
   * 
   * @return
   */
  List<T> fillter();

  void display(List<T> list);

  String show();

  StringBuilder showBuilder();

  StringBuffer showBuffer();

}
