package Week3;

/**
 * Created by williamrobertshaw on 29/01/15.
 */
public class ArithmeticSeries {
    public static void main(String[] args){
        int stop = Integer.parseInt(args[0]);
        int count = 1;
        int sum = 0;
        while (count <= stop) {
            sum = sum + count;
            count = count + 1;
        }
        System.out.println(sum);
    }
}
