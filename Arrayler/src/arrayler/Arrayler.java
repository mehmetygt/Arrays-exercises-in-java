
package arrayler;

import java.util.Scanner;


public class Arrayler {

  
    public static void main(String[] args) {
        int [] a={10,20,30};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println("**********");
          
        int [] b=new int[2];
        b[0]=9;
        System.out.println( b[0]);
        System.out.println( b[1]);//değer atamamışsak default olrak 0 atar
        //array sayısını geçerdek hata alırız
        System.out.println("***********");
        
        int [] c=new int[4];// FOR İLE  ARRAY ELEMANI BELİRLEME
        for (int i = 0; i < 4; i++) {
            c[i]=(i*4)+2;
            System.out.println( c[i]);}
        System.out.println(" c arrayimizin boyu : "+c.length);
        

            int []e=new int [3];// ARRAY ELELMANLARINI KENDİMİZ BELİRLEME
            Scanner scanner=new Scanner(System.in);
            System.out.println("elemanları girin ");
            for (int j = 0; j <e.length; j++) {
            e[j]=scanner.nextInt();
                System.out.println("e nin "+j+" inci elemanı : "+e[j]);}
         
         //arraylar i methodda çağırma  
            int[] f={10,20,30,40};
           array_bastır(f);
        System.out.println("f arrayinin ortalaması : "+  array_ortalama(f));
        
    }
    public static void array_bastır(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("f arrayinin "+i+" indeksli elemanı : "+array[i]);
            
        }
    }
    public static double array_ortalama(int [] array){
        int top=0;
        for (int i = 0; i <array.length; i++) {
            top=top+array[i];
            
            
        }
        int ort=top/array.length;
        return ort;
    
    }
    
}
