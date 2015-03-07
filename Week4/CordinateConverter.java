package Week4;

/**
 * Created by williamrobertshaw on 06/03/15.
 */
public class CordinateConverter {
    public static double convertXYtoR(double x, double y){
        return Math.sqrt(x * x + y * y);
    }
    public static double convertXYtoT(double x, double y){
        return Math.atan2(y, x);
    }
    public static double convertRTtoX(double r, double theta){
        return r * Math.cos(theta);
    }
    public static double convertRTtoY(double r, double theta){
        return r * Math.sin(theta);
    }
    public static double convertDegtoRad(double deg){
        return (deg/180) * Math.PI;
    }
    public static double convertRadtoDeg(double rad){
        return (rad/Math.PI) * 180;
    }
}
