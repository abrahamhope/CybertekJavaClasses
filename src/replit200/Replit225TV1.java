package replit200;

public class Replit225TV1 {
    int channel=1;
    int volumeLevel=1;
    boolean on = false;
    String brand ="undefined";

//    public TV(){
//        System.out.println("Creating TV object using no Args- constructor");
//    }
//    public TV(String brand){
//        this.brand=brand;
//        System.out.println("Creating TV object using 1 arg - constructor");
//    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel>0 && channel<=120) {
            this.channel = channel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        if(volumeLevel>0 && volumeLevel<8) {
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");

        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void channelUp(){
        channel++;
    }
    public void channelDown(){
        channel--;
    }
    public void volumeUp(){
        volumeLevel++;
    }
    public void volumeDown(){
        volumeLevel--;
    }
    public void isOn(boolean on){
        if(on==true){
            System.out.println("TV is already ON");
        }else{
            System.out.println("TV is already OFF");
        }
    }

    public void turnOn(boolean on){
        if(on==true){
            System.out.println("TV is already ON");
        }else{
            on=true;
        }
    }
    public void turnOff(boolean on){
        if(on==false){
            System.out.println("TV is already OFF");
        }else{
            on=false;
        }
    }


}
