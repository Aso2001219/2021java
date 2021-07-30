import java.util.*;

public class Main37 {
    public static void main(String[] args){
        System.out.println("         戦艦ゲーム          ");
        System.out.println("****************************");
        Random r=new Random();
        int senx1=r.nextInt(5);
        int seny1=r.nextInt(5);
        int senx2=r.nextInt(5);
        int seny2=r.nextInt(5);
        int senx3=r.nextInt(5);
        int seny3=r.nextInt(5);
        int[] sen1 = {senx1,seny1};
        int[] sen2 = {senx2,seny2};
        int[] sen3 = {senx3,seny3};
        int sen1hp = 3;
        int sen2hp = 3;
        int sen3hp = 3;
        for(int k=1;sen1hp!=0||sen2hp!=0||sen3hp!=0;k++){
            System.out.println("----------[ターン"+k+"]----------");
            System.out.println("爆弾の座標を入力してください");
            Scanner num= new Scanner(System.in);
            int innumX = num.nextInt();
            int innumY = num.nextInt();
            int[] attack = {innumX,innumY};
            //戦艦1に攻撃
            if(sen1 == attack){
                System.out.println("砲弾が当たった！");
                sen1hp = sen1hp - 1;
            }else{
                System.out.println("はずれ!");
            }
            //戦艦2に攻撃
            if(sen2 == attack){
                System.out.println("砲弾が当たった！");
                sen2hp = sen2hp - 1;
            }else{
                System.out.println("はずれ!");
            }
            //戦艦3に攻撃
            if(sen3 == attack){
                System.out.println("砲弾が当たった！");
                sen3hp = sen3hp - 1;
            }else{
                System.out.println("はずれ!");
            }
        }
        
    }
}
