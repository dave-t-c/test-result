package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SugarNutrition implements NutritionType {

  private Double total = 0.0;
  private Set<String> addedCategories = new HashSet<>();
  
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
    addedCategories.add(name);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return addedCategories;
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
