package day41;

public class TV {
    String brand;
    boolean isOn;
    int currentChannel;
    /**
     * A method to return the value of current channel for the TV
     * @return the value of current channel for the TV
     */
    public int getCurrentChannel(){
        return currentChannel;
    }

    public void setCurrentChannel(int newChannel){
        currentChannel=newChannel;
    }

    public void turnOn(){
        if(isOn==false){
            System.out.println("Turning on TV");
            isOn=true;
        }else{
            System.out.println("Turn the TV off first");
        }
    }

    public void turnOff(){
        if(isOn==true){
            System.out.println("Turning off TV");
            isOn=false;
        }else{
            System.out.println("Turn the TV on first");
        }
    }

    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
