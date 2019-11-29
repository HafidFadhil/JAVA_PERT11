/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PenggunaanOperatorKondisi;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil 
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class KondisiOperator1 {
    
    public static void main( String[] args ){
        String   status = "";
        int grade = 80;
        //mendapatkan status pelajar
        status = (grade >= 60)?"Passed":"Fail";
        //print status
        System.out.println( status );
    }
}