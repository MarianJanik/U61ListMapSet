package com.engeto.examples;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> listOfFriendNames = new LinkedList<>();
        Map<Integer,String> mapOfFriendNames = new HashMap<>();
        Set<String> setOfGroupMembers = new TreeSet<>();

        listOfFriendNames.add("Vít");
        listOfFriendNames.add("Jana");
        listOfFriendNames.add("Karel");
        listOfFriendNames.add("Edita");
        listOfFriendNames.add("Jana");
        exerciseWithAList(listOfFriendNames);

        mapOfFriendNames.put(1,"Vít");
        mapOfFriendNames.put(2,"Jana");
        mapOfFriendNames.put(3,"Karel");
        mapOfFriendNames.put(4,"Klára");
        mapOfFriendNames.put(5,"Jana");
        mapOfFriendNames.put(1989,"Václav");
        mapOfFriendNames.put(2,"Ivan");
        exerciseWithAMap(mapOfFriendNames);

        setOfGroupMembers.add("Vít");
        setOfGroupMembers.add("Jana");
        setOfGroupMembers.add("Karel");
        setOfGroupMembers.add("Klára");
        setOfGroupMembers.add("Jana");
        exerciseWithASet(setOfGroupMembers);

        System.out.println("\n------------------------------------------------------Výzva: svátky v kalendáři:");

        Challenge nameDayInTheCalendar = new Challenge(); // 1.

        nameDayInTheCalendar.addDateAndName(LocalDate.parse("2021-08-11"),"Zuzana"); //2.
        nameDayInTheCalendar.addDateAndName(LocalDate.parse("2021-08-12"),"Klára");
        nameDayInTheCalendar.addDateAndName(LocalDate.parse("2021-08-13"),"Vít");
        nameDayInTheCalendar.addDateAndName(LocalDate.parse("2021-08-14"),"Alan");
        nameDayInTheCalendar.addDateAndName(LocalDate.parse("2021-08-15"),"Hana");
        exerciseChalange(nameDayInTheCalendar);

    }

    private static void exerciseChalange(Challenge nameDayInTheCalendar) {
        System.out.println(nameDayInTheCalendar.getNameDayInTheCalendar() + "---výpis všech zavedených svátků\n");

        nameDayInTheCalendar.renameNameInDate(LocalDate.parse("2021-08-13"),"Alena");
        System.out.println(nameDayInTheCalendar.getNameDayInTheCalendar() + "---oprava jména (Vít->Alena)\n");

        System.out.println(nameDayInTheCalendar.getNameFromDate(LocalDate.now().plusDays(1)));
    }

    private static void exerciseWithASet(Set<String>setOfGroupMembers) {
        System.out.println("\n------------------------------------------------------Cvičení s množinou (TreeSet):");
        System.out.println("Prvky mapy: " + setOfGroupMembers);
        System.out.println("Počet prvků: " + setOfGroupMembers.size());
        System.out.println(setOfGroupMembers.contains("Jana"));
        setOfGroupMembers.remove("Jana");
        System.out.println(setOfGroupMembers.contains("Jana"));
        System.out.println("Počet prvků: " + setOfGroupMembers.size());

        System.out.println("Prvky mapy: " + setOfGroupMembers);
    }

    private static void exerciseWithAMap(Map<Integer, String>mapOfFriendNames){
        System.out.println("\n------------------------------------------------------Cvičení s mapou (HashMap):");
        System.out.println("Prvky mapy: " + mapOfFriendNames);
        System.out.println("Počet prvků: " + mapOfFriendNames.size());
        printMapElement(4,mapOfFriendNames);
        mapOfFriendNames.remove(2);
        printMapElement(4,mapOfFriendNames);
        mapOfFriendNames.remove("Karel");
        System.out.println(mapOfFriendNames.containsKey(3));
        System.out.println(mapOfFriendNames.containsKey(5));
        printMapElement(3,mapOfFriendNames);
        printMapElement(5,mapOfFriendNames);
        System.out.println(mapOfFriendNames.containsValue("Ivan"));
        System.out.println(mapOfFriendNames.containsValue("Václav"));
    }

    private static void printMapElement(int number, Map<Integer, String>mapOfFriendNames){
        System.out.println("Prvek číslo " + number + ": " + mapOfFriendNames.get(number));
    }

    private static void exerciseWithAList(List<String>listOfFriendNames){
        System.out.println("\n------------------------------------------------------Cvičení se seznamem (LinkedList):");
        System.out.println("Prvky seznamu: " + listOfFriendNames);
        System.out.println("Počet prvků: " + listOfFriendNames.size());
        int number = 2;
        System.out.println("Prvek číslo " + number + ": " + listOfFriendNames.get(number));
        listOfFriendNames.remove(1);
        listOfFriendNames.remove("Jana");
        System.out.println("Prvky seznamu: " + listOfFriendNames);
        System.out.println(listOfFriendNames.contains("Ivan"));
        System.out.println(listOfFriendNames.contains("Vít"));
        System.out.println("Počet prvků: " + listOfFriendNames.size());
        System.out.println("Prvek číslo " + number + ": " + listOfFriendNames.get(number));
    }
}
