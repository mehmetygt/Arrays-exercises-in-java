
import java.text.Normalizer;


public class Main {
    
    // foreach yapısı kullanımı
    
    public static void main(String[] args) {
        
     int[] array={1,2,3,4};
     for(int a : array){// bnu yapı ile tek tek elemanlarıyazdırabiliriz
         System.out.println(a);}
     
      String[] array2={"ali","veli","ahmet"};
      for(String b : array2){// bnu yapı ile tek tek elemanlarıyazdırabiliriz  
       System.out.println(b);}
      
      
      Deneme[] array3={new Deneme("mehmet"),new Deneme("yiğit"),new Deneme("van")};
      for(Deneme d : array3){
          d.yaz();}
 
    }
   
}
