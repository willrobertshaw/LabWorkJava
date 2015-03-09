package Week5;

/**
 * Created by williamrobertshaw on 09/03/15.
 */
public class SplitPathName {
    public static String[] splitPath(String s){
        /**
         * Returns 4 components:
         * [0] - directory
         * [1] - filename
         * [2] - filename base
         * [3] - filename extension
         */
        String[] components = new String[4];
        // Directory:
        if (s.lastIndexOf("/") == -1){
            components[0] = "";
            components[1] = s;
        }
        else{
            components[0] = s.substring(0, s.lastIndexOf("/"));
            components[1] = s.substring(s.lastIndexOf("/") + 1, s.length());
        }

        // Filename:
        int firstDot = components[1].indexOf('.');
        if (firstDot == -1){
            components[2] = components[1];
            components[3] = "";
        }
        else{
            components[2] = components[1].substring(0, firstDot);
            components[3] = components[1].substring(firstDot, components[1].length());
        }
        return components;
    }

    public static void main(String[] args){
        for (int i = 0; i < args.length; i++){
            String[] components = splitPath(args[i]);

            System.out.printf("File: %s Type: %s [%s]\n", components[1], components[3], components[0]);
        }
    }
}
