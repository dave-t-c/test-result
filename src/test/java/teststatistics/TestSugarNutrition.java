package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import main.java.statistics.SugarNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing / creating the SugarNutrition class.
 * @author dave-t-c
 */
public class TestSugarNutrition {
  
  SugarNutrition testSugar;
  
  @Before
  public void setUp() throws Exception {
    testSugar = new SugarNutrition();
  }
  
  /**
   * Test to try and create a new SugarNutrition instance.
   * The total for it should be 0.
   */
  @Test
  public void testCreateNewSugarNutrition() {
    assertEquals("Could not get new SugarNutrition Object",
        0.0, testSugar.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add an item to the SugarNutrition item.
   * The total should be increased by the value added.
   */
  @Test
  public void testAddSugarNutrition() {
    testSugar.addValue("Example", 10.0);
    assertEquals("Could not add item to SugarNutrition",
        10.0, testSugar.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name of the SugarNutrition class.
   * This should return 'Sugar'
   */
  @Test
  public void testGetSugarNutritionName() {
    assertEquals("Could not get correct name for SugarNutrition",
        "Sugar", testSugar.getName());
  }
  
  /**
   * Test to try and get the sub-category names when no items have been added.
   * This should return an empty set.
   */
  @Test
  public void testGetEmptySubcategoryNames() {
    assertEquals("Could not get empty sub-category names set",
        Collections.emptySet(), testSugar.getSubcategoryNames());
  }  
  
  /**
   * Test to try and add a sub-category, then check to see that it is in the returned set of names.
   */
  @Test
  public void testGetSubcategoryNameNonEmpty() {
    testSugar.addValue("Example", 10.0);
    assertTrue("Could not add Subcategory name to SugarNutrition",
        testSugar.getSubcategoryNames().contains("Example"));
  }
  
  /**
   * Test to try and get a given value for a specified category.
   * This should return 0 as the category has not been added.
   */
  @Test
  public void testGetSubcategoryValue() {
    assertEquals("Could not get correct sub-category value",
        0.0, testSugar.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and get the value for a specific sub-category.
   * The value returned should be the same as for the category added.
   */
  @Test
  public void testGetSubcategoryValueAdded() {
    testSugar.addValue("Other", 5.0);
    assertEquals("Could not get sub-category for specific value",
        5.0, testSugar.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and add null values to SugarNutrition.
   * The total should not be changed and it should still be 0.
   */
  @Test
  public void testAddNullValues() {
    testSugar.addValue(null, null);
    assertEquals("Could not handle adding null value",
        0.0, testSugar.getTotal(), 0.0);
  }
  
  /**
   * Test to try and remove a sub-category.
   * The removed item should not be in the remaining sub-categories.
   */
  @Test
  public void testRemoveSubcategory() {
    testSugar.addValue("Example", 10.0);
    testSugar.removeSubcategory("Example");
    assertFalse("Could not remove sub-category",
        testSugar.getSubcategoryNames().contains("Example"));
  }
  
  /**
   * Test to try and remove a different sub-category.
   */
  @Test
  public void testRemoveDiffSubcategory() {
    testSugar.addValue("Other", 5.0);
    testSugar.removeSubcategory("Other");
    assertFalse("Could not remove different sub-category",
        testSugar.getSubcategoryNames().contains("Other"));
  }
  
  /**
   * Test to see if the total is decreased when an item is removed.
   * The total should be 0 as the item has been added and then removed.
   */
  @Test
  public void testRemoveSubcategoryDecreaseTotal() {
    testSugar.addValue("Other", 10.0);
    testSugar.removeSubcategory("Other");
    assertEquals("Could not decrease total when sub-category is removed",
        0.0, testSugar.getTotal(), 0.0);
  }

}
