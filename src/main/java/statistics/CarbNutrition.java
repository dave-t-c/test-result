package main.java.statistics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Class for Storing Carbohydrate related information.
 * @author dave-t-c
 * @since 0.1
 */
public class CarbNutrition implements NutritionType {

  private Double total = 0.0;
  private Set<String> nameSet = new HashSet<>(); 
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
    nameSet.add(name);
    categoryMap.put(name, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return categoryMap.keySet();
  }
  
  @Override
  public Double getSubcategoryValue(String name) {
    return categoryMap.get(name);
  }

  @Override
  public HashMap<String, Double> getValues() {
    return null;
  }

  

}
