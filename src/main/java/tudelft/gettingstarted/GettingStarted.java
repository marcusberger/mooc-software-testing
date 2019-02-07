package tudelft.gettingstarted;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GettingStarted {
    public int addFive (int number) {
        return number + 5;
    }

    @Test
    public void addFiveToTwenty(){
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }


}
