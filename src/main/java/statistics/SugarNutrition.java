package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing Nutrition information related to sugar.
 * @author dave-t-c
 */
public class SugarNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> values = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();
  
  /**
   * Returns the total for the sugar values in SugarNutrition.
   * @return Total value for sugar nutrition.
   */
  @Override
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the name of the Sugar Nutrition object.
   * @return "Sugar"
   */
  @Override
  public String getName() {
    return "Sugar";
  }

  /**
   * Adds a new sub-category and value pair to SugarNutrition.
   * The total is changed appropriately.
   * @param name - name of the sub-category to add.
   * @param value - value for the sub-category.
   */
  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  /**
   * Returns the set of sub-category names for the SugarNutrition Object.
   * @return - Set of Sub-category names.
   */
  @Override
  public Set<String> getSubcategoryNames() {
    return values.keySet();
  }

  /**
   * Returns the value for a given sub-category.
   * @param name - sub-category to return the value for,
   * @return value for the given sub-category. 0 if it has not been added.
   */
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
  }

  /**
   * Removes a given sub-category from the values map.
   * The total will be decreased by the value in the map.
   * If the value is not in the map, the total will not change.
   */
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, values);
  }

  /**
   * Method for returning the Values map.
   * @return values map containing all sub-category, value pairs.
   */
  @Override
  public HashMap<String, Double> getValues() {
    return values;
  }
  
  /**
   * Gets a formatted String of the SugarNutrition Object.
   * @return - Formatted String containing name, categories and values and total.
   */
  @Override 
  public String toString() {
    return helper.getString(this);
  }
  
  /**
   * Calculates a hash code for the SugarNutrtition Object.
   * @return Hash code for this SugarNutrition Object.
   */
  @Override
  public int hashCode() {
    return helper.getHashCode(this);
  }
  
  /**
   * Checks the equality of this SugarNutrition with an Object.
   * @param obj - Object to test equality with.
   * @return Equality of this SugarNutrition Object and the Object passed.
   */
  @Override
  public boolean equals(Object obj) {
    return helper.getEqual(this, obj);
  }

}
