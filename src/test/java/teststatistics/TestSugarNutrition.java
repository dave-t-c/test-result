package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.SugarNutrition;
import org.junit.Test;

/**
 * Class for testing / creating the SugarNutrition class.
 * @author dave-t-c
 */
public class TestSugarNutrition {
  
  /**
   * Test to try and create a new SugarNutrition instance.
   * The total for it should be 0.
   */
  @Test
  public void testCreateNewSugarNutrition() {
    SugarNutrition testSugar = new SugarNutrition();
    assertEquals("Could not get new SugarNutrition Object",
        0.0, testSugar.getTotal(), 0.0);
  }

}