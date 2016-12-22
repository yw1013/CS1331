import java.util.Scanner;

/**
 * This class represents the information needed for the program.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Battlefront {
    /**
    * @param args argument for main method.
    */
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("+-------------------------------------------+");
        System.out.println("| Welcome to the Battlefront1331 Simulator! |");
        System.out.println("+-------------------------------------------+");
        System.out.println("How many Rebel Soldiers would you like to "
                            + "include?");
        int numRebel = keyboard.nextInt();
        System.out.println("How many Jedi would you like to include?");
        int numJedi = keyboard.nextInt();
        System.out.println("How many Stormtroopers would you like to include?");
        int numStorm = keyboard.nextInt();
        System.out.println("How many Sith would you like to include?");
        int numSith = keyboard.nextInt();
        System.out.println("Press enter to begin the simulation");
        keyboard.nextLine();
        keyboard.nextLine();

        Batman bat = new Batman(100, 40, 45, "BA-10");
        Joker joke = new Joker(100, 40, 40, "JK-13");

        Simulation sim = new Simulation(numRebel, numJedi, numStorm,
                                        numSith, bat, joke);

        boolean tf = sim.simulateSkirmish(false);

        while (tf) {
            System.out.println("Press enter to continue the simulation");
            keyboard.nextLine();
            tf = sim.simulateSkirmish(false);
        }

        System.out.println("Simulation Complete!");

        if (sim.getNumEmpireRemaining() > sim.getNumRebellionRemaining()) {
            System.out.println("The Empire Won!");
        }
        if (sim.getNumEmpireRemaining() < sim.getNumRebellionRemaining()) {
            System.out.println("The Rebellion Won!");
        }
        if (sim.getNumEmpireRemaining() == sim.getNumRebellionRemaining()) {
            System.out.println("Tie!");
        }

        System.out.println(sim.getNumRebelsRemaining() + " of " + numRebel
                           + " Rebel Soldiers remain!");
        System.out.println(sim.getNumJediRemaining() + " of " + numJedi
                           + " Jedi remain!");
        System.out.println(sim.getNumTroopersRemaining() + " of " + numStorm
                           + " Stormtroopers remain!");
        System.out.println(sim.getNumSithRemaining() + " of " + numSith
                           + " Sith remain!");

    }

}
