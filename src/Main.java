import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter character name: ");
    //     String name = scanner.nextLine();
    //     String gender = null;
    //     String job = null;
    //     int genderChoice;
        
    //     do {
    //         System.out.print("Choose gender (1. Male, 2. Female): ");
    //         genderChoice = scanner.nextInt();
        
    //         if (genderChoice == 1) {
    //             gender = "Male";
    //         } else if (genderChoice == 2) {
    //             gender = "Female";
    //         } else {
    //             System.out.println("Incorrect choice. Please enter a valid choice.");
    //         }
    //     } while (genderChoice != 1 && genderChoice != 2);
        
        
    //     System.out.println("Choose a job:");
    //     System.out.println("1. Novice");
    //     System.out.println("2. Swordman");
    //     System.out.println("3. Mage");
        
    //     int jobChoice ;
        
    //     do {
    //         System.out.print("Enter job choice (1, 2, or 3): ");
    //         jobChoice = scanner.nextInt();
    //         if (jobChoice == 1) {
    //             job = "Novice";
    //         } else if (jobChoice == 2) {
    //             job = "Swordman";
    //         } else if (jobChoice == 3) {
    //             job = "Mage";
    //         } else {
    //             System.out.println("Incorrect choice. Please enter a valid choice.");
    //         }
    //     } while (jobChoice < 1 || jobChoice > 3);
        
    //     // create character from name gender and job input
    //     Character player = new Character(name, gender , job);

    //     System.out.println("\nChoose a starting weapon:");
    //     System.out.println("1. " + Equipment.W001.getName());
    //     System.out.println("2. " + Equipment.W002.getName());
    //     System.out.println("3. " + Equipment.W003.getName());
    //     System.out.println("4. " + Equipment.W004.getName());
    //     System.out.println("5. Do not equip any weapon.");
       
    //     int weaponChoice;
    //     do {
    //         System.out.print("Enter weapon choice (1, 2, 3, 4, or 5): ");
    //         weaponChoice = scanner.nextInt();
        
    //         if (weaponChoice == 1) {
    //             player.equipWeapon(Equipment.W001);
    //         } else if (weaponChoice == 2) {
    //             player.equipWeapon(Equipment.W002);
    //         } else if (weaponChoice == 3) {
    //             player.equipWeapon(Equipment.W003);
    //         } else if (weaponChoice == 4) {
    //             player.equipWeapon(Equipment.W004);
    //         } else if (weaponChoice == 5) {
                
    //         } else {
    //             System.out.println("Incorrect choice. Please enter a valid choice.");
    //         }
    //     } while (weaponChoice < 1 || weaponChoice > 5);
        

    //     System.out.println("\nChoose a starting shield:");
    //     System.out.println("1. " + Equipment.S001.getName());
    //     System.out.println("2. " + Equipment.S002.getName());
    //     System.out.println("3. " + Equipment.S003.getName());
    //     System.out.println("4. Do not equip any shield"); 
       
    //     int shieldChoice;
    //     do {
    //         System.out.print("Enter shield choice (1, 2, 3, or 4): ");
    //         shieldChoice = scanner.nextInt();
        
    //         if (shieldChoice == 1) {
    //             player.equipWeapon(Equipment.S001);
    //         } else if (shieldChoice == 2) {
    //             player.equipWeapon(Equipment.S002);
    //         } else if (shieldChoice == 3) {
    //             player.equipWeapon(Equipment.S003);
    //         } else if (shieldChoice == 4) {
                
    //         } else {
    //             System.out.println("Incorrect choice. Please enter a valid choice.");
    //         }
    //     } while (shieldChoice < 1 || shieldChoice > 4);

    //     Equipment selectedAccessory1 = null;

    //     System.out.println("\nChoose accessories for slot 1:");
    //     System.out.println("1. " + Equipment.A001.getName());
    //     System.out.println("2. " + Equipment.A002.getName());
    //     System.out.println("3. " + Equipment.A003.getName());
    //     System.out.println("4. " + Equipment.A004.getName());
        
    //     int accessoryChoice1;
    //     do{
    //         System.out.print("Enter accessory choice for slot 1 (1, 2, 3, or 4): ");
    //         accessoryChoice1 = scanner.nextInt();
    //         if(accessoryChoice1 == 1){
    //             player.equipAccessory(Equipment.A001, null);
    //             selectedAccessory1 = Equipment.A001;
    //         }else if(accessoryChoice1 == 2){
    //             player.equipAccessory(Equipment.A002, null);
    //             selectedAccessory1 = Equipment.A002;
    //         }else if(accessoryChoice1 == 3){
    //             player.equipAccessory(Equipment.A003, null);
    //             selectedAccessory1 = Equipment.A003;
    //         }else if(accessoryChoice1 == 4){
    //             player.equipAccessory(Equipment.A004, null);
    //             selectedAccessory1 = Equipment.A004;
    //         } else {
    //             System.out.println("Incorrect choice. Do not equip any accessory.");
    //         }
    //     }while (accessoryChoice1 < 1 || accessoryChoice1 > 4);
        
    //     System.out.println("\nChoose accessories for slot 2:");
    //     System.out.println("1. " + Equipment.A001.getName());
    //     System.out.println("2. " + Equipment.A002.getName());
    //     System.out.println("3. " + Equipment.A003.getName());
    //     System.out.println("4. " + Equipment.A004.getName());
        
    //     int accessoryChoice2;
    //     do{
    //         System.out.print("Enter accessory choice for slot 2 (1, 2, 3, or 4): ");
    //         accessoryChoice2 = scanner.nextInt();
    //         if(accessoryChoice2 == 1){
    //             player.equipAccessory(selectedAccessory1, Equipment.A001);
    //         }else if(accessoryChoice2 == 2){
    //             player.equipAccessory(selectedAccessory1, Equipment.A002);
    //         }else if(accessoryChoice2 == 3){
    //             player.equipAccessory(selectedAccessory1, Equipment.A003);
    //         }else if(accessoryChoice2 == 4){
    //             player.equipAccessory(selectedAccessory1, Equipment.A004);
    //         } else {
    //             System.out.println("Incorrect choice..");
    //         }
    //     }while (accessoryChoice2 < 1 || accessoryChoice2 > 4);

    //     System.out.println(" ");
    //     player.displayInfo();
    //     scanner.close();

    Character player1 = new Character("Somchai", "Female", "Novice");
    Character player2 = new Character("Sommark", "Male", "Mage");
    Action.Attack attack = new Action.Attack(player1, player2);
    player1.displayInfo();
    player2.displayInfo();

    attack.executeAttack();
    player1.displayInfo();
    player2.displayInfo();

    }


}