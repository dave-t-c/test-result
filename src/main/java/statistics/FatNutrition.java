package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

public class FatNutrition implements NutritionType {

  Double total = 0.0;
  NutritionHelper helper = new NutritionHelper();
  HashMap<String, Double> values = new HashMap<>();
  
  @Override
  public Double getTotal() {
    return total;
  }

  @Override
  public String getName() {
    return "Fat";
  }

  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return helper.getSubcategoryNames(values);
  }

  @Override
  public Double getSubcategoryValue(String name) {
    return 0.0;
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
