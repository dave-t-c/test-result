package main.java.statistics;

import java.util.HashSet;
import java.util.Set;

/**
 * Class for storing the statistics of a meal. 
 * This object will store multiple nutrition types.
 * @author davidcook
 */
public class Statistics {
  
  HashSet<NutritionType> nutritionTypes;
  
  public Statistics() {
    nutritionTypes = new HashSet<>();
  }
  
  public Set<NutritionType> getNutritionSet() {
    return nutritionTypes;
  }
  
  /**
   * Adds a NutritionType to the Statistics.
   * @param nutrition - NutirionType to add.
   */
  public void addNutrition(NutritionType nutrition) {
    if (nutrition != null) {      
      nutritionTypes.add(nutrition);
    }
  }
}
