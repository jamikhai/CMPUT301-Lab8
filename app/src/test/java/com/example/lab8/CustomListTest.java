package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city1 = new City("Grande Prairie", "AB");
        list.addCity(city1);
        assertEquals(list.hasCity(city1), true);
        assertEquals(list.hasCity(new City("Edmonton", "AB")), false);
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city1 = new City("Grande Prairie", "AB");
        list.addCity(city1);
        assertEquals(list.hasCity(city1), true);
        list.deleteCity(city1);
        assertEquals(list.hasCity(city1), false);
    }

    @Test
    public void countCities() {
        list = MockCityList();
        City city1 = new City("Vancouver", "BC");
        City city2 = new City("Burnaby", "BC");
        list.addCity(city1);
        assertEquals(list.countCities(), 1);
        list.addCity(city2);
        assertEquals(list.countCities(), 2);
    }

}
