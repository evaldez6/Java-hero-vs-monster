/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fighting;

import java.util.Random;
/*Know what java.util.Random is.*/
import java.util.Scanner;

/**
 * @author Euddy Valdez
 * 
 * Done from 
 * Java for total beginners - Easy-to-follow Java programming
 * By 
 * Duckademy IT courses
 * at
 * https://www.udemy.com/easy-to-follow-java-programming/
 */
public class Fighting_with_death_run_monstername {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        
        String monsterName;
        int monnum = generator.nextInt(5);
        switch (monnum) {
            case 0: monsterName = "Black Demon"; break;
            case 1: monsterName = "Dark Gorilla"; break;
            case 2: monsterName = "The Wall"; break;
            case 3: monsterName = "Your Dark Soul"; break;
            case 4: monsterName = "The Final"; break;
            default: monsterName = "Undentified Object";
        }
                
        System.out.print("Attack Points of " + monsterName + ": ");
        int monsterAttack = generator.nextInt(7)+14;
        System.out.println(monsterAttack);
        System.out.print("Defense Points of " + monsterName + ": ");
        int monsterDefense = generator.nextInt(9)+12;
        System.out.println(monsterDefense);
        System.out. print("Damage of " + monsterName + ": ");
        int monsterDamage = generator.nextInt(4)+7;
        System.out. println(monsterDamage);
        System.out.print("Life Points of " + monsterName + ": ");
        int monsterLife = generator.nextInt(21)+80;
        System.out.println(monsterLife);
        sc.nextLine();
        
        System.out.print("Your Attack Points: ");
        int yourAttack = generator.nextInt(4)+12;
        System.out.println(yourAttack);
        System.out.print("Your Defense Points: ");
        int yourDefense = generator.nextInt(6)+10;
        System.out.println(yourDefense);
        System.out. print("Your Damage: ");
        int yourDamage = generator.nextInt(3)+6;
        System.out.println(yourDamage);
        System.out.print("Your Life Points: ");
        int yourLife = generator.nextInt(11)+60;
        System.out.println(yourLife);
        sc.nextLine();
        
        boolean runaway = false;
        
        do {
            boolean attacker = generator.nextBoolean();
            if (attacker) {
                System.out.println("You attack");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = yourAttack + dice;
                System.out.println("Rolled values: " +dice );
                System.out.println("Your attack value: " +attackValue );
                if (attackValue > monsterDefense) {
                    System.out.println("Your attack was succesful.");
                    monsterLife = monsterLife - yourDamage;
                    System.out.println(monsterName + "'s remaining Life Points: "+monsterLife);
                } else {
                    System.out.println("Your attack was not succesful");
                } } else {
                System.out.println(monsterName + " attacks.");
                int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
                int attackValue = monsterAttack + dice;
                System.out.println("Rolled values: " +dice );
                System.out.println(monsterName + "'s attack value: " +attackValue );
                if (attackValue > yourDefense) {
                    System.out.println(monsterName + "'s attack was succesful.");
                    yourLife = yourLife - monsterDamage;
                    System.out.println("Your remaining Life Points: " +yourLife);
                } else {
                    System.out.println(monsterName + "'s attack was not succesful");
                } }
            
            if (monsterLife <= 0){
            System.out.println("\nCongratulations! You win!");
            break;
            } 
            if (yourLife <= 0 ) {
            System.out.println("\nGame Over...");
            break;
            }
            
            System.out.println("Press 'ENTER' to continue or type 'run' to run away.");
            String command = sc.nextLine();
            /*Learn how string works*/
            switch (command) {
                case "run":
                    runaway = true;
                    System.out.println("\nEscaped!");
                    break;
                default:
            }
        } while (yourLife > 0 && monsterLife > 0 && !runaway);
        
    }
}
    

