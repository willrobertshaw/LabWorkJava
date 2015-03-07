package Week4;

/**
 * Created by williamrobertshaw on 06/03/15.
 */
public class ArrayOps {
    public static double findMax(double[] data) {
        double max = data[0];
        for(int i = 1; i < data.length; i ++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }

    public static double[] normalise(double data[]) {
        double sum = 0;
        for(int i = 0; i < data.length; i ++){
            sum += data[i];
        }
        double[] normData = new double[data.length];
        for(int i = 0; i < data.length; i ++){
            normData[i] = data[i] / sum;
        }
        return normData;
    }

    public static void normaliseInPlace(double data[]) {
        double sum = 0;
        for(int i = 0; i < data.length; i ++){
            data[i] += sum;
        }
        for(int i = 0; i < data.length; i ++){
            data[i] /= sum;
        }
    }

    public static double[] reverse(double[] data) {
        double[] revArr = new double[data.length];
        for(int i = 0; i < data.length; i ++){
            revArr[i] = data[i + (data.length - 1)];
        }
        return revArr;
    }

    public static void reverseInPlace(double[] data) {
        for(int i = 0; i < data.length / 2; i ++){
            double tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
    }

    public static void swap(double[] data1, double[] data2) {
        for(int i = 0; i < data1.length; i ++){
            double a = data1[i];
            data1[i] = data2[i];
            data2[i] = a;
        }
    }
}
