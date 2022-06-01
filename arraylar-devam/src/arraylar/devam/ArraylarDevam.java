
package arraylar.devam;

import java.util.Arrays;
import java.util.Scanner;

public class ArraylarDevam {
    
    public static int[] array_doldur(int sayi){
        Scanner scanner=new Scanner(System.in);
        int[] a=new int[sayi];//giirlen sayıları alan bu metod bir array oluşturuyor ve dışarıya aktarıyor
        for (int i = 0; i < sayi; i++) {
            a[i]=scanner.nextInt();
            
            
        }
        return a;
     }
public static void arrayi_bastır(int[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.println("arrayimizin "+i+" inci elemanı : "+array[i]);
        
    }
}
public static void array_sırala(int [] array){
 Arrays.sort(array);// arrays.sort =arrayleri sıralayan hazır bir metoddur.
    arrayi_bastır(array);// arrrayın yeni halini bastırır
}
    public static void main(String[] args) {
        
       System.out.println("array doldur");// array doldurdan gelecek arrayi bi arraya atamalıyız ki görebilelim
           
        int[] b=array_doldur(5);// oluşan arrayı artık bastırabiliriz
        arrayi_bastır(b);
        
        System.out.println("yeni sıralı array");
        array_sırala(b); //bu metod ile arrai sıralıyoruz
      
        
        //iki array/dizi karşılaştırma
        int[] a1={1,2,3};
        int[] a2={1,2,3};
        
        if (a1==a2) {// bu iki arrayin içleri aynı olmasına rağmen belllkete tuttukları yer farklı olduüundan sonuç false döner 
            System.out.println("iki dizi aynı");
            
        } else {System.out.println("iki dizi aynı değil");
        }
       
    if (Arrays.equals(a1, a2)) {// değerlerini karşılaştırmak için Arrays.equals() metodu kullanılılır ve içleri aynı olduğundan true döner
            System.out.println("iki dizi aynı");
            
        } else {System.out.println("iki dizi aynı değil");
        }  
    }
    
}
