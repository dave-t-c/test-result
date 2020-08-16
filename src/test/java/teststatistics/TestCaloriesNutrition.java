package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import main.java.statistics.CaloriesNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for developing the Calories Nutrition class.
 * @author dave-t-c
 */
public class TestCaloriesNutrition {
  
  private CaloriesNutrition testCalories;
  private CaloriesNutrition otherCalories;
  
  @Before
  public void setUp() throws Exception {
    testCalories = new CaloriesNutrition();
    otherCalories = new CaloriesNutrition();
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
  
  /**
   * Test to get the sub-category value for a category that has not been added.
   * This should return 0.0
   */
  @Test
  public void testGetNonAddedSubcategoryValue() {
    assertEquals("Could not get the correct value for non added sub-category",
        0.0, testCalories.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and get the category value for an item that has been added.
   * The value returned should be the same as the value added.
   */
  @Test
  public void testGetAddedSubcategoryValue() {
    testCalories.addValue("Other", 12.0);
    assertEquals("Could not get value for added category",
        12.0, testCalories.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and add null values.
   * The values should not be added, and the total should stay
   * at 0.0.
   */
  @Test
  public void testAddNulLValues() {
    testCalories.addValue(null, null);
    assertEquals("Could not handle adding null values",
        0.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Test to try and remove a sub-category.
   * The removed category should not be in the name set.
   */
  @Test
  public void testRemoveSubcategoryName() {
    testCalories.addValue("Example", 15.0);
    testCalories.removeSubcategory("Example");
    assertFalse("Could not remove sub-category name",
        testCalories.getSubcategoryNames().contains("Example"));
  }
  
  /**
   * Test to try and remove a sub-category.
   * After removing the category, the total should be 0 again.
   */
  @Test
  public void testRemoveSubcategoryTotal() {
    testCalories.addValue("Other", 5.0);
    testCalories.removeSubcategory("Other");
    assertEquals("Could not get correct total after removing Sub-category",
        0.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Test to try and remove a null sub-category.
   * The total should stay at 0.0.
   */
  @Test
  public void testRemoveNullSubcategory() {
    testCalories.removeSubcategory(null);
    assertEquals("Could not handle removing null category",
        0.0, testCalories.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the values map.
   * No items have been added so, an empty map should be returned.
   */
  @Test
  public void testGetEmptyValues() {
    assertEquals("Could not get empty map from values",
        new HashMap<String, Double>(), testCalories.getValues());
  }
  
  /**
   * Test to try and get the values map when an item has been added.
   * The added item should be in the returned values map.
   */
  @Test
  public void testGetNonEmptyValues() {
    testCalories.addValue("Example", 15.0);
    assertTrue("Could not get the item in the returned values map",
        testCalories.getValues().containsKey("Example"));
  }
  
  /**
   * Test to try and get a formatted String from the 
   * CaloriesNutrition Object.
   * This should return a String in the format:
   * "Name: Calories, Values: {}, Total: 0.0"
   */
  @Test
  public void testGetEmptyFormattedString() {
    assertEquals("Could not get empty formatted String",
        "Name: Calories, Values: {}, Total: 0.0", testCalories.toString());
  }
  
  /**
   * Test to try and get a formatted String that contains
   * an item.  
   */
  @Test
  public void testGetFormattedStringNonEmpty() {
    testCalories.addValue("Example", 25.0);
    assertEquals("Could not get formatted String from non-empty CaloriesNutrition",
        "Name: Calories, Values: {Example:25.0,}, Total: 25.0", testCalories.toString());
  }
  
  /**
   * Test to try and compare the hash code of different CaloriesNutritions.
   * The hash code should be the same as the items are identical.
   */
  @Test
  public void testGetEqualHashCodes() {
    assertTrue("Could not get equal hash codes for identical CalorieNutritions",
        testCalories.hashCode() == otherCalories.hashCode());
  }
  
  /**
   * Test to try and get the hash code for different CaloriesNutritions.
   * The hash code should be different as they have different values.
   */
  @Test
  public void testGetDiffHashCodes() {
    testCalories.addValue("Example", 25.0);
    assertFalse("Could not get different hash codes for different CaloriesNutritions",
        testCalories.hashCode() == otherCalories.hashCode());
  }
}
