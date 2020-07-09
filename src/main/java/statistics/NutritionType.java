package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Interface that will need to be implemented for all of the 
 * different nutrition types that are to be used.
 * If this interface is implemented then it can be added to the stats and used.
 * @author dave-t-c
 * @since 0.1
 */
public interface NutritionType {
  
  /**
   * Method that returns the total of the type of nutrition being used.
   * For example: you could have long acting and short acting carbs.
   * This should return the total of the two combined.
   * @return double - total of that type of nutrition
   */
  public Double getTotal();
  
  /**
   * Get the name for the nutrition type specified. 
   * This will be used to get it from the statistics hash map.
   * @return - String - the name of the nutrition type, e.g. carbs.
   */
  public String getName();
  
  /**
   * Adds a value to the Hash Map for this nutrition type.
   * @param name - Name of the type to be added.
   * @param value - Value for the new type being added.
   */
  public void addValue(String name, Double value);
  
  /**
   * Gets the different types added.
   * E.g. for carbs: could be Long Acting and Fast Acting.
   * @return The names of the types of that nutrition.
   */
  public Set<String> getSubcategoryNames();
  
  /**
   * Gets the value for a specified sub-category.
   * This could be useful when you want to get a specific value but do not
   * want to get a copy of the hash map and do it yourself.
   * @param name - The sub-category to be looked for.
   * @return - The value for the given sub-category -> will return 0.0 if not found. 
   */
  public Double getSubcategoryValue(String name);
  
  /**
   * Removes a sub-category from the Nutrition Type.
   * @param name - The name of the sub-category to be removed.
   */
  public void removeSubcategory(String name);
  
  /**
   * Gets the values for that type of nutrition.
   * E.g.: Carbs, The Strings would be Fast Acting and Long Acting, 
   * the Doubles could be 35.0 and 22.0.
   * @return Key Value pairs for the nutrition values.
   */
  public HashMap<String, Double> getValues();
  
}
