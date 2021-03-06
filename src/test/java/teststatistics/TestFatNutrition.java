package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import main.java.statistics.FatNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing the Fat Nutrition class.
 * @author dave-t-c
 */
public class TestFatNutrition {
  
  private FatNutrition testFat;
  private FatNutrition otherFat;
  
  @Before
  public void setUp() throws Exception {
    testFat = new FatNutrition();
    otherFat = new FatNutrition();
  }

  /**
  * Test to try and create a new instance of the fat nutrition
  * class. The total returned should be 0.
  */
  @Test
  public void testGetTotal() {
    assertEquals("Could not get new fat nutrition total",
        0.0, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add a value to the FatNutrition class and return the
   * new total.
   */
  @Test
  public void testAddValue() {
    testFat.addValue("Example", 3.5);
    assertEquals("Could not add item to fat nutrition",
        3.5, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name of the NutritionType.
   * This should return "Fat"
   */
  @Test
  public void testGetNutritionName() {
    assertEquals("Could not get correct name", "Fat", testFat.getName());
  }
  
  /**
   * Test to try and add a null string to FatNutrition Class.
   * The total should be 0.
   */
  @Test
  public void testAddNullValues() {
    testFat.addValue(null, null);
    assertEquals("Could not handle null value", 
        0.0, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the sub-categories from the Fat Nutrition class.
   * With none added, it should be an empty set. 
   */
  @Test
  public void testGetSubcategory() {
    assertEquals("Could not get empty subcategories",
        Collections.emptySet(), testFat.getSubcategoryNames());
  }
  
  /**
   * Test to try and get the sub-categories when items have been added. 
   */
  @Test
  public void testGetSubcategoryItems() {
    testFat.addValue("Example", 10.0);
    assertTrue("Could not return correct subcategory set",
        testFat.getSubcategoryNames().contains("Example"));
  }
  
  /**
   * Test to try and get the sub category value for a category that has 
   * not been added.
   */
  @Test
  public void testGetSubcategoryValue() {
    assertEquals("Could not get subcategory value",
        0.0, testFat.getSubcategoryValue("Example"), 0.0);
  }
  
  /**
   * Test to get a sub-category value for a value that has been added. 
   */
  @Test
  public void testGetSubcategoryValueAdded() {
    testFat.addValue("Example", 10.0);
    assertEquals("Could not get value for added category", 
        10.0, testFat.getSubcategoryValue("Example"), 0.0);
  }
  
  /**
   * Test to remove a sub-category from the values map.
   * The total value should be 0.
   */
  @Test
  public void testRemoveSubcategory() {
    testFat.addValue("Example", 10.0);
    testFat.removeSubcategory("Example");
    assertEquals("Could not remove sub-category", 
        0.0, testFat.getTotal(), 0.0);    
  }
  
  /**
   * Test to try and remove a sub-category that doesn't exist.
   * This should mean that the total is 0.0, as it should not have changed.
   */
  @Test
  public void testRemoveSubcategoryNotExist() {
    testFat.removeSubcategory("Example");
    assertEquals("Could not remvoe non-existing sub-category",
        0.0, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the values map from a given FatNutrition.
   * The size of the map should be 0 as no items have been added.
   */
  @Test
  public void testGetValuesMapEmpty() {
    assertEquals("Could not get the values map",
        new HashMap<String, Double>(), testFat.getValues());
  }
  
  /**
   * Test to try and get the values map for a FatNutrition
   * object. This should contain the key for the item added.
   */
  @Test
  public void testGetValuesMapNonEmpty() {
    testFat.addValue("Example", 10.0);
    assertTrue("Could not get values map with items",
        testFat.getValues().containsKey("Example"));
  }
  
  /**
   * Test to try and get a formatted String from FatNutrition.
   */
  @Test
  public void testGetStringEmpty() {
    assertEquals("Could not get formatted String",
        "Name: Fat, Values: {}, Total: 0.0", testFat.toString());
  }
  
  /**
   * Test to try and get a different string from the FatNutrition Object.
   * The returned string should contain the added items.
   */
  @Test
  public void testGetNonEmptyString() {
    testFat.addValue("Example", 10.0);
    assertEquals("Could not get formatted String for non-empty FatNutrition",
        "Name: Fat, Values: {Example:10.0,}, Total: 10.0", testFat.toString());
  }
  
  /**
   * Test to try and see if an object is equal itself.
   * This should return true as they are both empty and have the same total.
   */
  @Test
  public void testGetEqual() {
    assertTrue("Could not get equal FatNutrition",
        testFat.equals(otherFat));
  }
  
  /**
   * Test to try and see if two different FatNutrition objects are equal.
   * This should return false as one has an item.
   */
  @Test
  public void testGetEqualDiffItems() {
    otherFat.addValue("Example", 10.0);
    assertFalse("Could not get unequal diff FatNutrition",
        testFat.equals(otherFat));
  }
  
  /**
   * Test to try and get the hash code of two identical FatNutritions.
   * The hash code returned for each should be equal as they are identical.
   */
  @Test
  public void testGetHashCode() {
    assertTrue("Could not get equal hash codes for identical FatNutrition objects.",
        testFat.hashCode() == otherFat.hashCode());
  }
  
  /**
   * Test to try and get a different hash code for a FatNutrition object that 
   * has different items.
   */
  @Test
  public void testGetHashCodeDiffItems() {
    testFat.addValue("Example", 10.0);
    assertTrue("Could not get different hash codes",
        testFat.hashCode() != otherFat.hashCode());
  }

}
