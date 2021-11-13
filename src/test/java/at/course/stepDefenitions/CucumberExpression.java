package at.course.stepDefenitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class CucumberExpression {
    @Given("we pass an integer {int} to the step method")
    public void we_pass_an_integer_to_the_step_method(Integer int1) {
        System.out.println("Chislo " + int1);
    }
    @Given("we pass a fractional number {double} to the step method")
    public void we_pass_a_fractional_number_to_the_step_method(Double double1) {
        System.out.println("Chislo " + double1);
    }
    @Given("we pass {string} to the step method")
    public void we_pass_to_the_step_method(String string) {
        System.out.println("Text " + string);
    }
    @Given("we pass the word {string} to the step method")
    public void we_pass_the_word_to_the_step_method(String word) {
        System.out.println("Slovo " + word);
    }

}
