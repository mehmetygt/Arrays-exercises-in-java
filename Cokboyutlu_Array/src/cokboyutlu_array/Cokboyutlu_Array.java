
package cokboyutlu_array;

import java.util.Scanner;


public class Cokboyutlu_Array {

    public static void main(String[] args) {
     
        int[] klasik_array={1,2,3,4,5};
         for (int i = 0; i <klasik_array.length; i++) {
            
        System.out.println("klasik arrayimiz : "+klasik_array[i]);
        }
        System.out.println("******");
        
        
        int[][] ikiboyutlu_array=new int[2][2];
        ikiboyutlu_array[0][0]=5;
        ikiboyutlu_array[0][1]=10;
        ikiboyutlu_array[1][0]=20;
        ikiboyutlu_array[1][1]=30;
         
       
        for (int i = 0; i <ikiboyutlu_array.length; i++) {
            for (int j = 0; j <ikiboyutlu_array.length; j++) {
              System.out.println("iki boyutlu arrayimizin i= "+i+" ve j= "+j+" değeri = "+ikiboyutlu_array[i][j]);
            } }
        
        //iki boyutlu arraylar şu şekşldede gösteriliebilir
        
        int[][] ikiboyutlu_array2={{50,60},{70,80}};
       
        System.out.println("******");
        
        for (int i = 0; i <ikiboyutlu_array2.length; i++) {
            for (int j = 0; j <ikiboyutlu_array2.length; j++) {
                System.out.println("iki boyutlu arrayimizin i= "+i+" ve j= "+j+" değeri = "+ikiboyutlu_array2[i][j]);
            } }
        System.out.println("******");
       
        //kullanıcıdan sayı alarak iki boyutlu aray oluşturma
        System.out.println("matrisin değerlerini gir");
        Scanner scanner=new Scanner(System.in);
        int[][] ikiboyutlu_array3=new int[2][2];
        
        for (int i = 0; i < ikiboyutlu_array3.length; i++) {
            for (int j = 0; j < ikiboyutlu_array3.length; j++) {
                 System.out.println("iki boyutlu arrayimizin i= "+i+" ve j= "+j+" değerini gir  ");  
                ikiboyutlu_array3[i][j]=scanner.nextInt();
           
                
            }
        }
        System.out.println("matrisimiz : ");
         System.out.println(ikiboyutlu_array3[0][0]+" "+ikiboyutlu_array3[0][1]);
         System.out.println(ikiboyutlu_array3[1][0]+" "+ikiboyutlu_array3[1][1]);
        
          }
    
}
