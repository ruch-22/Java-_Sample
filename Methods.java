public class Methods {
    // public static void main(String[] args) {
    //     System.out.println("Ruchika");
    //     star();
    //     System.out.println("Bambal");
    //     star();

    // }
    // static void star(){
    //     for(int i =0; i<= 49;i++){
    //         System.out.print("*");
    //     }

    // // quest2
//     public static void main(String[] args) {
//         repeat('#', 50);
//     System.out.println("Ruchika");
//     repeat('*',25);
//     System.out.println("Bambal");
//     repeat('$',70);
//     }
//     static void repeat(char a, int n)
// {
//     for(int i=1; i<=n;i++)
//     System.out.print(a);

// static int logic(int x, int y){
//     int z;
//     if(x>y){
//         z = x+ y;
//     }
//     else{
//         z = (x+y)*5;
//     }
//     return z;
// }
// public static void main(String[] args) {
//     int a= 5;
//     int b=7;
//     int c;
//     c= logic(a,b);
//     System.out.println(c);

    // // method overloading
    // static void change(int a){
    //     a=98;
    // }
    // static void change2(int [] arr){
    //     arr[0]=98;
    // }
    // public static void main(String[] args){
    //     // Case1: changing the integer
    //     // int x = 45;
    //     // change(x);
    //     // System.out.println("The value of x after running change is:"+x);

    //     // case2: changing the array
    //     int [] marks = {52, 87, 49, 89};
    //     change2(marks);
    //     System.out.println("the value of x after running change is "+marks[0]);

    private int wdays,wages;
    public void setSalary(int W1, int Sal){
        wdays = W1;
        wages = Sal;
    }
    int Salary()
    {
        int Sal = wdays*wages;
        return Sal;
    }
    class Ruchika{
        public static void main(String[] args) {
            Methods B1 = new Methods();
            Methods B2 = new Methods();
            B1.setSalary(25,500);
            B2.setSalary(50,750);
            B1.Salary();
            B2.Salary();
            int n = B1.Salary()+B2.Salary();
            System.out.println("Total Salary:"+n);
        }
    }
        }
    

    


    


    
    

