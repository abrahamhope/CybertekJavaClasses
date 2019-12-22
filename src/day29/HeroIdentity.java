package day29;

import javax.swing.*;

public class HeroIdentity {
    public static void main(String[] args) {
        String hero1="Superman-Clark J Kent";
        String[] heroIdentity= hero1.split("-");
        String heroName=heroIdentity[1];
        String star="";
        for (int i = 0; i < heroIdentity[1].length(); i++) {
            star+="*";
        }
        System.out.print(heroIdentity[0]+star);
    }
}
