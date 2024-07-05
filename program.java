/**
 * program
 */

import java.util.Arrays;
import java.util.logging.Logger;

public class program {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Main");
        
        int[] array = new int[]{9, 4, 8, 3, 1};
        
        boolean flag = false;
        while (!flag) {
            flag = true;
        
            for (int i = 1; i < array.length; i ++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = false;
                }
            }
            logger.info(Arrays.toString(array));
        }

    }
}
