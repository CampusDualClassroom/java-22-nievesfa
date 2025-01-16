package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> list = new ArrayList<>();

        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");

        return list;

    }

    public static void printElementsAndIndex(List<String> customList) {
        int index = 0;
        for (String item : customList) {
            System.out.println("Índice: " + index + ", Valor: " + item);
            index++;

        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);

    }


    public static void main(String[] args) {
        List<String> customList = createArrayList();
        System.out.println("Lista:");
        printElementsAndIndex(customList);

        boolean added = addElementToList(customList, "AAAAA");
        if (added){
            System.out.println("\n Elemento añadido.");
        }else{
            System.out.println("\n Error.");
        }
        printElementsAndIndex(customList);

    }


}
