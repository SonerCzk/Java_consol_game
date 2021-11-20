import java.util.Scanner;
public class WarField{
    static void fight(){
        Scanner input = new Scanner(System.in);
        if(Playerinfo.health<=0){
            return;
        }
        /*else if(Playerinfo.money>=5000){
            return;
        }*/
        System.out.println("1-Fight on Corrupted Land!! \n2-Fight on Dark Wood!! \n3-Fight on Internal Death Maze!!");
        int option = input.nextInt();
        switch (option) {
            case 1:
                CorruptedLand.fightManEater();
                break;
            case 2:
                DarkWood.fightDarkCaster();
                break;
            case 3:
                InternalDeathMaze.fightReaper();
                break;
            default:
                break;
        }
    }

}
