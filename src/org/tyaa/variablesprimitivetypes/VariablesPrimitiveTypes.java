/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.variablesprimitivetypes;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class VariablesPrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Тема 1: переменные и примитивные типы данных */
        
        //Целые типы
        byte b = -128;
        short sh = 1000;
        int x = 10000;
        long l = 10000000L;
        
        
        //Типы с плавающей запятой
        //Объявление переменной f типа float
        float f;
        //Инициализация переменной
        f = 10.0f;
        //float f = 10.25f;
        double d = 1000000.0009999d;
        
        b--;
        
        //Двоичный
        boolean bool = true;
        bool = false;
        
        //Один символ
        char ch = 'A';
        //ch++;
        
        //System.out.println((short)ch);
        //System.out.println(ch);
        
        /* Тема 2: арифметические операторы, ветвления и циклы */
        
        //Цикл со строго заданным числом повторений
        /*for (int i = 0; i < 26; i++) {
            System.out.println(ch);
            ch++;
        }*/
        
        /*while(true){
            System.out.println("Hello!");
        }*/
        
        /*boolean bool1 = (2 * 2 == 5);
        System.out.println(bool1);*/
        
        //Цикл с предусловием
        /*int i = 0;
        while(i < 26){
            //System.out.println("Hello!");
            
            System.out.println(ch);
            ch++;
            i++;
            //i = i + 1;
            //i += 1;
        }*/
        
        //Цикл с постусловием
        /*int i = 0;
        do {
            //System.out.println("Hello!");
            
            System.out.println(ch);
            ch++;
            i++;
            //i = i + 1;
            //i += 1;
        } while(i < 26);*/
        
        //Ветвления
        
        Scanner sc =
                new Scanner(System.in);
        
        System.out.println("Введите целое положительное число: ");
        
        int quantity = sc.nextInt();
        /*if (2 * 2 == 5) {
            System.out.println("Hello!");
        }*/
        
        /*if(quantity >= 0){
            
            System.out.println(quantity);
        } else {
            
            System.out.println("Введите целое положительное число!");
        }*/
        
        /*if(quantity > 0){
            
            System.out.println(quantity);
        } else if (quantity == 0) {
            
            System.out.println("Вы ввели ноль");
        } else {
            System.out.println("Мы же говорили: введите целое положительное число!");
        }*/
        
        /*switch(quantity){
            case 10 : {
                System.out.println("Вы ввели 10");
                break;
            }
            case 20 : {
                System.out.println("Вы ввели 20");
                break;
            }
            default : {
                System.out.println("Вы ввели что-то непредвиденное");
            }
        }*/
        
        //System.out.println(quantity / 10.0f);
        //System.out.println(quantity / 10);
        
        //Блок if выполнится тогда, когда значение quantity
        // равно 0 или 1, или 2 ... или 10
        if(quantity >= 0 && quantity <= 10){
            
            System.out.println(quantity);
        } else {
            
        }
        
        //System.out.println(quantity % 10);
        //System.out.println(quantity % 100);
        
        int x10 = quantity % 10;
        
        //Задание: используя if и quantity % 100 (получение двух последних
        //цифр введенного числа) сделайте так, чтобы учитывалось и исключение
        //из правила
        
        switch(x10){
            case 0 : {
                System.out.println("ворон");
                break;
            }
            case 1 : {
                System.out.println("ворона");
                break;
            }
            case 2 : {
                System.out.println("вороны");
                break;
            }
            case 3 : {
                System.out.println("вороны");
                break;
            }
            case 4 : {
                System.out.println("вороны");
                break;
            }
            case 5 : {
                System.out.println("ворон");
                break;
            }
            case 6 : {
                System.out.println("ворон");
                break;
            }
            case 7 : {
                System.out.println("ворон");
                break;
            }
            case 8 : {
                System.out.println("ворон");
                break;
            }
            case 9 : {
                System.out.println("ворон");
                break;
            }
            default : {
                System.out.println("Вы ввели что-то непредвиденное");
            }
        }
    }
    
}
