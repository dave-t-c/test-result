package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

public class SugarNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> values = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();
  
  @Override
  public Double getTotal() {
    return total;
  }

  @Override
  public String getName() {
    return "Sugar";
  }

  @Override
  public void addValue(String name, Double value) {
    total += value;
    values.put(name, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return values.keySet();
  }

  @Override
  public Double getSubcategoryValue(String name) {
    return helper.getValue(name, values);
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
