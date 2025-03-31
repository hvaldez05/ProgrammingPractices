package edu.ceu.programming.practices;

import java.util.Random;
import java.util.stream.Stream;


public class Practice3 {

   public static double generatePiStream(long steps){
      Random random = new Random();

      long pointsInsideCircle = Stream.generate(() -> {
         double x = random.nextDouble();
         double y = random.nextDouble();
         return x * x + y * y <= 1;
      })
      .limit(steps)
      .filter(isInside -> isInside)
      .count();
      

      return 4.0 * pointsInsideCircle / steps;

   }

}




   