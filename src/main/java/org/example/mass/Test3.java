package org.example.mass;

public class Test3 {
    public static void main(String[] args) {
        int[][] matrice = {{1, 2, 3, 5, 8}, {4}, {7, 8, 9}};

        System.out.println(matrice[1][0]); // 4
        System.out.println(matrice[0][1]); // 2
        System.out.println(matrice[2][2]); // 9
        System.out.println();

        for (int i = 0; i < matrice.length; i++) { // проходимся по строкам массива (у нас 3 одномерных массива в массиве)
            for (int j = 0; j < matrice[i].length; j++) { // проходимся по элементам массива каждой строки
                System.out.print(matrice[i][j] + " "); // // Выводим элементы текущей строки
            }
            System.out.println(); // после вывода элементов массива каждой строки переходим на новую строку
        }

        // matrice[i].length - длина текущего одномерного массива (строки),
        // которая может быть разной для каждой строки в рваном массиве


    }
}
