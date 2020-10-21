package ru.ncedu.wortellen.trickytasks2.matrix;

public class Matrix {

    private double[][] matrix;

    public Matrix(int column_length, int row_length) {
        matrix = new double[column_length][row_length];
    }

    public double[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
}
