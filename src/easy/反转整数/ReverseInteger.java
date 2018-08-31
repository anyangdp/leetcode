package easy.反转整数;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class ReverseInteger {
    public static int reverse(int x) {
        boolean negative = x < 0;
        long r = 0;
        if (negative) x = -x;
        while(x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (negative) r = -r;

        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
        return (int)r;
    }
}
