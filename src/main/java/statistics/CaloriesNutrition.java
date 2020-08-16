package main.java.statistics;

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
  private HashMap<String, Double> values = new HashMap<>();
  
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
    values.put(name, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return namesSet;
  }

  @Override
  public Double getSubcategoryValue(String name) {
    return values.get(name) == null ? 0.0 : values.get(name);
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
