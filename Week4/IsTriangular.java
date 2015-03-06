/**
 * Created by williamrobertshaw on 06/03/15.
 */
public class IsTriangular {
    public static boolean isTri(double a, double b, double c){
        if(a < 0 || b < 0 || c < 0){
            return false;
        }
        if(a >= b + c || b >= a + c || c >= a + b){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        double a = StdIn.readDouble();
        double b = StdIn.readDouble();
        double c = StdIn.readDouble();

        if(isTri(a,b,c)){
            System.out.println("Is a triangle");
        }
        else{
            System.out.println("Not a triangle");
        }

    }
}
