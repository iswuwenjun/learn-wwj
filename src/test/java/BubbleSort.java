import org.junit.Test;

import java.util.Arrays;

/**
 * @Author wuwenjun
 * @Date 2023/2/17 16:19
 */
public class BubbleSort {
    /*
        冒泡排序
        1.依次比较数组中相邻的两个元素大小，若a[j]>a[j+1]，则交换两个元素，
        两两都比较一遍称为一轮冒泡，结果是让最大的元素排到最后。
        2.重复以上步骤，直到整个数组有序
     */

    @Test
    public void test(){
        int[] nums = {5,9,7,4,1,3,2,8};
        int[] bubble = bubble_v2(nums);
    }

    public int[] bubble_v2(int[] nums) {
        int n = nums.length -1;
        for (int j = 0; j < nums.length -1; j++) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("循环次数：" + i);
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    last = i;
                }
            }
            n = last;
            System.out.println("第" + j + "轮循环：" + Arrays.toString(nums));
            if (n == 0) {
                break;
            }
        }

        return nums;
    }


    public int[] bubble(int[] nums) {
        for (int j = 0; j < nums.length - 1; j++) {
            boolean swaped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                System.out.println("循环次数：" + i);
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    swaped = true;
                }
            }
            System.out.println("第" + j + "轮循环：" + Arrays.toString(nums));
            if (!swaped) {
                break;
            }
        }

        return nums;
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
