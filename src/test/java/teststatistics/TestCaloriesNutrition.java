package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
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
  
  /**
   * Test to try and get the sub-category names from Calories Nutrition.
   * This should return an empty set as none have been added.
   */
  @Test
  public void testGetSubcategoryNames() {
    assertEquals("Could not get empty sub-category names",
        Collections.emptySet(), testCalories.getSubcategoryNames());
  }
  
  /**
   * Test to add an item then get the sub-category items.
   * This should contain the name of the item added.
   */
  @Test
  public void testGetSubcategoryNamesAdded() {
    testCalories.addValue("Example", 5.0);
    assertTrue("Could not get set containg added item",
        testCalories.getSubcategoryNames().contains("Example"));
  }
  
  
}
