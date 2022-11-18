package com.bingo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Utilities {

    static List<Integer> generatedNumbers = new ArrayList<>();
    static List<Integer> savedCard = new ArrayList<>();

    public static  int generateRandom(){
        Random r = new Random();
        int x = r.nextInt(75)+1;
        System.out.println();
        return x;
    }

    public static void  saveGeneratedNumbers(int x){
        generatedNumbers.add(x);

    }

    public static void saveGeneratedCard(Card card){
        for(List<Integer> list : card.getCompleteList()){
            for(int i= 0; i<list.size();i++){
                int x = list.get(i);
                savedCard.add(x);
            }
        }
    }

    public static boolean compareNumbers(List<Integer> completeList, List<Integer> generatedList){

        completeList=savedCard;
        int index=0;

        for(int list : completeList){
                int x = list;
                if(generatedList.contains(x)){
                    index++;

            }
        }
        if(index == 25) return true;
        else return false;
    }

}
