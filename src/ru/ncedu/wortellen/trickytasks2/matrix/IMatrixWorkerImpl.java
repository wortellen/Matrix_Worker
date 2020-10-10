package ru.ncedu.wortellen.trickytasks2.matrix;

public class IMatrixWorkerImpl implements IMatrixWorker{

    public void print(double[][] m){
        for (double [] k :m) {
            for (double i : k) {
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public boolean haveSameDimension(double[][] m1, double[][] m2) {
        if ((m1.length == m2.length)&&(m1[0].length==m2[0].length))
            return true;
        else return false;
    }
    public double[][] add(double[][] m1, double[][] m2) {
        for (int i = 0; i< m1.length;i++)
            for(int j = 0;j<m1[0].length;j++)
            {
                m1[i][j]+=m2[i][j];
            }
        return m1;
    }

    public double[][] subtract(double[][] m1, double[][] m2){
        for (int i = 0; i< m1.length;i++)
            for(int j = 0;j<m1[0].length;j++)
            {
                m1[i][j]-=m2[i][j];
            }
        return m1;
    }

    public double[][] multiply(double[][] m1, double[][] m2){
        double [][] m1m2 = new double[m1.length][m2[0].length];
        for(int i = 0; i < m1.length; i++) {
            for(int j = 0; j < m2[0].length; j++) {
                for(int k = 0; k < m1[0].length; k++) {
                    m1m2[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m1m2;
    }

}
