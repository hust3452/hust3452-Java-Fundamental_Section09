package Section09_002;

public class Cat extends Pet {
    //contruction
    public Cat(String petId, String petName, int petAge) {
        super(petId, petName, petAge);
    }

    public Cat() {

    }

    @Override
    public String speak() {
        return "Meo Meo";
    }
}
