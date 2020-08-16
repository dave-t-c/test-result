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

  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
  }

  @Override
  public void removeSubcategory(String name) {
    // TODO Auto-generated method stub

  }

  @Override
  public HashMap<String, Double> getValues() {
    // TODO Auto-generated method stub
    return null;
  }

}
