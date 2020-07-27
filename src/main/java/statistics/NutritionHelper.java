package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Class for the helper methods for all classes
 * that implement the nutrition interface.
 * This class acts as a center location for all of those methods.
 * @author dave-t-c
 */
public class NutritionHelper {

  /**
   * Method for adding a value to the values HashMap from the NutritionType classes.
   * @param category - Category to be added.
   * @param nutritionValues - Map containing the values.
   * @param value - The value for the category to be added.
   * @return - the value the total should be increased by.
   */
  public Double addValue(@NonNull String category, 
      @NonNull HashMap<String, Double> nutritionValues, @NonNull Double value) {
    //If either null, the total should be increased by 0
    if (category == null || value == null || nutritionValues == null || value < 0.0) {
      return 0.0;
    }
    //Get the current value, this will either be null if nothing has previously been added,
    //so the current total is 0.0, or use the current total if it exists.
    Double current = nutritionValues.get(category) == null ? 0.0 : nutritionValues.get(category);
    nutritionValues.put(category, current + value);
    //The total should be adjusted by the value.
    return value;
  }
  
  /**
   * Removes a sub-category from the nutrition values map. 
   * @param category - the sub-category to be removed.
   * @param nutritionValues - The value to remove the sub-category from 
   * @return Double - the value to subtract from the total. 
   */
  public Double removeSubcategory(@NonNull String category, 
      @NonNull HashMap<String, Double> nutritionValues) {
    if (nutritionValues == null || category == null) {
      return 0.0;
    }
    return nutritionValues.get(category) == null ? 0.0 : nutritionValues.remove(category);
  }
  

  /**
   * Gets a value for a specific category from the nutritionValues map.
   * @param category - the category to be searched for.
   * @param nutritionValues - The hash map to be searched for the category.
   * @return The value for the category. If the category does not exist, 0.0 will be returned.
   */
  public Double getValue(@NonNull String category, 
      @NonNull HashMap<String, Double> nutritionValues) {
    if (nutritionValues == null || category == null)  {
      return 0.0;
    }
    return nutritionValues.get(category) == null ? 0.0 : nutritionValues.get(category);
  }
  
  /**
   * Return the set of sub-category games for the nutritionalValues provided.
   * @param nutritionValues - The Values to extract the sub-categories from 
   * @return Set of sub-category names
   */
  public Set<String> getSubcategoryNames(@NonNull HashMap<String, Double> nutritionValues) {
    if (nutritionValues == null)  {
      return Collections.emptySet();
    }
    return nutritionValues.keySet();
  }
  
  /**
   * Checks to see if a NutritionType and an Object are equal.
   * @param type NutritionType to compare.
   * @param obj Object to compare the NutritonType to
   * @return If the two Objects are equal.
   */
  public boolean isEqual(NutritionType type, Object obj) {
    //Check to see if the objects are null before casting them.
    if (type == null || obj == null) {
      return false;
    }
    //Declare a new nutrition type to try and cast to.
    NutritionType objType;
    try { 
      //Try to cast the object.
      objType = (NutritionType) obj;
    } catch (ClassCastException ex) {
      //Return false if it cannot be cast, as if they are not the same type they cannot be equal.
      return false;
    }
    
    //Return false if the value maps are null.
    if (type.getValues() == null || objType.getValues() == null) {
      return false;
    }
    
    return (type.getValues().equals(objType.getValues()));
  }
  
}
