package org.example.tasks;

public class CircleIntersection {
    public static void main(String[] args) {
        double[] x = new double[]{1, 17, 2, 42};
        double[] y = new double[]{1, 17, 2, 42};
        double[] r = new double[]{1, 17, 2, 42};
        int[][] s = calculateCircleIntersections(x, y, r);

        for (int i = 0; i < x.length; ++i) {
            for (int j = 0; j < x.length; ++j) {
                System.out.print(s[i][j] + ((i < x.length - 1 || j < x.length - 1) ? "," : ""));
            }
        }
    }

    public static int[][] calculateCircleIntersections(double[] x, double[] y, double[] r) {
        int n = x.length;
        int[][] s = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    s[i][j] = 1;
                } else {
                    double distanceSquared = Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2);
                    double radiusSum = r[i] + r[j];
                    double radiusDiff = Math.abs(r[i] - r[j]);
                    if (distanceSquared >= Math.pow(radiusDiff, 2) && distanceSquared <= Math.pow(radiusSum, 2)) {
                        s[i][j] = 1;
                    } else {
                        s[i][j] = 0;
                    }
                }
            }
        }
        return s;
    }
}
