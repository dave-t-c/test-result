package test.java.teststatistics;

import java.util.HashMap;
import java.util.Set;
import main.java.statistics.NutritionType;

/**
 * Mock nutrition type for testing NutritionHelper.
 * @author dave-t-c
 */
public class MockNutritionType implements NutritionType {
  HashMap<String, Double> valuesMap = new HashMap<>();

  @Override
  public Double getTotal() {
    return 0.0;
  }

  @Override
  public String getName() {
    return "Carbs";
  }

  @Override
  public void addValue(String name, Double value) {
    valuesMap.put(name, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return valuesMap.keySet();
  }

  @Override
  public Double getSubcategoryValue(String name) {
    return 0.0;
  }

  @Override
  public void removeSubcategory(String name) {

  }

  @Override
  public HashMap<String, Double> getValues() {
    return valuesMap;
  }

}
