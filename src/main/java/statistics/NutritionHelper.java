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
   * @return - the value the total should be increased by.
   */
  public Double addValue(@NonNull String category, 
      @NonNull HashMap<String, Double> nutritionValues, @NonNull Double value) {
    //If either null, the total should be increased by 0
    if (category == null || value == null || nutritionValues == null || value < 0.0) {
      return 0.0;
    }
    //Get the current value, this will either be null if nothing has previously been added,
    //so the current total is 0.0, or use the current total if it exists.
    Double current = nutritionValues.get(category) == null ? 0.0 : nutritionValues.get(category);
    nutritionValues.put(category, current + value);
    //The total should be adjusted by the value.
    return value;
  }
  

  /**
   * Gets a value for a specific category from the nutritionValues map.
   * @param category - the category to be searched for.
   * @param nutritionValues - The hash map to be searched for the category.
   * @return The value for the category. If the category does not exist, 0.0 will be returned.
   */
  public Double getValue(@NonNull String category, 
      @NonNull HashMap<String, Double> nutritionValues) {
    if (nutritionValues == null || category == null)  {
      return 0.0;
    }
    return nutritionValues.get(category) == null ? 0.0 : nutritionValues.get(category);
  }
  
}
