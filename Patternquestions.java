package JavaLearning;

// public class Patternquestions {
//     public static void main(String[] args) {
        

//         int n = 7;
//         int m = 10;


//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
    
// }

























// public class Patternquestions{
//     public static void main(String[] args){


//         int n = 6;
//         int m = 10;



//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i == 1 || j == 1 || i == n || j == m){
//                     System.out.print("*");

//                 }
//                 else{
//                     System.out.print(" ");
//                 }

//             }
//             System.out.println();

            
//         }
//     }

// }







// half pyramid

// public class Patternquestions{
//     public static void main(String[] args){
        
//         int n = 4;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// reverse half pyramid


public class Patternquestions{
    public static void main(String[] args){
        int n = 4;



        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}







