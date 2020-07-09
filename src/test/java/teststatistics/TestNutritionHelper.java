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

  NutritionHelper testHelper;  

  @Before
  public void setUp() throws Exception {
    testHelper = new NutritionHelper();
  }
  
  /**
   * Test to try and create a new instance of the Nutrition Helper class.
   * This should return a new instance of the class.
   */
  @Test
  public void testCreateNutritionHelper()  {
    assertEquals("Could not make new NutritionHelper", 
        testHelper.addValue("Example", new HashMap<String, Double>(), 25.0), 25.0, 0.0);
  }
  
  /**
   * Test to try and add a different value to the Nutrition helper class.
   * The value returned should be +15.0
   */
  @Test
  public void testAddDifferentValue() {
    assertEquals("Could not add different value",
              testHelper.addValue("Example", new HashMap<String, Double>(), 15.0), 15.0, 0.0);
  }
  
  /**
   * Test to try and add the example, along with the value to the hash map.
   * The hash map should contain the key value pair.
   */
  @Test
  public void testAddtoHashMap() {
    HashMap<String, Double> testMap = new HashMap<>();
    testHelper.addValue("Example", testMap, 15.0);
    assertEquals("Could not add to hash map", 15.0, testMap.get("Example"), 0.0);
  }

}
