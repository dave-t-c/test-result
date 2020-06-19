package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for Storing Carbohydrate related information.
 * @author dave-t-c
 * @since 0.1
 */
public class CarbNutrition implements NutritionType {

  @Override
  public double getTotal() {
    return 0;
  }
  
  @Override 
  public String getName() {
    return null;
  }

  @Override
  public void addValue(String name, Double value) {

  }

  @Override
  public Set<String> getSubcategoryNames() {
    return null;
  }

  @Override
  public HashMap<String, Double> getValues() {
    return null;
  }

}
