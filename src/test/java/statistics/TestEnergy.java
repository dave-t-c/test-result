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
  private double standardCalories;

  /**
   * Setup all the required values before each test is run.
   * @throws Exception thrown if an error occurs when setting the values.
   */
  @Before
  public void setUp() throws Exception {
    standardCarbs = 25.0;
    standardCalories = 300.5;
  }

  /**
   * Test to try and create a new instance of the Energy Object.
   */
  @Test
  public void testCreateEnergy() {
    Energy testEnergy = new Energy(standardCarbs, standardCalories);
    assertEquals("Can't get carb value from energy", testEnergy.getCarbs(), standardCarbs, 0.0);
  }
}