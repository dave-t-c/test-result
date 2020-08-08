package main.java.statistics;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Class for storing protein related nutrition information.
 * @author dave-t-c
 */
public class ProteinNutrition implements NutritionType {

  private Double total = 0.0;
  private HashMap<String, Double> values = new HashMap<>();
  private NutritionHelper helper = new NutritionHelper();
  
  /**
   * Returns the total for the ProteinNutrition object.
   * @return Total for this ProteinNutrition Object.
   */
  @Override
  public Double getTotal() {
    return total;
  }

  /**
   * Gets the name of the ProteinNutrition.
   * @return - String - 'Protein'
   */
  @Override
  public String getName() {
    return "Protein";
  }

  @Override
  public void addValue(String name, Double value) {
    total += helper.addValue(name, values, value);
  }

  @Override
  public Set<String> getSubcategoryNames() {
    return values.keySet();
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
