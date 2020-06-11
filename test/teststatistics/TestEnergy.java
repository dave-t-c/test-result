package teststatistics;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * Class for creating / testing the Energy class.
 * @author David Cook
 * @version 0.1
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
  }
}
