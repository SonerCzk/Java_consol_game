import java.util.Scanner;
public class Main{
  
    public static void main(String[] args) {
        Start start = new Start();
        Scanner input = new Scanner(System.in);
        start.begin();
        start.HeroSelection();
        //int option,option2,option3;
        System.out.println("1- Go to Village \n2- Go to WarField \n3-Exit (Everything will be gone)");
        int option = input.nextInt();
        while(Playerinfo.health >=0 && Playerinfo.money<5000){
            switch (option) {
            case 1:
                start.goVillage();
                
                break;
            case 2:
                WarField.fight();
                break;
            case 3:
                return;
            default:
            break;
        }}
        if(Playerinfo.health<=0){
            System.out.println("Game Over!! You Died!!");
        }
        else{
            System.out.println("You have 5000 Gold Congrats!! You Win!!");
        }
    }
}
