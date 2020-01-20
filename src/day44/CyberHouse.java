package day44;

public class CyberHouse {
    private int houseNum;
    private String design;
    static String neighborhoodame;

    public CyberHouse(int houseNum, String design){
        this.houseNum=houseNum;
        this.design=design;
    }

    public void showAllInfo(){
        System.out.println("House number: "+this.houseNum+", Design: "+
                this.design+
                ", Neighbordhood Name: "+neighborhoodame);
    }
    public static void showNeighborhooNamed(){
        System.out.println("neighborhoodame = " + neighborhoodame);
    }

}
