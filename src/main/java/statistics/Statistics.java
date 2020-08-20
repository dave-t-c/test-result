package main.java.statistics;

import java.util.HashSet;
import java.util.Set;

/**
 * Class for storing the statistics of a meal. 
 * This object will store multiple nutrition types.
 * @author davidcook
 */
public class Statistics {
  
  public Statistics() {
    
  }
  
  public Set<NutritionType> getNutritionSet() {
    return new HashSet<NutritionType>();
  }
}
