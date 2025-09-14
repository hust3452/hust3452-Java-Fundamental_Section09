package Section09_002;

public class Dog extends Pet{
    //contruction
    public Dog(String petId ,String petName, int petAge) {
        super(petId, petName, petAge);
    }

    public Dog() {

    }

    //ghi de sound
    @Override
    public String speak() {
        return "Gau Gau";
    }
}
