/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PassByReference;

/**
 *
 * @author
 * NAMA  : Hafid Fadhil
 * KELAS : TI-IC
 * NIM   : A2.1900075
 */
public class TestPassByReference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []ages = {10,11,12};
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
        
        test(ages);
        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }
    }
    public static void test(int []arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=i+50;
        }
    }
}