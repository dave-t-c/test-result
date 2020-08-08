package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

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

}
