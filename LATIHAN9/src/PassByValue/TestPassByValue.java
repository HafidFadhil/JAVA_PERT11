/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByValue;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class TestPassByValue {
    
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        test(i);
        System.out.println(i);
    }
    
    public static void test(int j){
        j = 33;
    }
}