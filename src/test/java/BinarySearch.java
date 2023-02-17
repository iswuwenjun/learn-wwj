import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * @Author wuwenjun
 * @Date 2023/2/17 16:19
 */
@SpringBootTest
public class BinarySearch {


    @Test
    public void binarySearch() throws Exception {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int idx = Arrays.binarySearch(array, 10);
        System.out.println(idx);
    }


}
