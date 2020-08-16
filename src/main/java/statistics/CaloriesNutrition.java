package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Class for storing Calorie related nutrition information.
 * @author dave-t-c
 */
public class CaloriesNutrition implements NutritionType {

  private Double total = 0.0;
  private HashSet<String> namesSet = new HashSet<>();
  
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

  @Override
  public void addValue(String name, Double value) {
    total += value;
    namesSet.add(name);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return namesSet;
  }

  @Override
  public Double getSubcategoryValue(String name) {
    // TODO Auto-generated method stub
    return null;
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
