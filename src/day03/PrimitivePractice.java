package day03;

public class PrimitivePractice {
    public static void main(String[] args) {
        int catCount = 20;
        byte letterCount = 26;
        System.out.println("The letter count is = " + letterCount);
        short sheepCount = 300;
        System.out.println("The sheep count is = "+sheepCount);
        long mileToSun= 100000000l;
        System.out.println("Mile to sun is = "+ mileToSun);

        //f must be added to the end
        float priceOfBanana = 1.99f;
        System.out.println("The price of banana is = " + priceOfBanana);
        float priceOfPotato = 2.99f;
        System.out.println("The price of potato is = "+ priceOfPotato);

        //------------ larger floating point numbers --------
        double priceOfIpad = 355.99d;
        System.out.println("The price of IPad is = "+ priceOfIpad);
        double priceOfIpadPro = 1024.80d;
        System.out.println("The price of IPad Pro is = "+priceOfIpadPro);

        // compiler automatically assume it's a double so it's not required to have d
        double priceOfMac = 2299.99;
        System.out.println("The price of Mac is = "+priceOfMac);

        // if you have a whole number by itself, compiler automatically assume it's an int
        // if you have a whole fractional by itself, compiler automatically assume it's a double




    }
}
