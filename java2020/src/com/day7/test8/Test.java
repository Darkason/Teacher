package com.day7.test8;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Test {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();

//        Animal animal = new Dog();
//        animal.eat();

//        Animal animal2 = new Cat();
//        animal2.eat();

        // Dog dog2 = new Animal();


//        Dog dog = new Dog();
//        showDog(dog);
//
//        Cat cat = new Cat();
//        showCat(cat);

        //向上转型（子->父）
//        Animal dogAnmal = new Dog();

        //向下转型
//        Cat cat = (Cat) dogAnmal;

//        showAnimal(cat);

//        Cat cat = new Cat();
//
        Animal catAnimal = new Cat();
        catAnimal.eat();
//        catAnimal.mouse();
//        showAnimal(catAnimal);

        Animal dogAnimal = new Dog();
        showAnimal(dogAnimal);


//        catAnimal.eat();
//
//        Cat cat2 = (Cat) catAnimal;
//        cat2.mouse();
    }

    public static void showAnimal(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.mouse();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watch();
        }
    }

    public static void showDog(Dog dog) {
        dog.eat();
    }

    public static void showCat(Cat cat) {
//        cat.mouse();
        cat.eat();
    }


}
