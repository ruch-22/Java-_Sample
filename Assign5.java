public class Assign5 {
    public static void main(String[] args) {
        // quest1
        // double [] marks = {65.4, 89.0, 72.7,94.0, 83.5};
        // double sum = marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4];
        // System.out.println("the sum of marks is" +sum);
                //    OR
        // double sum =0;
        // for(double element:marks){
        //     sum =sum + element;
        // }
        // System.out.println(sum);

        // quest2
        // int [] data = {23, 45,92, 74, 32};
        // int num = 97;
        // boolean isInArray = false;
        // for(int element:data){
        //     if(num== element){
        //         isInArray= true;
        //         break;
        //     }
             
        //      }
        //      if(isInArray){
        //         System.out.println("num is in array");}
        //    else{
        //     System.out.println("not in array");
        //    }

        // quest3
        // int [] marks = {68, 92, 78, 47, 69};
        // double average = 0;
        // for(double element:marks){
        //     average = (average + element)/5.0;
        // }
        // System.out.println(average);

        // quest4(addition of matrix)
    //    int [][] mat1 = {{2,4},
    //                    {3,6}};
    //     int [][] mat2 = {{4,8},
    //                     {5,10}};
    //     int [][] result = {{0,0},
    //                       {0,0}};
    //     for(int i=0; i<mat1.length; i++){
    //         for( int j =0; j<mat1[i].length; j++){
    //             System.out.format(" setting value for i=%d anf j=%d \n", i,j);
    //             result [i][j] = mat1[i][j] + mat2[i][j];
    //         }
    //     } 
    //     for(int i=0; i<mat1.length; i++){
    //         for( int j =0; j<mat1[i].length; j++){
    //          System.out.print(result[i][j] + " ");
    //             result [i][j] = mat1[i][j] + mat2[i][j];          
    //     } 
    //     System.out.println("");

    // quest5(reversing the array)
    // int [] a= {7, 9, 12, 11, 10};
    // int n = Math.floorDiv(a.length, 2);
    // int temp;
    // for( int i=0; i<n; i++){
    //     temp = a[i];
    //     a[i] = a[a.length-1-i];
    //     a[a.length-1-i] = temp;
        
    // }
    // for(int element: a){
    //     System.out.print(element + " ");
    // }

    // quest6(maximum number in array)
    // int [] arr = {12, 35, 2, 98, 49, 69};
    // int max =0;
    // for(int element: arr){
    //     if(element>max){
    //         max = element;
    //     }
    // }
    // System.out.println("the value of the minimum element in the array is:" + max);

    // quest7(min number)
    // int [] arr = {1200, 35, -292367, -98, 49, 69};
    // int min =Integer.MAX_VALUE;
    // for(int element: arr){
    //     if(element<min){
    //         min = element;
    //     }
    // }
    // System.out.println("the value of the maximum element in the array is:" + min);

    // quest8(is the array sorted?)
    int [] ary = {1,2,3,4,5};
    boolean isSorted = true;
    for(int i =0; i < ary.length-1; i++){
        if(ary[i]> ary[i+1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("array is sorted");
    }
    else{
        System.out.println("the array is unsorted");
    }
    }
} 

