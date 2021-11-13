package at.course.stepDefenitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

import java.math.BigDecimal;

public class MyStepDefs {
    private static BigDecimal cash = new BigDecimal(1000);

    @Given("there are {int} rubles on the user's account")
    public void there_are_rubles_on_the_user_s_account(Integer int1) {
        Assert.assertEquals(0, cash.compareTo(new BigDecimal(int1)));

    }
    @When("the user withdraws {int} rubles")
    public void the_user_withdraws_rubles(Integer int1) {
        cash = cash.subtract(new BigDecimal(int1));
    }

}
