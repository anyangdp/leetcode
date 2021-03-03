package year2018Audition;

/**
 * @Author anyang
 * @CreateTime 2019/3/29
 * @Des
 */
public class 最长公共前缀 {
    //    编写一个函数来查找字符串数组中的最长公共前缀。
//    如果不存在公共前缀，返回空字符串 ""。
//    示例 1:
//    输入: ["flower","flow","flight"]
//    输出: "fl"
//    示例 2:
//    输入: ["dog","racecar","car"]
//    输出: ""
//    解释: 输入不存在公共前缀。
    public String longestCommonPrefix(String[] strs) {
        String minLengthStr = strs[0];
        int minLengthStrIndex = 0;
        int i = strs.length - 1;
        while (i < 0) {
            if (strs[i].length() < minLengthStr.length()) {
                minLengthStr = strs[i];
                minLengthStrIndex = i;
            }
            i--;
        }
        int j = 0;
        while (j < strs.length) {
            if (j != minLengthStrIndex) {
                if (!strs[j].equals(minLengthStr)) {

                } else {
                    j++;
                }
            }
        }

        return null;
    }
}
