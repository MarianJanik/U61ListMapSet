package com.engeto.examples;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Challenge {

    private Map<LocalDate,String> nameDayInTheCalendar = new HashMap<>();

    public Map<LocalDate, String> getNameDayInTheCalendar() {
        return nameDayInTheCalendar;
    }

    public void addDateAndName(LocalDate date, String name){
        nameDayInTheCalendar.put(date,name);
    }

    public void renameNameInDate(LocalDate date, String newName) {
        nameDayInTheCalendar.replace(date,newName);
    }

    public void removeDateAndName(LocalDate date){
        nameDayInTheCalendar.remove(date);
    }

    public String getNameFromDate(LocalDate date){
        String text = nameDayInTheCalendar.getOrDefault(date,"Zadané datum nemá zavedený svátek v našem seznamu.");
        return text;
    }

}
