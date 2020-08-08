package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import main.java.statistics.ProteinNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing the ProteinNutrition class.
 * @author dave-t-c
 */
public class TestProteinNutrition {
  
  ProteinNutrition testProtein;
  
  @Before
  public void setUp() throws Exception {
    testProtein = new ProteinNutrition();
  }
  
  /**
   * Test to try and create a new instance of the ProteinNutrition class.
   */
  @Test
  public void testCreateNewProtein() {
    assertEquals("Could not get new ProteinNutrition", 
        0.0, testProtein.getTotal(), 0.0);
  }
  
  /**
   * Test to try and add a value to the ProteinNutrition object.
   * The total should have changed to include the new item.
   */
  @Test
  public void testAddItem() {
    testProtein.addValue("Example", 10.0);
    assertEquals("Could not add value to ProteinNutrition",
        10.0, testProtein.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the name of the ProteinNutrition type.
   * The name returned should be "Protein"
   */
  @Test
  public void testGetName() {
    assertEquals("Could not get correct protein name",
        "Protein", testProtein.getName());
  }
  
  /**
   * Test to try and add null values to the ProteinNutrition.
   * The total should not be increased and should be 0.0
   */
  @Test
  public void testAddNullValues() {
    testProtein.addValue(null,  null);
    assertEquals("Could not handle null value",
        0.0, testProtein.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the subcategory names for ProteinNutrition.
   * The set returned should be empty as no items have been added.
   */
  @Test
  public void testGetSubcategoryNames() {
    assertEquals("Could not get empty subcategory",
        Collections.emptySet(), testProtein.getSubcategoryNames());
  }
  
  /**
   * Test to try and get the sub-category names for a non empty
   * ProteinNutrition object.
   * The returned set should contain the key added.
   */
  @Test
  public void testGetSubcategoryNamesNonEmpty() {
    testProtein.addValue("Example", 5.0);
    assertTrue("Could not get non-empty subcategory",
        testProtein.getSubcategoryNames().contains("Example"));
  }
}
