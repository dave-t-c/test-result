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
    return categoryMap.keySet();
  }
  
  @Override
  public Double getSubcategoryValue(String name) {
    return categoryMap.get(name) == null ? 0.0 : categoryMap.get(name);
  }
  
  @Override
  public void removeSubcategory(String name) {
    total -= categoryMap.containsKey(name) ? categoryMap.get(name) : 0.0;
    categoryMap.remove(name);
  }

  @Override
  public HashMap<String, Double> getValues() {
    return categoryMap;
  }

  

}
