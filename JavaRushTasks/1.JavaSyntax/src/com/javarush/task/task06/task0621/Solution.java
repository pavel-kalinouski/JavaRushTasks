package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
    Родственные связи кошек
Новая задача: У каждой кошки есть имя, кот-папа и кошка-мама.
Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку (папин папа), бабушку (мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName =  reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName =  reader.readLine();
        Cat catFather = new Cat(catGrandFather, fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(catFather, sonName, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(catFather, daughterName, catMother);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);

    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(Cat father, String name, Cat mother ) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        Cat(Cat father, String name) {
            this.name = name;
            this.father = father;
        }

        Cat(String name, Cat mother ) {
            this.name = name;
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (father == null && mother == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (father == null && mother != null)
                return "The cat's name is " + name + ", mother is " + mother.name + ", no father";
            else if (mother == null && father != null)
                return "The cat's name is " + name + ", no mother" + ", father is " + father.name;
            else
                return "The cat's name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
