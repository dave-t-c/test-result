package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing fat related nutrition information.
 * @author dave-t-c
 */
public class FatNutrition implements NutritionType {

  Double total = 0.0;
  NutritionHelper helper = new NutritionHelper();
  HashMap<String, Double> values = new HashMap<>();
  
  /**
   * Gets the total for the fat in the FatNutrition Object.
   * @return - Total for the FatNutrition Object.
   */
  @Override
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the Name of the NutritionType.
   * @return Name of NutritionType
   */
  @Override
  public String getName() {
    return "Fat";
  }

  /**
   * Adds a value to the values map.
   * The total for the NutritionType is increased
   * if it can be added successfully. 
   */
  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  /**
   * Get the names of the sub-categories in the values map.
   * @return Set of Sub-category Names
   */
  @Override
  public Set<String> getSubcategoryNames() {
    return helper.getSubcategoryNames(values);
  }

  /**
   * Get the value for a given sub-category.
   * @return value for the given sub-category
   */
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
  }

  /**
   * Remove a given sub-category from the values map.
   * The total will be decreased if it can be removed.
   */
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, values);
  }

  /**
   * Return the values hash map for the FatNutrition object.
   * @return Values map for FatNutrition
   */
  @Override
  public HashMap<String, Double> getValues() {
    return values;
  }
  
  @Override
  public String toString() {
    return "Name: Fat, Values: {}, Total: 0.0";
  }

}
