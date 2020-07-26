package test.java.teststatistics;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import main.java.statistics.CarbNutrition;
import main.java.statistics.NutritionHelper;
import org.junit.Before;
import org.junit.Test;


/**
 * Class for testing the NutritionHelper class.
 * @author dave-t-c
 */
public class TestNutritionHelper {

  NutritionHelper testHelper;
  HashMap<String, Double> testMap;

  @Before
  public void setUp() throws Exception {
    testHelper = new NutritionHelper();
    testMap = new HashMap<>();
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
    testHelper.addValue("Example", testMap, 15.0);
    assertEquals("Could not add to hash map", 15.0, testMap.get("Example"), 0.0);
  }
  
  /**
   * Test to try and add a second value for the same key.
   * The value for the key should increase.
   */
  @Test
  public void testAddDuplicateKey() {
    testHelper.addValue("Example", testMap, 15.0);
    testHelper.addValue("Example", testMap, 10.0);
    assertEquals("Could not add duplicate to hash map", 25.0, testMap.get("Example"), 0.0);
  }
  
  /**
   * Test to try and add a negative value. Negative values should not be added as 
   * as far as I am aware negative values of nutrition don't exist.
   */
  @Test
  public void testAddNegativeValue() {
    testHelper.addValue("Example", testMap, -5.0);
    assertTrue("Could not ignore negative nutrition value",
          testMap.get("Example") == null);
  }
  
  /**
   * Test to try and get a value from the values map. 
   * The map should return the total for that category.
   */
  @Test
  public void testGetCategoryValue() {
    testHelper.addValue("Example", testMap, 15.0);
    assertEquals("Could not retrieve cateogry value", 
        15.0, testHelper.getValue("Example", testMap), 0.0);
  }
  
  /**
   * Test to try and get a different value from the values map.
   * It should return the different value.
   */
  @Test
  public void testGetDifferentValue() {
    testHelper.addValue("Example", testMap, 10.0);
    assertEquals("Could not retrieve cateogry value", 
        10.0, testHelper.getValue("Example", testMap), 0.0);
  }
  
  /**
   * Test to try and get a value for a different category.
   * The value for the category should be returned, not that of another category.
   */
  @Test
  public void testGetDifferentCategory() {
    testHelper.addValue("Other", testMap, 10.5);
    assertEquals("Could not retrieve different category", 
        10.5, testHelper.getValue("Other", testMap), 0.0);
  }
  
  /**
   * Test to try and get a value for a category that does not exist.
   * The value returned should be 0.0.
   */
  @Test
  public void testGetValueNoneExistentCategory() {
    assertEquals("Could not get for non existant category", 
        0.0, testHelper.getValue("Other", testMap), 0.0);
  }
  
  /**
   * Test to try and get the names of the sub-category names
   * from the NutritionHelper Object.
   */
  @Test
  public void testGetSubcategoryNames() {
    assertEquals("Could not get subcategory names", 
        Collections.emptySet(), testHelper.getSubcategoryNames(testMap));
  }
  
  /**
   * Test to try and add a single value to the testMap, then retrieve the category name from the
   * sub-category name method.
   */
  @Test
  public void testGetDifferentSubcategoryName() {
    testHelper.addValue("Other", testMap, 10.5);
    assertTrue("Could not get subcategory name for non empty map",
        testHelper.getSubcategoryNames(testMap).contains("Other"));
    assertTrue("Could not get correct set size", 
        testHelper.getSubcategoryNames(testMap).size() == 1);
  }
  
  /**
   * Test to try and remove a sub-category from the values map. 
   */
  @Test
  public void testRemoveSubcategory() {
    testHelper.addValue("Example", testMap, 10.0);
    assertEquals("Could not remove category", 10.0, 
        testHelper.removeSubcategory("Example", testMap), 0.0);
  }
  
  /**
   * Test to try and remove a different sub-category.
   * The value to subtract should be different as the value added is different
   */
  @Test
  public void testRemoveDifferentSubcategory() {
    testHelper.addValue("Example", testMap, 15.0);
    assertEquals("Could not remove different category", 15.0,
        testHelper.removeSubcategory("Example", testMap), 0.0);
  }
  
  /**
   * Test to try and get the value for a category with a different name.
   */
  @Test
  public void testRemoveDifferentSubcategoryName() {
    testHelper.addValue("Other", testMap, 10.0);
    assertEquals("Could not remove different subcategory", 10.0,
        testHelper.removeSubcategory("Other", testMap), 0.0);
  }
  
  /**
   * Test to try and remove a non existent sub-category
   * The value returned should be 0.0, as the category to be removed does not exist,
   * so the total should not change.
   */
  @Test
  public void testRemoveNonExistantCategory() {
    assertEquals("Could not get correct total change", 0.0, 
        testHelper.removeSubcategory("Other", testMap), 0.0);
  }
  
  /**
   * Test to check the size of the hash map key set decrease after
   * an item is removed.
   */
  @Test
  public void testCheckRemoveSize() {
    testHelper.addValue("Other", testMap, 10.0);
    testHelper.removeSubcategory("Other", testMap);
    assertEquals("Could not change size of values map", 0,
        testMap.keySet().size());
  }
  
  /**
   * Test to try and see if a NutritionType is equal to an Object.
   * This should return true as it is the same NutritionType
   */
  @Test
  public void testNutritionTypeEqual() {
    CarbNutrition testCarbs = new CarbNutrition();
    testHelper.isEqual(testCarbs, testCarbs);
  }

}
