package com.day3;

import java.util.Arrays;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test6 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        int[][] a2 = {{1, 2}, {3, 4}, {3, 2}};

        int[][] a3 = new int[2][3];
        a3[0][0] = 1;
        a3[0][1] = 1;
        a3[0][2] = 1;

        a3[1][0] = 2;
        a3[1][1] = 3;
        a3[1][2] = 2;

        int[][] a4 = {{1, 1, 1}, {2, 3, 2}};

        int[][] a5 = new int[][]{{1, 1, 1}, {2, 3, 2}};

//        System.out.println(Arrays.deepToString(a5));

//        for (int i = 0; i < a5.length; i++) {
//            int[] a0 = a5[i];
//            for (int j = 0; j < a0.length; j++) {
//                System.out.println(a5[i][j]);
//            }
//        }

        // String [3][2][2]
        String[][][] strs = {{{"true", "b"}, {"c", "d"}}, {{"aa", "bb"}, {"cc", "dd"}}, {{"aaa", "bbb"}, {"ccc", "ddd"}}};

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length; j++) {
                for (int k = 0; k < strs[i][j].length; k++) {
                    System.out.println(strs[i][j][k]);
                }
            }
        }

    }
}
