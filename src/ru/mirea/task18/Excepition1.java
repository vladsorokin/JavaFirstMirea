package ru.mirea.task18;
public class Excepition1 {
    public static void main(String[] args) {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}