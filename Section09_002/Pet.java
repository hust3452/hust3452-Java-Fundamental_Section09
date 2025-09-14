package Section09_002;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Pet {
    private String petID;
    private String petName;
    private int petAge;

    public String regexId = "^[CD](?!([0-9])\\\\1)([0-9])(?!\\\\2)([0-9])(?!\\\\2|\\\\3)([0-9])$";
    public String regexName = "^.{10,50}$";

    //contruction khong tham so
    public Pet() {
    }

    //contruction co tham so
    public Pet(String petID, String petName, int petAge) {
            this.petID = petID;
            this.petName = petName;
            this.petAge = petAge;
    }

    //getter va setter
    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
            this.petID = petID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
            this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
            this.petAge = petAge;
    }

    //inputData va displayData
    public void inputData(Scanner scanner) {
        do {
            System.out.println("Nhap vao ID");
            String id = scanner.next();
            if (Pattern.matches(regexId,id)) {
                this.petID = id;
                break;
            } else {
                System.err.println("ID ban nhap vao khong hop le");
            }
        } while (true);
        do {
            System.out.println("Nhap vao Name");
            String name = scanner.next();
            if (Pattern.matches(regexName,name)) {
                this.petName = name;
                break;
            } else {
                System.err.println("Ten ban nhap vao khong hop le");
            }
        } while (true);
        do {
            System.out.println("Nhap vao tuoi");
            int age = Integer.parseInt(scanner.next());
            if (age < 0) {
                System.err.println("Tuoi ban nhap vao khong hop le");
            } else {
                this.petAge = age;
                break;
            }
        } while (true);
    }

    public void displayData() {
        System.out.println("petID: " + this.petID);
        System.out.println("petName: " + this.petName);
        System.out.println("petAge: " + this.petAge);
    }

    //speak
    public abstract String speak();
}
