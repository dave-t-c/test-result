package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.CarbNutrition;
import org.junit.Before;
import org.junit.Test;


/**
 * Class for testing the Carbs class.
 * @author dave-t-c
 */
public class TestCarbs {

  @Before
  public void setUp() throws Exception {
  }

  /**
   * Test to try and create a new instance of the carb class 
   * and get the total of it.
   */
  @Test
  public void testCreateNewCarbNutrition() {
    CarbNutrition testCarbs = new CarbNutrition();
    assertEquals("Can't create new instance for carbs", 0.0, testCarbs.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add a value to the carb class and then return the correct new total.
   */
  @Test
  public void testAddNutritionValue() {
    CarbNutrition testCarbs = new CarbNutrition();
    testCarbs.addValue("Sample", 3.5);
    assertEquals("Can't add the new value", 3.5, testCarbs.getTotal(), 0.0);
  }

}
