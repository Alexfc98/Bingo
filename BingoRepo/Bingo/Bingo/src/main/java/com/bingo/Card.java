package com.bingo;

import java.util.*;

public class Card {
    private List<List<Integer>> CompleteList;

    public List<List<Integer>> getCompleteList() {
        return CompleteList;
    }

    public void setCompleteList(List<List<Integer>> list) {
        this.CompleteList = list;
    }

    public Card(List<List<Integer>> completeList) {
        CompleteList = completeList;
    }


    public static List<List<Integer>> generateCard(){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Random r = new Random();
            for(int i = 0; i<5;i++){
                List<Integer> subList = new ArrayList<>();
                list.add(subList);
            }
            while(list.get(0).size()<5 || list.get(1).size()<5 || list.get(2).size()<5 || list.get(3).size()<5 || list.get(4).size()<5){
            for(List<Integer> l : list){
                int x = r.nextInt(75)+1;
               if(x<16 && list.get(0).size()<5 && !list.get(0).contains(x)){
                   list.get(0).add(x);
               } else if(x>15 && x<31 && list.get(1).size()<5 && !list.get(1).contains(x)){
                   list.get(1).add(x);
               } else if (x>30 && x<46 && list.get(2).size()<5 && !list.get(2).contains(x)){
                   list.get(2).add(x);
               }else if(x>45 && x<61 && list.get(3).size()<5 && !list.get(3).contains(x)){
                   list.get(3).add(x);
               }else if(x>60 && x<76 && list.get(4).size()<5 && !list.get(4).contains(x)){
                   list.get(4).add(x);
               }
             }
            }
                   return list;
            }


    public void showCard(){
        for(List<Integer> l : getCompleteList()){
            for(int i:l){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        }
    }


