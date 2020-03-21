/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый за пределами пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */

package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    private String country;
    private String sity;
    private String street;
    private String hous;
    
    public Address(String country, String sity, String street, String hous){
        this.country = country;
        this.sity = sity;
        this.street = street;
        this.hous = hous;
    }

    @Override
    public String toString() {
        return "Address{" + "country=" + country + ", sity=" + sity + 
                ", street=" + street + ", hous=" + hous + '}';
    }
     
}