package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
    Нам повторы не нужны
    1. Программа не должна выводить текст на экран.
    2. Программа не должна считывать значения с клавиатуры.
    3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4. Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5. Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Калиновский", "Павел");
        map.put("Шарейко","Павел");
        map.put("Киселей","Женя");
        map.put("Зверко","Саша");
        map.put("Серко","Женя");
        map.put("Жойдь","Павел");
        map.put("Судак","Саша");
        map.put("Ставская","Катя");
        map.put("Кищенко","Максим");
        map.put("Иович","Виктор");

        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> nameList = new ArrayList<>(map.values());
        //System.out.println(nameList);
        ArrayList<String> duplicatesList = new ArrayList<String>();
        int nameListSize = nameList.size();
        int counter = 0;
        for(int i = 0; i < nameListSize - 1; i++){
            String nameToCheck = nameList.get(i);
            if (duplicatesList.contains(nameToCheck)){
                break;
            }
            for (int j = i + 1; j < nameListSize; j++){
                String nameToCompareWith = nameList.get(j);
                if(nameToCompareWith.equals(nameToCheck)){
                    counter++;
                }
                if (counter > 0){
                    duplicatesList.add(nameToCheck);
                    break;
                }
            }
            counter = 0;

        }

        //System.out.println(duplicatesList);

        for(String item : duplicatesList){
            removeItemFromMapByValue(map, item);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
