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

  /**
   * Method for adding a value to the values HashMap from the NutritionType classes.
   * @param category - Category to be added.
   * @param nutritionValues - Map containing the values.
   * @param value - The value for the category to be added.
   * @return
   */
  public double addValue(@NonNull String category, HashMap<String, Double> nutritionValues, 
      @NonNull Double value) {
    if (category == null || value == null) {
      return 0.0;
    }
    nutritionValues.put(category, value);
    return value;
  }
  
}
