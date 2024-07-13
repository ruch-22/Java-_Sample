import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        // if(age > 25){
        //     System.out.println("you are eligible");
        // }
        // else if(age>35){
        //     System.out.println("you are semi eligible");
        // }
        // else if(age>45){
        //     System.out.println("you are semi semi eligible");
        // }
        // else{
        //     System.out.println("you are not eligible");

        // SWITCH CASE
        switch(age){
            case 18:
            System.out.println("you are going to become an adult");
            break;
            case 23:
            System.out.println("you should join a job");
            break;
            case 60:
            System.out.println("you should retire");
            break;
            default:
            System.out.println("enjoy your life");

        }

        }
    }
    

