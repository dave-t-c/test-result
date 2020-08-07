package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.FatNutrition;
import org.junit.Test;

/**
 * Class for testing the Fat Nutrition class.
 * @author dave-t-c
 */
public class TestFatNutrition {

  /**
  * Test to try and create a new instance of the fat nutrition
  * class. The total returned should be 0.
  */
  @Test
  public void testGetTotal() {
    FatNutrition testFat = new FatNutrition();
    assertEquals("Could not get new fat nutrition total",
        0.0, testFat.getTotal(), 0.0);
  }

}
