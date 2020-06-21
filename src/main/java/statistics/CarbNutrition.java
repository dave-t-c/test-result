package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Class for Storing Carbohydrate related information.
 * @author dave-t-c
 * @since 0.1
 */
public class CarbNutrition implements NutritionType {

  double total = 0.0;

  @Override
  public double getTotal() {
    return total;
  }
  
  @Override 
  public String getName() {
    return "Carbs";
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
  public HashMap<String, Double> getValues() {
    return null;
  }

}
