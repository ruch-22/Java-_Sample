public class Constr {
    private int radius;
    public Constr(int r){
        radius = r;
    }
    void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.println(area);
    }
    class Ruchika{
        public static void main(String[] args) {
            Constr C1 = new Constr (1);
            C1.calculateArea();
        }
    }
    
    
}
