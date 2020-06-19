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
  public void test() {
    CarbNutrition testCarbs = new CarbNutrition();
    assertEquals("Can't create new instance for carbs", testCarbs.getTotal(), (Double) 0.0, 0.0);
  }

}
