package test.java.teststatistics;

import static org.junit.Assert.assertEquals;

import main.java.statistics.ProteinNutrition;
import org.junit.Test;

/**
 * Class for testing the ProteinNutrition class.
 * @author dave-t-c
 */
public class TestProteinNutrition {
  
  @Test
  public void testCreateNewProtein() {
    ProteinNutrition testProtein = new ProteinNutrition();
    assertEquals("Could not get new ProteinNutrition", 
        0.0, testProtein.getTotal(), 0.0);
  }
}
