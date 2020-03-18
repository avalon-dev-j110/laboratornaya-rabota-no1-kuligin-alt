package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.Person;
import ru.avalon.java.dev.j10.labs.models.Passport;
import ru.avalon.java.dev.j10.labs.commons.Address;

public class Main {

    /*
     * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
     */
    public static void main(String[] args) {


        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'.
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        
        Address mestoIvanov = new Address(" Russia", " Санкт-Петербург", " Невский", " 56");
        Address mestoSmith = new Address(" USA", " Вашингтон", " Street", " 26");

        Passport dannieIvanov = new Passport(" 48 04787", " 16 August 1988", 
                " 20 Nouvember 2012", " Красносельский район");
        Passport dannieSmith = new Passport(" 87 77777", " 11 August 1992", 
                " 02 Nouvember 2013", " Вашингтон");

        Person ivanov = new Person("Ivanov", null , "Ivan", 
                "Ivanovich", dannieIvanov, mestoIvanov);
        Person smith = new Person("John", "Edvard", "Smith", 
                null, dannieSmith, mestoSmith);

        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */
        
        String nameIvanov = ivanov.getFullName();
        String nameSmith = smith.getFullName();
        
        String addresIvanov = ivanov.getAddress();
        String addresSmith = smith.getAddress();

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
        
        System.out.println(nameIvanov);
        System.out.println(nameSmith);
        
        System.out.println(addresIvanov);
        System.out.println(addresSmith);
    }
}
