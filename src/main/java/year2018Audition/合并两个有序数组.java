package year2018Audition;

import java.util.Arrays;

/**
 * @Author anyang
 * @CreateTime 2019/3/28
 * @Des
 */
//        给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//
//        说明:
//
//        初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
//        你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//        示例:
//
//        输入:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        输出: [1,2,2,3,5,6]
public class 合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] >= nums2[n - 1]) {
                nums1[k - 1] = nums1[m - 1];
                k--;
                m--;
            } else {
                nums1[k - 1] = nums2[n - 1];
                k--;
                n--;
            }
        }
        while(n > 0 && k > 1){
            nums1[k-1] = nums2[n-1];
            --k;
            --n;
        }
        if (m == 0) {
            for (int i:
                    nums2) {
                System.out.println(i);
            }
        } else {
            for (int i:
                    nums1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] num1 = {0};
        int[] num2 = {1};
        merge(num1, 0, num2, 1);
    }
}
