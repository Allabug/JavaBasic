package com.epamlearn.javabasics.decomposition.ex4;

public class DistancePoint {
    public double getDistanceBetweenPoints(int[] a, int[] b) {
        double distPoint = Math.sqrt(Math.pow((b[0] - a[0]), 2) + Math.pow((b[1] - a[1]), 2));
        return distPoint;
    }

    public double[][] getMaxDistance(int[][] points) {
        DistancePoint obj = new DistancePoint();
        double maxLen = 0;
        double[][] maxPoint = new double[3][2];
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double len = obj.getDistanceBetweenPoints(points[i], points[j]);
                if (len > maxLen) {
                    maxLen = len;
                    maxPoint[0][0] = points[i][0];
                    maxPoint[0][1] = points[i][1];
                    maxPoint[1][0] = points[j][0];
                    maxPoint[1][1] = points[j][1];
                    maxPoint[2][0] = maxLen;
                }
            }
        }
        return maxPoint;
    }

    public void printCoordinates(double[][] matrix) {
        System.out.println("Координаты точек с самым большим расстоянием: ");
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMaxLength(double[][] matrix) {
        System.out.println("Максимальное расстояние между точками: ");
        for (int i = 2; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                System.out.print(matrix[i][0]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] point = {{30, 8}, {3, 3}, {60, 60}, {5, 5}};
        DistancePoint obj = new DistancePoint();
        double[][] array = obj.getMaxDistance(point);
        obj.printCoordinates(array);
        obj.printMaxLength(array);
    }
}
