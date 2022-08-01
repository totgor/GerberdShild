package com.gerberdshild.javalanguage.data_types_variables_arrays.array;

//Инициализация двухмерного массива
public class TwoDemensionalArrayInitialization {
    public static void main(String[] args) {
        int[][] twoD = {
                {0 * 0, 0 * 1, 0 * 2, 0 * 3},
                {1 * 0, 1 * 1, 1 * 2, 1 * 3},
                {2 * 0, 2 * 1, 2 * 2, 2 * 3},
                {3 * 0, 3 * 1, 3 * 2, 3 * 3}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }

    }
}

