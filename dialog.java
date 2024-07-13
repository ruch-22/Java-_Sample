import javax.swing.JOptionPane;
public class dialog {
    public static void main(String[] args) {
        // int n = 5;
        // for(int i=0; i<= n; i++){
        //     String Scr2= javax.swing.JOptionPane.showInputDialog(null,"enter the marks of student");
        //     n = Integer.parseInt(Scr2);
        //     System.out.println(n);

        // }
        
        // int sum=0;
        // do{
        //     String Str1 = JOptionPane.showInputDialog(null,"enter a number");
        //    int n = Integer.parseInt(Str1);
        //     sum = sum +n;
        // }
        // while(n!=0);
        // System.out.println("sum is "+sum);

        int n;
        String Str1 = JOptionPane.showInputDialog(null,"enter a character");
         
         switch (str1) {
            case (r||R):
                System.out.println("Red");
                break;
                case (g||G):
                System.out.println("Green");
               
                case (b||B):
                System.out.println("Blue");
               
                
                
         
            default:
                System.out.println("not a primary color");
         }






    }
}
    

