/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassBufferedReader;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GetInputFromKeyboard{
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(     System.in) );
        String name = "";
        System.out.print("Please Enter Your Name:");
        try{
            name = dataIn.readLine();
        }
        catch( IOException e ){
            System.out.println("Error!");
        }
        System.out.println("Hello " + name +"!");
    }
}