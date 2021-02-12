package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int check(char system, char user){
        int status = 4;
        if(user == system){
            status = 0;
        }
        if(user=='r' && system=='s'){
            status = 1;
        }
        else if(user=='s' && system=='r'){
            status = -1;
        }

        if(user=='s' && system=='p'){
            status = 1;
        }
        else if(user=='p' && system=='s'){
            status =-1;
        }

        if(user=='p' && system=='r'){
            status = 1;
        }
        else if(user=='r' && system=='p'){
            status = -1;
        }
        return status;
    }
    public static void main(String[] args) {
        char system = 0, user;
        Random in = new Random();
        int rand = in.nextInt(100);
        System.out.print("Enter user choice(r for rock/p for paper/s for scissor):");
        Scanner sc = new Scanner(System.in);
        user = sc.next().charAt(0);
        if (rand > 0 && rand < 35){
            system = 'r';
        }
        if (rand > 35 && rand < 65){
            system = 'r';
        }
        if (rand > 65 && rand < 100) {
            system = 'r';
        }
        int a = check(system,user);
        if (a == 0){
            System.out.println("Match draw!");
        }
        else if (a == 1){
            System.out.println("You won the match");
        }
        else if (a == -1){
            System.out.println("You loose the match");
        }
    }
}
