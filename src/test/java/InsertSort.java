import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wuwenjun
 * @Date 2023/2/21 10:00
 */
public class InsertSort {

    /**
     * 1、将数组分为两个区域，排序区域和未排序区域
     * 每一轮从未排序区域中取出第一个元素，插入到排序区域（需保证顺序）
     *
     * 2、重复以上步骤，知道整个数组有序
     */

    @Test
    public void test(){
        int[] nums = {5,9,7,4,1,3,2,8};
        insert(nums);
        System.out.println("结果："+ Arrays.toString(nums));
    }

    public void insert(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // 待插入元素值
            int t = nums[i];
            // 已排序区元素索引
            int j = i - 1;
            while (j >= 0) {
                if (t < nums[j]) {
                    nums[j + 1] = nums[j];
                }else{
                    break;
                }
                j--;
            }
            nums[j + 1] = t;
            System.out.println(Arrays.toString(nums));

        }


    }

}
