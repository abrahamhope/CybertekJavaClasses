package day49;

public interface Edible {
    // IN INTERFACE fields are automaticaly public static final if not defined so.
    // public static final filed naming convention is ALL CAPS!!!
    // You can have as many constants as you want
public static final boolean IS_HUMAN_FOOD= true;

// if a method with no-body is not defined abstract
    public void eat();
    public void drink();



}
