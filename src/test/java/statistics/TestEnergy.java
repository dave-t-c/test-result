package test.java.statistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.Energy;
import org.junit.Before;
import org.junit.Test;


/**
 * Class for creating / testing the Energy class.
 * @author David Cook
 */
public class TestEnergy {

  private double standardCarbs;
  private double diffCarbs;
  private double standardCalories;
  private double diffCalories;
  private Energy standardEnergy;
  private Energy diffEnergy;

  /**
   * Setup all the required values and Energy Objects before each test is run
   * to ensure that the values are correct.
   * @throws Exception thrown if an error occurs when setting the values.
   */
  @Before
  public void setUp() throws Exception {
    standardCarbs = 25.0;
    diffCarbs = 35.0;
    standardCalories = 300.5;
    diffCalories = 200.5;
    standardEnergy = new Energy(standardCarbs, standardCalories);
    diffEnergy = new Energy(diffCarbs, diffCalories);
  }

  /**
   * Test to try and create a new instance of the Energy Object.
   */
  @Test
  public void testCreateEnergy() {
    assertEquals("Can't get carb value from energy", standardEnergy.getCarbs(), standardCarbs, 0.0);
  }
  
  /**
   * Test to try and get a different carbohydrate value when a different value
   * is used in the constructor.
   */
  @Test
  public void testCreateEnergyDiffCarbs() {
    assertEquals("Can't get diff carb value", diffEnergy.getCarbs(), diffCarbs, 0.0);
  }
  
  /**
   * Test to try and get the calories value for the energy Object.
   */
  @Test
  public void testGetCalorieValue() {
    assertEquals("Can't get calories", standardEnergy.getCalories(), standardCalories, 0.0);
  }
  
  /**
   * Test to try and get a different value from the Energy Object than the one used
   * in the previous test.
   */
  @Test
  public void testGetDiffCalorieValue() {
    assertEquals("Can't get diff calorie value", diffEnergy.getCalories(), diffCalories, 0.0);
  }
  
  /**
   * Test to try and see if two objects are equal. These objects should be equal as 
   * they have the same components.
   */
  @Test
  public void testObjectsEquality() {
    Energy duplicateEnergy = new Energy(standardEnergy.getCarbs(), standardEnergy.getCalories());
    assertEquals("Can't get equal objects", standardEnergy, duplicateEnergy);
  }
}
