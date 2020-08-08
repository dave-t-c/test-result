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

  /**
   * Removes a sub-category from the ProteinNutrition object.
   * The total will be decreased if the item can be removed.
   * @param name - Name of the sub-category to be removed.
   */
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, values);
  }

  /**
   * Returns the values for the ProteinNutrition Object.
   * @return String, Double HashMap containing sub-category names / values.
   */
  @Override
  public HashMap<String, Double> getValues() {
    return values;
  }
  
  /**
   * Checks to see if this ProteinNutrition is equal to another Object.
   * @param obj - Object to be tested for equality
   * @return if this ProteinNutrition is equal to the Object given
   */
  @Override
  public boolean equals(Object obj) {
    return helper.getEqual(this, obj);
  }
  
  /**
   * Returns a formatted String of the ProteinNutrition Object.
   * This contains the name, sub-categories and total.
   * @return - Formatted String containing name, sub-categories and total.
   */
  @Override
  public String toString() {
    return helper.getString(this);
  }
  
  @Override
  public int hashCode() {
    return 5;
  }

}
