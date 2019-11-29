/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PenggunaanOperatorLogikaDanBooleanAND;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil 
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class TestAND {
    
    public static void main( String[] args ){
        int  i  = 0;
        int  j  = 10;
        boolean test= false;
        
        //demonstrasi &&
        test = (i > 10) && (j++ > 9);
        System.out.println(i);    System.out.println(j);
        System.out.println(test);

        //demonstrasi &
        test = (i > 10) & (j++ > 9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }

}