package edu.ceu.programming.practices;

import java.util.Random;


public class Practice1 {

    /**
     * Generates an approximation to number PI using the Monte Carlo method.
     * The input parameter `steps` indicates the number of points generated.
     *
     * @param steps The number of iterations for the Monte Carlo simulation.
     * @return Approximated value of PI.
     */
    public static double generatePiIterative(long steps){
        Random random = new Random();
        long pointsInsideCircle = 0;

        for (long i = 0; i < steps; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x * x + y * y <=1) {
                pointsInsideCircle++;
            }
        } 
 

        double piApproximation = 4.0 * pointsInsideCircle / (double) steps;
        return piApproximation; //
    }
}