package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;


    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int CatCounter = 0;
        int AnotherCatCounter = 0;


        //compare the age
        if (this.age == anotherCat.age){
            CatCounter++;
            AnotherCatCounter++;
        }
        else if (this.age > anotherCat.age){
            CatCounter++;
        }
        else AnotherCatCounter++;

        //compare the weight
        if (this.weight == anotherCat.weight){
            CatCounter++;
            AnotherCatCounter++;
        }
        else if (this.weight > anotherCat.weight){
            CatCounter++;
        }
        else AnotherCatCounter++;

        //compare the strength
        if (this.strength == anotherCat.strength){
            CatCounter++;
            AnotherCatCounter++;
        }
        else if (this.strength > anotherCat.strength){
            CatCounter++;
        }
        else AnotherCatCounter++;


        //add one more unique criteria
        if (CatCounter == AnotherCatCounter){
            if (this.hashCode() > anotherCat.hashCode()){
                CatCounter++;    
            }
            else{
                AnotherCatCounter++;
            }
        }

        //return final choice
        if (CatCounter > AnotherCatCounter)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 10;
        barsik.weight = 10;
        barsik.strength = 10;
        Cat monika = new Cat();
        monika.age = 10;
        monika.weight = 10;
        monika.strength = 10;
        
        
        System.out.println(monika.fight(barsik)); 
        System.out.println(barsik.fight(monika));
        
    }
}
