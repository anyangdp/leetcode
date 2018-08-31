package easy.最长公共前缀;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author anyang
 * @CreateTime 2018/8/31
 * @Des
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String publicPrefix = "";
        String temp = strs[0];
        Set<String> newStrs = new HashSet<>();
        Integer index = 0;
        /**
         * 去重
         */
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].equals(temp)) {
                continue;
            } else if (strs[i].length() < temp.length()) {
                newStrs.add(temp);
                temp = strs[i];
            } else {
                newStrs.add(strs[i]);
            }
        }
        if (newStrs.size() == 0) {
            return temp;
        }
        outer:
        for (int i = temp.length() - 1; i >= 0; i--) {
            publicPrefix = temp.substring(0, i + 1);
            int count = 0;
            inner:
            for (String str :
                    newStrs) {
                if (!str.startsWith(publicPrefix)) {
                    publicPrefix = "";
                    break inner;
                } else {
                    count++;
                    if (count == newStrs.size()) {
                        return publicPrefix;
                    }
                }
            }
        }
        if (publicPrefix.length() > 0) {
            return publicPrefix;
        } else {
            return "";
        }

    }
}
