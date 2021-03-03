package year2018Audition;

/**
 * @Author anyang
 * @CreateTime 2019/3/26
 * @Des
 */
//编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target。该矩阵具有以下特性：
//
//        每行的元素从左到右升序排列。
//        每列的元素从上到下升序排列。
//[
//        [1,   4,  7, 11, 15],
//        [2,   5,  8, 12, 19],
//        [3,   6,  9, 16, 22],
//        [10, 13, 14, 17, 24],
//        [18, 21, 23, 26, 30]
//        ]
public class 搜索二维矩阵 {

    /**
     * 从大到小过滤
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix.length <= 0) {
            return false;
        }
        if (matrix[0].length <= 0) {
            return false;
        }
        for (int j = 0; j < matrix[matrix.length-1].length; j++) {
            if (matrix[matrix.length-1][j] == target) {
                return true;
            } else if (matrix[matrix.length-1][j] < target) {
                if (j == matrix[matrix.length-1].length - 1) {
                    return false;
                }
            } else {
                if (matrix.length >= 2) {
                    for (int i = matrix.length - 2; i >= 0; i--) {
                        if (matrix[i][j] < target) {
                            break;
                        } else if (matrix[i][j] == target) {
                            return true;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * 二分法
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix4(int[][] matrix, int target) {
        if (matrix.length <= 0) {
            return false;
        }
        if (matrix[0].length <= 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[0].length - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (matrix[i][middle] == target) {
                    return true;
                } else if (matrix[i][middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return false;
    }

    /**
     * 分治法：
     * @param matrix
     * @param target
     * @return
     */
    public static boolean searchMatrix5(int[][] matrix, int target) {
        if (matrix.length <= 0) {
            return false;
        }
        if (matrix[0].length <= 0) {
            return false;
        }
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[][] arr = {
//                {1,4,7,11,15},
//                {2,5,8,12,19},
//                {3,6,9,16,22},
//                {10,13,14,17,24},
//                {18,21,23,26,30}
//        };
//        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int[][] arr = {{-1}, {-1}};
//        System.out.println(搜索二维矩阵.searchMatrix1(arr, 5));
        System.out.println(搜索二维矩阵.searchMatrix4(arr, 5));
    }

}
