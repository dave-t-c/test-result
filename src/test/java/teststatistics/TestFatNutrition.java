package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import main.java.statistics.FatNutrition;
import org.junit.Test;

/**
 * Class for testing the Fat Nutrition class.
 * @author dave-t-c
 */
public class TestFatNutrition {

  /**
  * Test to try and create a new instance of the fat nutrition
  * class. The total returned should be 0.
  */
  @Test
  public void testGetTotal() {
    FatNutrition testFat = new FatNutrition();
    assertEquals("Could not get new fat nutrition total",
        0.0, testFat.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add a value to the FatNutrition class and return the
   * new total.
   */
  @Test
  public void testAddValue() {
    FatNutrition testFat = new FatNutrition();
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
    FatNutrition testFat = new FatNutrition();
    assertEquals("Could not get correct name", "Fat", testFat.getName());
  }
  
  /**
   * Test to try and add a null string to FatNutrition Class.
   * The total should be 0.
   */
  @Test
  public void testAddNullValues() {
    FatNutrition testFat = new FatNutrition();
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
    FatNutrition testFat = new FatNutrition();
    assertEquals("Could not get empty subcategories",
        Collections.emptySet(), testFat.getSubcategoryNames());
  }
  
  /**
   * Test to try and get the sub-categories when items have been added. 
   */
  @Test
  public void testGetSubcategoryItems() {
    FatNutrition testFat = new FatNutrition();
    testFat.addValue("Example", 10.0);
    assertTrue("Could not return correct subcategory set",
        testFat.getSubcategoryNames().contains("Example"));
  }

}
