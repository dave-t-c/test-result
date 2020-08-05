package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for Storing Carbohydrate related information.
 * @author dave-t-c
 * @since 0.1
 */
public class CarbNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> categoryMap = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();

  /**
   * Returns the total for the carbs instance.
   * @return total for the carbs instance.
   */
  @Override
  public Double getTotal() {
    return total;
  }
  
  /**
   * Returns the name of the NutritionType.
   * @return Name of the NutritionType
   */
  @Override 
  public String getName() {
    return "Carbs";
  }

  /**
   * Adds a value to the carbs nutrition type.
   * The total is modified if the item is successfully added.
   */
  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, categoryMap, value);
  }

  /**
   * Gets the categories in the carbs nutrition class.
   * @return Set of Sub-category names.
   */
  @Override
  public Set<String> getSubcategoryNames() {
    return helper.getSubcategoryNames(categoryMap);
  }
  
  /**
   * Returns the value for the specified sub-category.
   * @return Double value for the category.
   */
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, categoryMap);
  }
  
  /**
   * Removes a subcategory from the Carbs Nutrition values.
   * The total is modified if the subcategory can be removed.
   */
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, categoryMap);
  }

  /**
   * Returns the values map for CarbsNutrition.
   * @return HashMap containing 
   */
  @Override
  public HashMap<String, Double> getValues() {
    return categoryMap;
  }
  
  /**
   * Returns if this CabrsNutrition is equal to the given object.
   * @param obj - Object to compare this CarbsNutrition instance against.
   * @return if the CarbsNutrition instance is equal to the given Object.
   */
  public boolean isEqual(Object obj) {
    return helper.getEqual(this, obj);
  }

  /**
   * Gets a formatted string containing the name and values 
   * that belong to this instance.
   * @return Formatted String for this Carbs Instance.
   */
  @Override
  public String toString() {
    return helper.getString(this);
  }
  
  /**
   * Gets a hash code for this Carbs Instance.
   * @return int hash code.
   */
  @Override 
  public int hashCode() {
    return helper.getHashCode(this);
  }
  

}
