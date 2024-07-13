import java.util.Scanner;
public class Assign4 {
    public static void main(String[] args) {
        // quest1
    //    int n =4;
    //    for(int i=n; i>0; i-- ){
    //     for(int j =0; j<i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.print("\n");
    //    }
    //    quest2
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value of n");
    int n = sc.nextInt();
//     int sum = 0;
// for(int i=0; i<n; i++){
//     sum= sum + (2*i);
// }
// System.out.println("the sum of first n even numbers is: " +sum );

// quest3
int multi =1;
// System.out.println("the table of n is ");
// for(int i=1;i<11;i++){
//     multi = n * i;
//     System.out.println(multi);
// }

// quest4
// System.out.println("the reverse table of n is:");
// for(int i= 10; i>=1; i--){
//     multi = n * i;
//     System.out.println(multi);

// }

// quest5
// int i =1;
// int fact =1;
// while(i<=n){
//     fact = fact*i;
//     i++;
    
// }
// System.out.println("the factorial is:"+fact);

// quest6
int sum1 =0;
for(int i=1; i<=10; i++){
    sum1 = sum1 + (8*i);
}
System.out.println(sum1);
   }
}

