import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogInheritance2Test {

    DogInheritance d1 = new DogInheritance();

    @Test
    public void dogAge() {


        Assert.assertEquals("2020 - 2009 = 11",11, d1.age(2009));


    }
}