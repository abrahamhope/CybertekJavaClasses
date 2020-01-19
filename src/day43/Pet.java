package day43;

public class Pet {
    private String breed;
    private String name;

    public Pet(){
        this.breed = "Unknown";
        this.name = "Unknown";
    }
    public Pet(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }
    public void speak() {

        //switch (type.toLowerCase()  ){
        switch (breed) {

            case "cat":
                System.out.println("MEOW");
                break;
            case "dog":
                System.out.println("WOOF");
                break;
            case "horse":
                System.out.println("NEIGH");
                break;
            case "cow":
                System.out.println("MOOO");
                break;
            default:
                System.out.println("UNKNOWN ANIMAL!");

        }

    }

    public String toString() {
        return "Pet{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
