package day43;

public class Coffee {
  private String type;
    private int level;
    private double price;

// getters and setters here omitted
	// no arg constructor
	public Coffee(){
		//print("no arg constructor")
	}
	// 2 args constructor to set type and caffine level
	public Coffee(String type, int caffeineLevel){
		this.type = type;
		this.level = caffeineLevel ;
	}
	// WAKE UP TASK TO CREATE 3 ARGS CONSTRUCTOR
	// DO NOT LET THE PRICE GO BELOW 0
	// IF IT's less than 0 make it 1$

    public Coffee(String type, int caffeineLevel,double price ){
        this.type=type;
        this.level=caffeineLevel;
        if(price>0){
            this.price=price;
        }else{
            this.price=1;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", level=" + level +
                ", price=" + price +
                '}';
    }
}
