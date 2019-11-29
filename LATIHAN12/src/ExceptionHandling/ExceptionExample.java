/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class ExceptionExample {
    public static void main( String[] args ){
        try{
            System.out.println( args[1] );
        }
        catch( ArrayIndexOutOfBoundsException exp ){
            System.out.println("Exception caught!");
        }
    }
}