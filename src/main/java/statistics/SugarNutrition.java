package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SugarNutrition implements NutritionType {

  private Double total = 0.0;
  
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
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return Collections.emptySet();
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
