package test.java.teststatistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import main.java.statistics.NutritionType;

public class MockNutritionType implements NutritionType {

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
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return Collections.emptySet();
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
    return new HashMap<String, Double>();
  }

}
