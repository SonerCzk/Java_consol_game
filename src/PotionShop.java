import java.util.Scanner;
public class PotionShop{
    Playerinfo playerinfo = new Playerinfo();
    Scanner input = new Scanner(System.in);
    public void buypotion(){
        System.out.println("Welcome Mighty Warrior! What can I do for you ?");
        System.out.println("1- Tears of Black Dragon     +100 attack power -1000 Gold");
        System.out.println("2- Blood of Paladin     +200 health -1000 Gold");
        System.out.println("3- Anger of Kratos      +100 attack power and +100 health -1500 Gold");
        int option = input.nextInt();
        switch (option) {
            case 1:
            if(playerinfo.money <1000 ){
                System.out.println("You dont have enough money to buy this potion");
                Start.goVillage();
            }else{
                playerinfo.attackPower = playerinfo.attackPower+100;
                playerinfo.money = playerinfo.money-1000;
                System.out.println("Attack Power: "+playerinfo.attackPower+"Health: "+playerinfo.basicHealth+"Money: "+playerinfo.money);
                Start.goVillage();
            }    
                break;
            case 2:
            if(Playerinfo.money <1000 ){
                System.out.println("You dont have enough money to buy this potion");
                Start.goVillage();
            }else{
                playerinfo.basicHealth=playerinfo.basicHealth+200;
                playerinfo.money = playerinfo.money-1000;
                System.out.println("Attack Power: "+Playerinfo.attackPower+"Health: "+Playerinfo.basicHealth+"Money: "+Playerinfo.money);
                Start.goVillage();
            }
                break;
            case 3:
            if(playerinfo.money <1500 ){
                System.out.println("You dont have enough money to buy this potion");
                Start.goVillage();
            }else{
                playerinfo.attackPower = playerinfo.attackPower+100;
                playerinfo.basicHealth = playerinfo.basicHealth+100;
                playerinfo.money = playerinfo.money-1500;
                System.out.println("Health +100 \nAttack Power +100");
                System.out.println("Attack Power: "+playerinfo.attackPower+" Health: "+playerinfo.basicHealth+" Money: "+playerinfo.money);
                Start.goVillage();
            }
                break;
            default:
                break;
        }
    }
}
