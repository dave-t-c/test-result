package main.java.statistics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for storing the statistics of a meal. 
 * This object will store multiple nutrition types.
 * @author dave-t-c
 */
public class Statistics {
  
  HashMap<String, NutritionType> nutritionTypes;
  
  public Statistics() {
    nutritionTypes = new HashMap<>();
  }
  
  /**
   * Gets the set of NutritionTypes in this Statistics Object.
   * @return - Set of the NutritionTypes added.
   */
  public Set<NutritionType> getNutritionSet() {
    Set<NutritionType> nutritionSet = new HashSet<>();
    for (String key : nutritionTypes.keySet()) {
      nutritionSet.add(nutritionTypes.get(key));
    }
    return nutritionSet;
  }
  
  /**
   * Adds a NutritionType to the Statistics.
   * @param nutrition - NutirionType to add.
   */
  public void addNutrition(NutritionType nutrition) {
    if (nutrition != null) {      
      nutritionTypes.put(nutrition.getName(), nutrition);
    }
  }
  
  public NutritionType getNutrition(String name) {
    return nutritionTypes.get(name);
  }
}
