import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wuwenjun
 * @Date 2023/2/21 10:00
 */
public class SelectionSort {

    /**
     * 1、将数组分为两个子集，排序的和未排序的
     * 每一轮从未排序的子集中选出最小的元素，放入排序子集
     * 2、重复以上步骤，直到整个数组有序
     */

    @Test
    public void test(){
        int[] nums = {5,9,7,4,1,3,2,8};
        int[] result = selection(nums);
        System.out.println("结果："+ Arrays.toString(result));
    }

    public int[] selection(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {

            int s = i;
            for (int j = s + 1; j < nums.length; j++) {
                if (nums[s] > nums[j]) {
                    s = j;
                }
            }

            if (s != i) {
                int temp = nums[s];
                nums[s] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

}
