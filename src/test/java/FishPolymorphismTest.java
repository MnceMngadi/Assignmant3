import org.junit.Assert;
import org.junit.Test;

public class FishPolymorphismTest {


    FishPolymorphism polyFish = new FishPolymorphism();

    @Test
    public void testMovement() {

        Assert.assertEquals("A fish does a Swimming movement","Swimming movement", polyFish.movement("Swimming movement"));

    }

    @Test
    public void foodEaten() {

        Assert.assertEquals("A fish eats worms","Worms", polyFish.foodEaten("Worms"));


    }
}