import java.util.Scanner;
public class WeaponShop {
    Playerinfo playerinfo = new Playerinfo();
    Scanner input = new Scanner(System.in);

    public void buyweapon(){
        System.out.println("Welcome Mighty Warrior! What can I do for you ?");
        System.out.println("1- Gandalf's Wand     +50 attack power(+150 for Wizard) -1000 Gold");
        System.out.println("2- Legola's Bow     +150(+100 for Archer) -1000 Gold -1500 Gold");
        System.out.println("3- Kratos's Blades of Chaos      +200 attack power(+100 for Dragon Slayer) -2000 Gold");
        int option = input.nextInt();
        switch (option) {
            case 1:
            if(playerinfo.money <1000 ){
                System.out.println("You dont have enough money to buy this Weapon");
            }else{
                if(playerinfo.id==1){
                    playerinfo.attackPower = playerinfo.attackPower+200;
                }
                else{playerinfo.attackPower = playerinfo.attackPower+50;}
                playerinfo.money = playerinfo.money-1000;
                System.out.println("Attack Power: "+playerinfo.attackPower+"Health: "+playerinfo.health+"Money: "+playerinfo.money);
            }    
                break;
            case 2:
            if(playerinfo.money <1000 ){
                System.out.println("You dont have enough money to buy this Weapon");
            }else{
                if(playerinfo.id==3){
                    playerinfo.attackPower = playerinfo.attackPower+250;
                }
                else{playerinfo.attackPower = playerinfo.attackPower+150;}
                playerinfo.money = playerinfo.money-1500;
                System.out.println("Attack Power: "+playerinfo.attackPower+"Health: "+playerinfo.health+"Money: "+playerinfo.money);
            }
                break;
            case 3:
            if(playerinfo.money <1500 ){
                System.out.println("You dont have enough money to buy this Weapon");
            }else{
                if(playerinfo.id==2){
                    playerinfo.attackPower = playerinfo.attackPower+300;
                }
                else{playerinfo.attackPower = playerinfo.attackPower+200;}
                playerinfo.money = playerinfo.money-1500;
                System.out.println("Health +100 \nAttack Power +100");
                System.out.println("Attack Power: "+playerinfo.attackPower+" Health: "+playerinfo.health+" Money: "+playerinfo.money);
            }
                break;
            default:
                break;
        }
}
}