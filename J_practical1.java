import javax.swing.JOptionPane;
public class J_practical1 {

    
public static void main(String[] args) {
    System.out.println("Offer!! Offer!!");
    System.out.println("For FREE Movie tickets, checK out the the details below.");
    
    // STEP1: variable declaration
    String movieName;
    double adult_TicketPrice;
    double child_TicketPrice;
    int noOfAdultTicketsSold;
    int noOfChildTicketsSold;
    double percentDonation;
    double grossAmount;
    double amountDonated;
    double netSaleAmount;

    // STEP2: variable Retrive
    movieName = JOptionPane.showInputDialog(null,"Enter the movie to watch:");
    JOptionPane.showMessageDialog(null,"The movie name is:"+movieName);
    String AdultPrice = JOptionPane.showInputDialog(null,"Enter the price of Adult ticket:");
    adult_TicketPrice = Double.parseDouble(AdultPrice);
    JOptionPane.showMessageDialog(null,"Price of Adult ticket is:" +AdultPrice);
    String ChildPrice = JOptionPane.showInputDialog(null,"Enter the price of Child ticket:");
    child_TicketPrice = Double.parseDouble(ChildPrice);
    JOptionPane.showMessageDialog(null, "The price of child ticket is:" +ChildPrice);
    String ATicketSold = JOptionPane.showInputDialog(null,"Enter the number of adult tickets sold:");
    noOfAdultTicketsSold  = Integer.parseInt(ATicketSold);
    JOptionPane.showMessageDialog(null,"Number of adult tickets sold:" +noOfAdultTicketsSold);
    String CTicketSold = JOptionPane.showInputDialog(null,"Enter the number of child tickets sold:");
    noOfChildTicketsSold  = Integer.parseInt(CTicketSold);
    JOptionPane.showMessageDialog(null,"Number of child tickets sold:" +noOfChildTicketsSold);
    String PcntGrssDont = JOptionPane.showInputDialog(null,"Enter the percentage of gross amount donated");
    percentDonation = Double.parseDouble(PcntGrssDont);
    JOptionPane.showMessageDialog(null,"The percentage of gross amount:" +percentDonation );

    // STEP3: Calculations
    grossAmount = adult_TicketPrice*noOfAdultTicketsSold+child_TicketPrice*noOfChildTicketsSold;
    amountDonated = grossAmount*percentDonation/100;
    netSaleAmount = grossAmount-amountDonated;
    
    // STEP4: print output
    JOptionPane.showMessageDialog(null,"movie Name:"+movieName+"\n"+"Number of Tickets Sold:" + (noOfAdultTicketsSold + noOfChildTicketsSold)+"\n"+"Gross amount: $"+String.format("%.2f",grossAmount)+"\n"+"Percentage of Gross Amount Donated:"+String.format("%.2f",percentDonation)+"\n"+"Amount Donated:$"+String.format("%.2f",amountDonated)+"\n"+"Net Sale:$"+String.format("%.2f",netSaleAmount));




    
}

    
}
