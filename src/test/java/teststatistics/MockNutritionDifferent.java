package test.java.teststatistics;

import java.util.HashMap;
import java.util.Set;
import main.java.statistics.NutritionType;

/**
 * Mock nutrition for testing the nutrition helper class.
 * @author dave-t-c
 */
public class MockNutritionDifferent implements NutritionType {
  HashMap<String, Double> valuesMap = new HashMap<>();
  Double total = 0.0;

  @Override
  public Double getTotal() {
    return 0.0;
  }

  @Override
  public String getName() {
    return "Other";
  }

  @Override
  public void addValue(String name, Double value) {
    valuesMap.put(name, value);
    total += value;
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return valuesMap.keySet();
  }

  @Override
  public Double getSubcategoryValue(String name) {
    return total;
  }

  @Override
  public void removeSubcategory(String name) {

  }

  @Override
  public HashMap<String, Double> getValues() {
    return valuesMap;
  }

}
