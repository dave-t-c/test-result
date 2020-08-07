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
  
  /**
   * Test to try and add a value to the FatNutrition class and return the
   * new total.
   */
  @Test
  public void testAddValue() {
    FatNutrition testFat = new FatNutrition();
    testFat.addValue("Example", 3.5);
    assertEquals("Could not add item to fat nutrition",
        3.5, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name of the NutritionType.
   * This should return "Fat"
   */
  @Test
  public void testGetNutritionName() {
    FatNutrition testFat = new FatNutrition();
    assertEquals("Could not get correct name", "Fat", testFat.getName());
  }

}
