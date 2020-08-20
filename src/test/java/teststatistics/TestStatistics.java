package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import main.java.statistics.Statistics;
import org.junit.Test;

/**
 * Class for creating and testing the Statistics class.
 * @author dave-t-c
 */
public class TestStatistics {
  
  /**
   * Test to try and create a new Statistics Object and 
   * get the Set of Nutrition.
   * This should return an Empty Set.
   */
  @Test
  public void testCreateStatistics() {
    Statistics testStats = new Statistics();
    assertEquals("Could not get empty stats object",
        Collections.emptySet(), testStats.getNutritionSet());
  }

}
