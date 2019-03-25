package year2018Audition;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author anyang
 * @CreateTime 2019/3/25
 * @Des
 */

//输入: [2,2,1]
//        输出: 1
//    输入: [4,1,2,1,2]
//            输出: 4
//           [1,1,2,3,3,3,4,4,6,6]
//           [1,1,3,3,4,5,5]
public class 只出现一次的数字 {
    /**
     * 先排序，只有一个出现的数字，即是奇数，每两位比较一次，然后比较下两位，如果之前都没有发现重复，则最后一位必定是只出现一次的数字
     *
     * @param arr
     * @return
     */
    public static int solution1(Integer[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];
    }

    /**
     * set去重。
     * @param arr
     * @return
     */
    public static int solution2(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                set.remove(arr[i]);
            }
        }
        return set.iterator().next();
    }

    /**
     * 数组排序循环 num = 偶数位置-奇数位置， 最后会只剩下唯一的值
     * @param arr
     * @return
     */
    public static int solution3(Integer[] arr) {
        int num = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            // 偶数下标位置 num += nums[i]，奇数下标位置 num -= nums[i]
            num = i % 2 == 0 ? num + arr[i] : num - arr[i];
        }
        return num;
    }

    /**
     * 最优解：相同数字异或等于0，任何数字与0异或会等于本身，最后会只剩下唯一不同的数字
     * @param arr
     * @return
     */
    public static int solution4(Integer[] arr) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num ^ arr[i];
        }
        return num;
    }


    public static void main(String[] args) {
//        Integer arr[] = new Integer[]{2, 2, 1};
//        System.out.println(只出现一次的数字.solution1(arr));
//        Integer brr[] = new Integer[]{1, 2, 1, 2, 4};
//        System.out.println(只出现一次的数字.solution1(brr));
//        Integer arr2[] = new Integer[]{2, 2, 1};// 1 2 2
//        System.out.println(只出现一次的数字.solution3(arr2));
//        Integer brr2[] = new Integer[]{1, 2, 1, 2, 4};// 1 1 2 2 4
//        System.out.println(只出现一次的数字.solution3(brr2));
//        Integer arr2[] = new Integer[]{2, 2, 1};// 1 2 2
//        System.out.println(只出现一次的数字.singleNumber(arr2));
        //001
        //010       011
        //100       111
        //010       101
        //100       001
        Integer brr2[] = new Integer[]{1, 2, 4, 2, 4};// 1 1 2 2 4
        System.out.println(只出现一次的数字.solution4(brr2));
    }
}
