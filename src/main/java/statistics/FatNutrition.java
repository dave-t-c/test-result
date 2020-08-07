package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

public class FatNutrition implements NutritionType {

  Double total = 0.0;
  
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
    total += value;

  }

  @Override
  public Set<String> getSubcategoryNames() {
    // TODO Auto-generated method stub
    return null;
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
