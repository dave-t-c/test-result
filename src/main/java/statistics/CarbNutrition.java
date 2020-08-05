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

  @Override
  public Double getTotal() {
    return total;
  }
  
  @Override 
  public String getName() {
    return "Carbs";
  }

  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, categoryMap, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return helper.getSubcategoryNames(categoryMap);
  }
  
  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, categoryMap);
  }
  
  @Override
  public void removeSubcategory(String name) {
    total -= helper.removeSubcategory(name, categoryMap);
  }

  @Override
  public HashMap<String, Double> getValues() {
    return categoryMap;
  }
  
  public boolean isEqual(Object obj) {
    return helper.getEqual(this, obj);
  }

  @Override
  public String toString() {
    return helper.getString(this);
  }
  
  @Override 
  public int hashCode() {
    return 5;
  }
  

}
