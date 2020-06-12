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

  /**
   * Setup all the required values before each test is run.
   * @throws Exception thrown if an error occurs when setting the values.
   */
  @Before
  public void setUp() throws Exception {
    standardCarbs = 25.0;
    diffCarbs = 35.0;
    standardCalories = 300.5;
    diffCalories = 200.5;
  }

  /**
   * Test to try and create a new instance of the Energy Object.
   */
  @Test
  public void testCreateEnergy() {
    Energy testEnergy = new Energy(standardCarbs, standardCalories);
    assertEquals("Can't get carb value from energy", testEnergy.getCarbs(), standardCarbs, 0.0);
  }
  
  /**
   * Test to try and get a different carbohydrate value when a different value
   * is used in the constructor.
   */
  @Test
  public void testCreateEnergyDiffCarbs() {
    Energy testEnergy = new Energy(diffCarbs, standardCalories);
    assertEquals("Can't get diff carb value", testEnergy.getCarbs(), diffCarbs, 0.0);
  }
  
  /**
   * Test to try and get the calories value for the energy Object.
   */
  @Test
  public void testGetCalorieValue() {
    Energy testEnergy = new Energy(standardCarbs, standardCalories);
    assertEquals("Can't get calories from energy", testEnergy.getCalories(), standardCalories, 0.0);
  }
  
  /**
   * Test to try and get a different value from the Energy Object than the one used
   * in the previous test.
   */
  @Test
  public void testGetDiffCalorieValue() {
    Energy testEnergy = new Energy(standardCarbs, diffCalories);
    assertEquals("Can't get diff calorie value", testEnergy.getCalories(), diffCalories, 0.0);
  }
}
