import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

/**
 * @Author wuwenjun
 * @Date 2023/2/17 16:19
 */
public class BinarySearch {
    /*
    704. 二分查找
        输入: nums = [-1,0,3,5,9,12], target = 9
        输出: 4
        解释: 9 出现在 nums 中并且下标为 4
     */

    @Test
    public void test(){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int search = search(nums, target);
        int search2 = Arrays.binarySearch(nums, target);
        System.out.println(search);
        System.out.println(search2);
    }

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = (l + r) >>> 1;

            if (nums[mid] < target) {
                l = mid + 1;
            }else if (nums[mid] > target){
                r = mid - 1;
            } else{
                return mid;
            }
        }
        return -1;
    }


}
