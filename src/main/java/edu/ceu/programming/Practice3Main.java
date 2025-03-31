package edu.ceu.programming;

import edu.ceu.programming.practices.Practice3;

public class Practice3Main {
    public static void main (String [] args) {
        long steps = Long.parseLong(args[0]);
        System.out.println ("Number PI is " + Practice3.generatePiStream(Integer.parseInt(args[0])));
    }
    
}
