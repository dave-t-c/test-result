package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import main.java.statistics.Statistics;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for creating and testing the Statistics class.
 * @author dave-t-c
 */
public class TestStatistics {
  
  private Statistics testStats;
  private MockNutritionType testNutrition;
  private MockNutritionDifferent diffNutrition;
  private MockNutritionTypeNullName nullNameNutrition;
  
  /**
   * Sets up all of the variables for the tests.
   * @throws Exception - Thrown if an error occurs when constructing variables.
   */
  @Before
  public void setUp() throws Exception {
    testStats = new Statistics();
    testNutrition = new MockNutritionType();
    diffNutrition = new MockNutritionDifferent();
    nullNameNutrition = new MockNutritionTypeNullName();
  }
  
  /**
   * Test to try and create a new Statistics Object and 
   * get the Set of Nutrition.
   * This should return an Empty Set.
   */
  @Test
  public void testCreateStatistics() {
    assertEquals("Could not get empty stats object",
        Collections.emptySet(), testStats.getNutritionSet());
  }
  
  /**
   * Test to try and get a Nutrition type to the Statistics object.
   * The added type should be in the returned set. 
   */
  @Test
  public void testAddNutritionType() {
    testStats.addNutrition(testNutrition);
    assertTrue("Could not add Nutrition Type to Statistics",
        testStats.getNutritionSet().contains(testNutrition));
  }
  
  /**
   * Test to try and add a null NutritionType to Statistics.
   * The NutritionType should not be added and the NutritionSet should be empty.
   */
  @Test
  public void testAddNullType() {
    testStats.addNutrition(null);
    assertEquals("Could not handle null NutritionType",
        Collections.emptySet(), testStats.getNutritionSet());
  }
  
  /**
   * Test to try and get a Specific Nutrition from Statistics.
   * The Nutrition returned should be the same as added.
   */
  @Test
  public void testGetNutritionAdded() {
    testStats.addNutrition(testNutrition);
    assertEquals("Could not get the correct Nutrition",
        testNutrition, testStats.getNutrition(testNutrition.getName()));
  }
  
  /**
   * Test to try and get a different NutritionType from getNutrition method.
   * This should return the different NutritionType.
   */
  @Test
  public void testGetDiffNutrition() {
    testStats.addNutrition(diffNutrition);
    assertEquals("Could not get the different Nutrition from Statistics",
        diffNutrition, testStats.getNutrition(diffNutrition.getName()));    
  }
  
  /**
   * Test to try and add a nutrition with a null name.
   * The item should not be added and the returned list should be empty.
   */
  @Test
  public void testAddNullNutritionName() {
    testStats.addNutrition(nullNameNutrition);
    assertTrue("Could not handle NutritionType with null name",
        testStats.getNutritionSet().isEmpty());
  }

}
