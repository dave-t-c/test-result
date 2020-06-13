package main.java.statistics;

/**
 * Class for storing the Energy section of a test result.
 * This class will store the carbohydrate and calorie values 
 * for each test result.
 * @author David Cooks
 */

public class Energy {

  private double carbs;
  private double calories;

  /**
   * Constructor for the energy class.
   * This takes the required carbohydrate and calorie values.
   * @param carbs - Carbohydrate value for the new entry
   * @param calories - Calorie value for the new entry
   */
  public Energy(double carbs, double calories) {
    this.carbs = carbs;
    this.calories = calories;
  }

  /**
   * Method for returning the carbohydrate value of the Energy Object.
   * @return carbs - carbohydrate value 
   */
  public double getCarbs() {
    return this.carbs;
  }

  /**
   * Method for returning the calorie value of the Energy Object.
   * @return calories - the calorie value of the Object.
   */
  public double getCalories() {
    return this.calories;
  }
  
  /**
   * Checks the equality of an Object with the Energy.
   * Should return true if the contents of the object are equal.
   * @return boolean - If the objects are equal
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Energy)) {
      return false;
    }
    Energy other = (Energy) obj;
    return Double.doubleToLongBits(calories) == Double.doubleToLongBits(other.calories)
        && Double.doubleToLongBits(carbs) == Double.doubleToLongBits(other.carbs);
  }
  
  /**
   * Generates a hash code for the Energy Object.
   * If two values have the same content then this should return the same for both.
   */
  @Override
  public int hashCode() {
    return 5;
  }
  

}
