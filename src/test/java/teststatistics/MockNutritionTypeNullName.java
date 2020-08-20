package test.java.teststatistics;

import java.util.HashMap;
import java.util.Set;
import main.java.statistics.NutritionHelper;
import main.java.statistics.NutritionType;

/**
 * Mock nutrition type for testing NutritionHelper.
 * This has a null name so can be used for testing where this may be checked.
 * @author dave-t-c
 */
public class MockNutritionTypeNullName implements NutritionType {
  HashMap<String, Double> valuesMap = new HashMap<>();
  Double total = 0.0;
  NutritionHelper helper = new NutritionHelper();

  @Override
  public Double getTotal() {
    return total;
  }

  @Override
  public String getName() {
    return null;
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
    return 0.0;
  }

  @Override
  public void removeSubcategory(String name) {

  }

  @Override
  public HashMap<String, Double> getValues() {
    return valuesMap;
  }
  
  @Override
  public boolean equals(Object obj) {
    return helper.getEqual(this, obj);
  }

}
