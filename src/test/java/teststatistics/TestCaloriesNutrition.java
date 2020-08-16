package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.CaloriesNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for developing the Calories Nutrition class.
 * @author dave-t-c
 */
public class TestCaloriesNutrition {
  
  private CaloriesNutrition testCalories;
  
  @Before
  public void setUp() throws Exception {
    testCalories = new CaloriesNutrition();
  }
  
  /**
   * Test to try and create a new instance of CaloriesNutrition.
   * The total returned for a new instance should be 0.0
   */
  @Test
  public void testGetNewCaloriesNutrition() {
    assertEquals("Could not get new Calories instance",
        0.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Add a test to try and add a value.
   * The total should be increased by the value added.
   */
  @Test
  public void testAddValue() {
    testCalories.addValue("Example", 5.0);
    assertEquals("Could not add value to Calories Nutrition",
        5.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name for the CaloriesNutrition Object.
   * This should be 'Calories'.
   */
  @Test
  public void testGetCaloriesName() {
    assertEquals("Could not get correct Name for Calories Nutrition",
        "Calories", testCalories.getName());
  }
  
  
}
