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
  public double getTotal();
  
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
   * Gets the values for that type of nutrition.
   * E.g.: Carbs, The Strings would be Fast Acting and Long Acting, 
   * the Doubles could be 35.0 and 22.0.
   * @return Key Value pairs for the nutrition values.
   */
  public HashMap<String, Double> getValues();
  
}
