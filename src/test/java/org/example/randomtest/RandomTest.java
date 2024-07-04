package org.example.randomtest;

import org.example.switchT.SwitchTest;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RandomTest {
    @Test


    public static void main(String[] args) {

        for (int i = 1; i < 15; i++) {
            int randomNum = SwitchTest.getRandomNumber(1,12);
            assertThat(true, is(randomNum >= 1 && randomNum <= 12));
            System.out.println(randomNum);
        }
    }
}
