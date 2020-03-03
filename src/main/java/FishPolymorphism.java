public class FishPolymorphism extends AnimalPolymorphism implements AnimalInterface {

    public FishPolymorphism(){}

    @Override
    public String movement(String moveType) {

        return "Swimming movement";
    }

    @Override
    public String foodEaten(String food) {

        return "Worms";
    }
}
