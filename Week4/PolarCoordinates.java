public class PolarCoordinates {

    public static void main(String args[]) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double distance = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);

        System.out.println(distance);
        System.out.println(theta);
    }

}
