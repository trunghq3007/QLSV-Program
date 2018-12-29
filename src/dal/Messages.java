/**
 * 
 */
package dal;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Create by: HQTrung - CMC
 * Create date: Dec 28, 2018
 * Modifier: HQTrung
 * Modified date: Dec 28, 2018
 * Description: ....
 * Version 1.0
 */
public class Messages {
        private static final String BUNDLE_NAME = "dal.messages"; //$NON-NLS-1$

        private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

        private Messages() {
        }

        public static String getString(String key) {
                try {
                        return RESOURCE_BUNDLE.getString(key);
                } catch (MissingResourceException e) {
                        return '!' + key + '!';
                }
        }
}
