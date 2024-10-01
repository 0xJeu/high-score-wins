package com.plurasight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Score inputs will be submitted in the following format: Home:Visitor|21:9");
        System.out.print("Please enter a game score: ");
        String userInput = keyboard.nextLine().trim();

        String[] inputParts = userInput.split(Pattern.quote("|"));

        String [] teams =  inputParts[0].split(Pattern.quote(":"));

        String [] scores = inputParts[1].split(Pattern.quote(":"));

        String homeTeam = teams[0];
        String awayTeam = teams[1];

        int homeScore = Integer.parseInt(scores[0]);
        int awayScore = Integer.parseInt(scores[1]);

        String winningTeam = "";
        

        if (homeScore > awayScore){
            winningTeam = homeTeam;
        } else if (awayScore > homeScore) {
            winningTeam = awayTeam;
        }else {
            System.out.println("GAME IS TIED.");
        }

        //        System.out.println(scores[0] + " " + scores[1]);
        //        System.out.println(teams[0] + " " + teams[1]);

        System.out.printf("Winner: %s team!", winningTeam);


    }
}
