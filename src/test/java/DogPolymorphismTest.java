import org.junit.Assert;
import org.junit.Test;

public class DogPolymorphismTest {


    @Test
    public void movement() {

       // DogPolymorphism polyDog = new DogPolymorphism("Running movement");

       // Assert.assertEquals("A Dog does a Running movement","Running movement", polyDog.getMove());

    }

    DogPolymorphism polyDog = new DogPolymorphism();

    @Test
    public void testMovement() {


         Assert.assertEquals("A Dog does a Running movement","Running movement", polyDog.movement("Running movement"));

    }

    @Test
    public void foodEaten() {

        Assert.assertEquals("A Dog eats a bone","Bone",polyDog.movement("Bone"));

    }
}