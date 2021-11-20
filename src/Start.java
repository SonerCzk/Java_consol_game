import java.util.Scanner;
import Hero.*;
public class Start {
    static Scanner input = new Scanner(System.in);
    public void begin() {
        
        System.out.println("Welcome Player! Please Enter Your Name!");
        String playername = input.nextLine();
        System.out.println("And like that your adventure just started! "+playername); 
    }
    Wizard wizard = new Wizard();
    Archer archer= new Archer();
    DragonSlayer dragonSlayer = new DragonSlayer();
    static PotionShop potionShop = new PotionShop();
    static WeaponShop weaponShop = new WeaponShop();
    static CorruptedLand corruptedLand = new CorruptedLand();
    static WarField warField = new WarField();
    public void HeroSelection(){
            System.out.println("Please Select Your Hero");
            System.out.println("1- Wizard, Power of Light. Attack Power: "+wizard.attackPower+" Health: "+wizard.health+" Money: "+wizard.money);
            System.out.println("2- Dragon Slayer, Ruthless Warrior. Attack Power: "+dragonSlayer.attackPower+" Health: "+dragonSlayer.health+" Money: "+dragonSlayer.money);
            System.out.println("3- Archer, Sharp Eye. Attack Power: "+archer.attackPower+" Health: "+archer.health+" Money: "+archer.money);
        int selection = input.nextInt();
            Playerinfo playerinfo = new Playerinfo();
        switch (selection) {
            case 1:
            System.out.println("Hero Wizard Selected, Attack Power: "+wizard.attackPower+" Health: "+wizard.health+" Money: "+wizard.money);
            Playerinfo.attackPower=wizard.attackPower;
            Playerinfo.health=wizard.health;
            playerinfo.basicHealth=wizard.health;
            playerinfo.money=wizard.money;
            playerinfo.id=1;
                break;
            
            case 2:
            System.out.println("Hero Dragon Slayer Selected, Attack Power: "+dragonSlayer.attackPower+" Health: "+dragonSlayer.health+" Money: "+dragonSlayer.money);
            playerinfo.attackPower=dragonSlayer.attackPower;
            playerinfo.health=dragonSlayer.health;
            playerinfo.basicHealth=dragonSlayer.health;
            playerinfo.money=dragonSlayer.money;
            playerinfo.id=2;
            break;

            case 3:
            System.out.println("Hero Archer Selected, Attack Power: "+archer.attackPower+" Health: "+archer.health+" Money: "+archer.money);
            playerinfo.attackPower=archer.attackPower;
            playerinfo.health=archer.health;
            playerinfo.basicHealth=archer.health;
            playerinfo.money=archer.money;
            playerinfo.id=3;
            break;
            default:
            System.out.println("Please enter 1,2 or 3");
                break;
        }   
    }

    public static void goVillage(){
        if(Playerinfo.health<=0){
            return;
        }
        else if(Playerinfo.money>=5000){
            return;
        }
            System.out.println("Welcome to the Village. Your Health is fulled!! \n");
            Playerinfo.health=Playerinfo.basicHealth;
            /*if(Playerinfo.money>=5000){
                return;
            }*/
            System.out.println("1- Go to Potion Shop\n2- Go to Weapon Shop \n3-Go to WarField");
            int optionv = input.nextInt();
            switch (optionv) {
                case 1:
                    potionShop.buypotion();
                    break;
                case 2:
                    weaponShop.buyweapon();
                break;
                case 3:
                    warField.fight();
                break;
                default:
                System.out.println("Plese enter 1,2 or 3");
                    break;
            }

    }
}
