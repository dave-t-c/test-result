package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import main.java.statistics.CarbNutrition;
import org.junit.Before;
import org.junit.Test;


/**
 * Class for testing the Carbs class.
 * @author dave-t-c
 */
public class TestCarbs {

  //Variables required for the tests.
  private CarbNutrition testCarbs;
  
  @Before
  public void setUp() throws Exception {
    testCarbs = new CarbNutrition();
  }

  /**
   * Test to try and create a new instance of the carb class 
   * and get the total of it.
   */
  @Test
  public void testCreateNewCarbNutrition() {
    assertEquals("Can't create new instance for carbs", 0.0, testCarbs.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add a value to the carb class and then return the correct new total.
   */
  @Test
  public void testAddNutritionValue() {
    testCarbs.addValue("Sample", 3.5);
    assertEquals("Can't add the new value", 3.5, testCarbs.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name that is assigned to the carbs object.
   */
  @Test
  public void testGetCarbsName() {
    assertEquals("Cannot get correct name for carbs class.", "Carbs", testCarbs.getName());
  }
  
  /**
   * Test to try and get the set of names from the carbs class.
   * The set should be empty as no items have been added.
   */
  @Test
  public void testGetValueNamesSet() {
    assertTrue("Cannot get value names", testCarbs.getSubcategoryNames().isEmpty());
  }
  
  /**
   * Test to try and add a value to the carbs class and then return the correct name.
   * This should return a set with one item in that is 'Sample'.
   */
  @Test
  public void testGetCorrectName() { 
    testCarbs.addValue("Sample", 32.5);
    assertTrue("Cannot get correct name", testCarbs.getSubcategoryNames().contains("Sample"));
  }
  
  /**
   * Test to try and get a specific value for a given sub-category.
   * This should return 25.0 for the Example sub-category as this is what has been
   * added to the Carbs class.
   */
  @Test
  public void testGetSubcategoryValue() {
    testCarbs.addValue("Example", 25.0);
    assertEquals("Can't get category value", 25.0, testCarbs.getSubcategoryValue("Example"), 0.0);
  }
  
  /**
   * Test to try and get a different sub category value from the carbs class.
   * The value should be different as a second value has been added with a different name.
   */
  @Test
  public void testGetDifferentSubCategory() {
    testCarbs.addValue("Other", 35.0);
    assertEquals("Can't get diff category", 35.0, testCarbs.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and get the sub-category value for a category that hasn't been added.
   * This should return 0.0 as no values have been added.
   */
  @Test
  public void testGetSubcategoryNotExist() { 
    assertEquals("Can't get non added category", 0.0, testCarbs.getSubcategoryValue("A"), 0.0);
  }
  
  /**
   * Test to try and get the set of category value pairs from the carbs nutrition class.
   * This should return an empty hash map as nothing has been added.
   */
  @Test
  public void testGetCategoryValuePairs() {
    assertTrue("Cannot get correct category pairs", testCarbs.getValues().isEmpty());
  }
  
  /**
   * Test to add a sub-category to the carbs nutrition class and then
   * get the values for it. The values should not be empty and should contain the 
   * key added.
   */
  @Test
  public void testGetCategoryNonEmpty() {
    testCarbs.addValue("Example", 5.0);
    assertEquals("Can't get correct value", 5.0, testCarbs.getValues().get("Example"), 0.0);
  }

}
