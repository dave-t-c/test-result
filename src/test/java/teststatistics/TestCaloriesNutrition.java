package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.CaloriesNutrition;
import org.junit.Test;

/**
 * Test class for developing the Calories Nutrition class.
 * @author dave-t-c
 */
public class TestCaloriesNutrition {
  
  /**
   * Test to try and create a new instance of CaloriesNutrition.
   * The total returned for a new instance should be 0.0
   */
  @Test
  public void testGetNewCaloriesNutrition() {
    CaloriesNutrition testCalories = new CaloriesNutrition();
    assertEquals("Could not get new Calories instance",
        0.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Add a test to try and add a value.
   * The total should be increased by the value added.
   */
  @Test
  public void testAddValue() {
    CaloriesNutrition testCalories = new CaloriesNutrition();
    testCalories.addValue("Example", 5.0);
    assertEquals("Could not add value to Calories Nutrition",
        5.0, testCalories.getTotal(), 0.0);
  }
}
