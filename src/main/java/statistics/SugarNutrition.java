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

  @Override
  public void removeSubcategory(String name) {
    values.remove(name);
  }

  @Override
  public HashMap<String, Double> getValues() {
    // TODO Auto-generated method stub
    return null;
  }

}
