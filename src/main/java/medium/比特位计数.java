package medium;

/**
 * @Author anyang
 * @CreateTime 2021/3/3
 * @Des
 */
public class 比特位计数 {
    public static int[] countBits(int num) {
        int[] arr = new int[num+1];
        for (int i = 1; i <= num; i++) {
            arr[i] = arr[i>>1] + (i&1);
        }
        return arr;
    }
}
