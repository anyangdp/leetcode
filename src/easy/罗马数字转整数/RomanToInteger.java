package easy.罗马数字转整数;

import java.util.ArrayList;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class RomanToInteger {
    public static int romanToInt(String s) {
        ArrayList<Integer> array = new ArrayList<>();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            switch (temp) {
                case 'M': array.add(1000); break;
                case 'D': array.add(500); break;
                case 'C': array.add(100); break;
                case 'L': array.add(50); break;
                case 'X': array.add(10); break;
                case 'V': array.add(5); break;
                case 'I': array.add(1); break;
            }
        }
        for (int i = 0; i< array.size(); i++) {
            if (array.size() == 1) {
                result += array.get(i);
                break;
            }
            for (int j = i+1; j < array.size(); j++) {
                if (array.get(i) >= array.get(j)) {
                    result += array.get(i);
                    break;
                } else {
                    result += array.get(j) - array.get(i);
                    i++;
                    break;
                }
            }
            if (i == array.size() - 1) {
                if (array.get(i) <= array.get(i-1)) {
                    result += array.get(i);
                }
            }
        }
        return result;
    }
}
