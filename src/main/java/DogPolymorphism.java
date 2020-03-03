public class DogPolymorphism extends AnimalPolymorphism implements AnimalInterface{

    public DogPolymorphism(){}


    @Override
    public String movement(String moveType) {

        return "Running movement";
    }


    @Override
    public String foodEaten(String food) {

        return "Bone";
    }
}
