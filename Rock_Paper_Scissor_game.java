// Rock paper Scissor Game
// 0 For Rock , 1 For Paper , 2 For Scissor

package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Write Your Turn");
        int my = sc.nextInt();
        System.out.println("Computer Turn");
        int upperbond = 3;
        int comp = rn.nextInt(upperbond);
        System.out.println(comp);
        if (my == 0 && comp == 1){
            System.out.println("You Are Winner");
        }
        else if  (my == 1 && comp == 0){
            System.out.println("Computer  is Winner");
        }
        else if  (my == 0 && comp == 2){
            System.out.println("You  Are Winner");
        }
        else  if  (my == 2 && comp == 0){
            System.out.println("Computer  is Winner");
        }
        else  if  (my == 1 && comp == 2){
            System.out.println("Computer  is Winner");
        }
        else  if  (my == 2 && comp == 1) {
            System.out.println(" You Are Winner");
        }
        else  if  (my == 0 && comp == 0){
            System.out.println("Match Tie");
        }
        else  if  (my == 1 && comp == 1){
            System.out.println("Match Tie");
        }
        else  if  (my == 2 && comp == 2){
            System.out.println("Computer  is Win");
        }
        else{
            System.out.println("Invalid Values");
        }
    } // Rock_Paper_Scissor_Game Designed By Mabtoor_Mabx
}
