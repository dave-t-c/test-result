package main.java.statistics;

import java.util.HashMap;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Class for the helper methods for all classes
 * that implement the nutrition interface.
 * This class acts as a center location for all of those methods.
 * @author dave-t-c
 */
public class NutritionHelper {

  public double addValue(@NonNull String category, HashMap<String, Double> nutritionValues, 
      @NonNull Double value) {
    nutritionValues.put(category, value);
    return value;
  }
  
}
