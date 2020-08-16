package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing Calorie related nutrition information.
 * @author dave-t-c
 */
public class CaloriesNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> values = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();
  
  /**
   * Returns the total for this CaloriesNutrition.
   * @return Double - Total Calories.
   */
  @Override
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the name of the Calories Nutrition Object.
   * @return "Calories"
   */
  @Override
  public String getName() {
    return "Calories";
  }

  /**
   * Adds a value to the CaloriesNutrition Object.
   * @param name - Name of Sub-category to add.
   * @param value - Corresponding value for the Sub-category.
   */
  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  /**
   * Returns all of the names of the added 
   * sub-categories.
   * @return Set of all the Sub-category Names.
   */
  @Override
  public Set<String> getSubcategoryNames() {
    return values.keySet();
  }

  /**
   * Returns the value for the specified sub-category.
   * @param name - Name of the Sub-category to retrieve the value for.
   * @return Value for the specified Sub-category. 0.0, if it does not exist.
   */
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
  }

  /**
   * Removes the given sub-category. The total will be decreased by 
   * the relevant amount - 0.0 if it doesn't exist, the value of the category if it does.
   * @param name - Name of the sub-category to remove.
   */
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, values);
  }

  /**
   * Return the values for the CaloriesNutrition Object.
   * @return - values map for the CaloriesNutrition Object.
   */
  @Override
  public HashMap<String, Double> getValues() {
    return values;
  }
  
  /**
   * Returns a formatted String of the CaloriesNutrition Object.
   * This will include the items and the total.
   * @return Formatted String of CaloriesNutrition.
   */
  @Override
  public String toString() {
    return helper.getString(this);
  }
  
  /**
   * Gets a hash code for this CaloriesNutrition Object.
   * @return Hash Code value for this CaloriesNutrition.
   */
  @Override
  public int hashCode() {
    return helper.getHashCode(this);
  }
  
  /**
   * Check if this CaloriesNutrition and another Object are equal
   * @param obj - Object to compare this CaloriesNutrition with.
   * @return - result of the equality test.
   */
  @Override
  public boolean equals(Object obj) {
    return helper.getEqual(this, obj);
  }

}
