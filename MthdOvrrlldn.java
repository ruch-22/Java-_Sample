import javax.sound.midi.Soundbank;

public class MthdOvrrlldn {
    // static void foo(){
    //     System.out.println("Good morning bro!");
    // }
    // static void foo(int a){
    //     System.out.println("Good morning"+a+"bro!");
    // }
    // static void change(int a){
    //     a = 98;
    // }
    // public static void main(String[] args) {
    //     // method overloading
    //     // Arguments are actual
    //     foo();
    //     foo(300);

    //  Variable Arguments
    static int sum(int ...arr){
        // Available as_int [] arr;
        int result =0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varangs Tutorial");
        System.out.println("sum of nothing is:" +sum());
        System.out.println("The sum of 4 and 5 is:"+sum(  4,5));
        System.out.println("The sum of 4, 3 and 5 is:"+sum(  4,3,5));
    }
    }
    


 
