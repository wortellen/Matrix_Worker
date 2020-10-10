package ru.ncedu.wortellen.trickytasks2.matrix;

public class Matrix {

    private double[][] matrix;

    public Matrix() {
        matrix = new double[1][1];
    }

    public double[][] getMatrix() {
        return matrix;
    }
    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }
}
