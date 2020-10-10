package ru.ncedu.wortellen.trickytasks2.matrix;
public class Main {
    public static void main(String[] args) {
        IMatrixWorker test = new IMatrixWorkerImpl();
        double[][] tmp = new double[3][4];
        double[][] tmp2 = new double[4][2];
        int k =1;
        for (int i = 0; i<3;i++)
            for(int j = 0;j<4;j++)
            {
                tmp[i][j]= k;
                k++;
            }
        test.print(tmp);
        k=1;
        for (int i = 0; i<4;i++)
            for(int j = 0;j<2;j++)
            {
                tmp2[i][j]= k;
                k++;
            }
        System.out.println(test.haveSameDimension(tmp,tmp2));
        test.print(test.multiply(tmp,tmp2));

    }
}
