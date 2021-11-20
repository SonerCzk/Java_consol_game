import java.util.Scanner;
import Monsters.ManEater;
public class CorruptedLand {
    public static void fightManEater(){
        Scanner input = new Scanner(System.in);
        System.out.println("You Will fight with a Man Eater!!");
        System.out.println("Man Eater: Damage= 100 Health= 200 Award= 350 Gold");
        System.out.println("To Fight press 1 \nTo Run press 2");
        int option = input.nextInt();
        if(Playerinfo.money>=5000){
            return;
        }
        switch (option) {
            case 1:
                Playerinfo.health=Playerinfo.health-ManEater.damage;
                Playerinfo.money=Playerinfo.money+ManEater.award;
                System.out.println("Health: "+Playerinfo.health+" Gold: "+Playerinfo.money);
                if(Playerinfo.health<=0){
                    System.out.println("Game Over!! You Died!!");
                    return;
                }
                else if(Playerinfo.money>=5000){
                    return;
                }
                System.out.println("1- Go Village to cover your wounds \n2- Keep Fighting!!");
                int decide = input.nextInt();
                if(decide==1){
                    Start.goVillage();
                }
                else{
                    WarField.fight();
                }
                break;
            case 2:
                Start.goVillage();
                break;
            default:
                Start.goVillage();
                break;
        }
    }
}
