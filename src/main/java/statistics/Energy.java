package main.java.statistics;

import java.util.Objects;

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
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Energy other = (Energy) obj;
    return Double.doubleToLongBits(calories) == Double.doubleToLongBits(other.calories)
        && Double.doubleToLongBits(carbs) == Double.doubleToLongBits(other.carbs);
  }
  
  /**
   * Generates a hash code for the Energy Object.
   * If two objects have the same content then this should return the same for both.
   * @return int - the hash code value for the Energy Object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(calories, carbs);
  }
  
  /**
   * Generates a formatted String for the Energy Object.
   * This is in the format "Carbs: x, Calories: y"
   */
  @Override
  public String toString() {
    return "Carbs: 25.0, Calories: 300.5";
  }
  

}
