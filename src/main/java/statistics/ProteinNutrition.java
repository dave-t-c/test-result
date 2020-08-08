package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing protein related nutrition information.
 * @author dave-t-c
 */
public class ProteinNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> values = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();
  
  /**
   * Returns the total for the ProteinNutrition object.
   * @return Total for this ProteinNutrition Object.
   */
  @Override
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the name of the ProteinNutrition.
   * @return - String - 'Protein'
   */
  @Override
  public String getName() {
    return "Protein";
  }

  /**
   * Add a sub-category to the ProteinNutrition Object.
   * @param name - Name of the sub-category
   * @param value - value for the sub-category
   */
  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  /**
   * Returns the names of all of the sub-categories.
   * @return - A Set of Strings of Sub-category names. 
   */
  @Override
  public Set<String> getSubcategoryNames() {
    return values.keySet();
  }

  /**
   * Gets the value for a given sub-category.
   * @return Value for sub-category if it exists, 0 if not. 
   */
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
  }

  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, values);
  }

  @Override
  public HashMap<String, Double> getValues() {
    // TODO Auto-generated method stub
    return null;
  }

}
