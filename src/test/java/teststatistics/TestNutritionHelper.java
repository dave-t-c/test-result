package test.java.teststatistics;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import main.java.statistics.NutritionHelper;
import org.junit.Before;
import org.junit.Test;


/**
 * Class foor testing the NutritionHelper class.
 * @author dave-t-c
 */
public class TestNutritionHelper {

  @Before
  public void setUp() throws Exception{

  }
  
  /**
   * Test to try and create a new instance of the Nutrition Helper class.
   * This should return a new instance of the class.
   */
  @Test
  public void testCreateNutritionHelper()  {
    NutritionHelper testHelper = new NutritionHelper();
    assertEquals("Could not make new NutritionHelper", 
        testHelper.addValue("Example", new HashMap<String, Double>(), 25.0), 25.0, 0.0);
    
  }

}
