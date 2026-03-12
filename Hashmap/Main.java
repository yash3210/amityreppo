package Hashmap;
import java .util.HashMap;

// public class Main {
//     public static void main(String[] args) {
//         String word = "banana" ;
//         HashMap<Character , Integer > freq  = new HashMap<>();

//          for (char ch : word.toCharArray()){

//                 if(freq.containsKey(ch)){
//                     int count = freq.get(ch);
//                     freq.put(ch , count + 1 ) ;
//                 }
//                 else 
//                 {
//                     freq.put(ch , 1) ;
//                 }
//          }
//          System.out.println(freq);
//     }
// }

// public class Main {
//         public static void main(String[] args) {
            
//             String word = "aabb" ;
//             HashMap<Character , Integer > freq = new HashMap<>();

//             for (char ch : word.toCharArray()){
//                 if (freq.containsKey(ch)){
//                     int count = freq.get(ch);
//                     freq.put(ch, count + 1);
//                 }
//                 else 
//                 {
//                     freq.put(ch, 1 );
//                 }
                
//             }
//             boolean found = false ;
//             for(char ch : word.toCharArray()){
//                 if(freq.get(ch) == 1 ){
//                     System.out.println(ch);
//                     break;
                
//                 }
//             }
//            if(!found){
//             System.out.println(" no unique characters");
//            } 
            
//         }
// }

public class Main {

    public static void main(String[] args) {
        
        int [] arr = {1,2,2,2,3,1};

        HashMap<Integer , Integer> freq = new HashMap<>();

        for (int num : arr) {
                if (freq.containsKey(num)) {
                    int count = freq.get(num);

                    freq.put(num, count +1);

                }
                else{
                    freq.put(num, 1);
                }
        }
        System.out.println(freq);
    }
}
        
        