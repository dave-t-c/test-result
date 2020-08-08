package main.java.statistics;

import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing protein related nutrition information.
 * @author dave-t-c
 */
public class ProteinNutrition implements NutritionType {

  /**
   * Returns the total for the ProteinNutrition object.
   */
  @Override
  public Double getTotal() {
    return 0.0;
  }

  @Override
  public String getName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void addValue(String name, Double value) {
    // TODO Auto-generated method stub

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
