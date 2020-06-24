package main.java.statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Class for Storing Carbohydrate related information.
 * @author dave-t-c
 * @since 0.1
 */
public class CarbNutrition implements NutritionType {

  private Double total = 0.0;
  private Map<String, Double> categoryMap = new HashMap<>();

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
    total += value;
    categoryMap.put(name, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return categoryMap.keySet();
  }
  
  @Override
  public Double getSubcategoryValue(String name) {
    Double categoryValue = categoryMap.get(name);
    if (categoryValue == null) {
      return 0.0;
    } else {
      return categoryValue;
    }
  }

  @Override
  public HashMap<String, Double> getValues() {
    return null;
  }

  

}
