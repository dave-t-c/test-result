package test.java.teststatistics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.HashMap;
import main.java.statistics.ProteinNutrition;
import org.junit.Before;
import org.junit.Test;

/**
 * Class for testing the ProteinNutrition class.
 * @author dave-t-c
 */
public class TestProteinNutrition {
  
  ProteinNutrition testProtein;
  ProteinNutrition otherProtein;
  
  @Before
  public void setUp() throws Exception {
    testProtein = new ProteinNutrition();
    otherProtein = new ProteinNutrition();
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
  
  /**
   * Test to try and get a sub-category value for a category that has not been added.
   * This should return 0.0 as it does not exist.
   */
  @Test
  public void testGetSubcategoryValue() {
    assertEquals("Could not get non existant sub-category value",
        0.0, testProtein.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and get the value for an added sub-category.
   * This should return the value of the added item.
   */
  @Test
  public void testGetSubcategoryValueAdded() {
    testProtein.addValue("Other", 10.0);
    assertEquals("Could not get correct sub-category value", 
        10.0, testProtein.getSubcategoryValue("Other"), 0.0);
  }
  
  /**
   * Test to try and remove a sub-category from ProteinNutrition.
   * This should mean the added value should not be in the sub-category names.
   */
  @Test
  public void testRemoveSubcategory() {
    testProtein.addValue("Other", 10.0);
    testProtein.removeSubcategory("Other");
    assertFalse("Could not remove sub-category",
        testProtein.getSubcategoryNames().contains("Other"));
  }
  
  /**
   * Test to remove a value using removeSubcategory.
   * The total should also decrease.
   */
  @Test
  public void testRemoveSubcategoryCorrectTotal() {
    testProtein.addValue("Example", 5.0);
    testProtein.removeSubcategory("Example");
    assertEquals("Could not decrease total when removing category",
        0.0, testProtein.getTotal(), 0.0);
  }
  
  /**
   * Test to try and remove a sub-category that has not been added.
   * The total should remain at 0.
   */
  @Test
  public void testRemoveNonAddedCategory() {
    testProtein.removeSubcategory("Example");
    assertEquals("Could not handle removing non-existing sub-category",
        0.0, testProtein.getTotal(), 0.0);
  }
  
  /**
   * Test to try and get the values from ProteinNutrition.
   * This should return an Empty hash map as no items have been added.
   */
  @Test
  public void testGetValuesEmpty() {
    assertEquals("Could not get empty values", 
        testProtein.getValues(), new HashMap<String, Double>());
  }
  
  /**
   * Test to try and get a non empty values map from ProteinNutrition.
   * The values map should contain the item added. 
   */
  @Test
  public void testGetValuesNonEmpty() {
    testProtein.addValue("Other", 15.0);
    assertTrue("Could not get non-empty values map",
        testProtein.getValues().containsKey("Other"));
  }
  
  /**
   * Test to see if two identical ProteinNutrition objects 
   * are equal.
   * They should be as they are both empty, have the same total and name.
   */
  @Test
  public void testGetEqual() {
    assertTrue("Could not get equal ProteinNutrition Objects",
        testProtein.equals(otherProtein));
  }
  
  /**
   * Test to try and see if different ProteinNutrition Objects are equal.
   * This should return false as the objects are different as they have
   * different items.
   */
  @Test
  public void testGetEqualDiffObjects() {
    testProtein.addValue("Example", 10.0);
    assertFalse("Could not get different ProteinNutrition to be unequal",
        testProtein.equals(otherProtein));  
  }
  
  /**
   * Test to try and get a formatted string from the ProteinNutrtition Object.
   * This should be in the format:
   * "Name: Protein, Values: {}, Total: 0.0"
   */
  @Test
  public void testGetFormattedStringEmpty() {
    assertEquals("Could not get formatted String for empty ProteinNutrition",
        "Name: Protein, Values: {}, Total: 0.0", testProtein.toString());
  }
  
  /**
   * Test to try and get a formatted string from ProteinNutrition, 
   * where it contains a sub-category.
   */
  @Test
  public void testGetStringWithSubcategory() {
    testProtein.addValue("Example", 5.0);
    assertEquals("Could not get formmated String from ProteinNutrition with item",
        "Name: Protein, Values: {Example:5.0,}, Total: 0.0", testProtein.toString());
  }
  
}
