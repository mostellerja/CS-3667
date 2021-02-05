import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public abstract class GasStation {
    
    protected boolean hasCarwash;
    protected boolean isCardValid;
    protected boolean wantCarwash;
    protected String[] acceptedCards;
    protected double priceOfCarwash;
    protected double gasPrice;
    protected double gasTotal;
    protected String cardUsed;
    protected String gasStationName;
    protected String gasStationLocation;

    public GasStation(String[] acceptedCards, String cardUsed, boolean hasCarwash,
                      String gasStationName, String gasStationLocation) {
        
        this.acceptedCards = acceptedCards;
        this.cardUsed = cardUsed;
        this.hasCarwash = hasCarwash;
        this.gasStationName = gasStationName;
        this.gasStationLocation = gasStationLocation;
    
    }

    public final void printReceipt() {
    
        System.out.println("Your " + gasStationName + " located in " + gasStationLocation);
        swipeOrInsertCard();
        validateCard();
        if (isCardValid == true) {
            creditOrDebit();
            calculateTotal();
            if (hasCarwash == true)
                carwashValid();
            receipt();
            endTransaction();
        }

    }

    public final void swipeOrInsertCard() {
    
        System.out.println("Please swipe or insert card...");
    
    }
    
    public final void validateCard() {
        
        isCardValid = false;
        List al = Arrays.asList(acceptedCards);

        if (al.contains(cardUsed)) {
            isCardValid = true;
        }
        
        if (isCardValid) {
            System.out.println("Card is valid!");
        }
        else if (!isCardValid) {
            System.out.println("Card is not valid! Please try another card.");
            System.out.println(" ");
            System.out.println("TRANSACTION CACNCELLED");
        }

    }
    
    public final void creditOrDebit() {
        
        System.out.print("Is this a credit card? Please enter y or n: ");
        Scanner sc = new Scanner(System.in);
        String cardType = sc.nextLine();
        boolean isValid = false;

        do { 
               
            if (cardType.toLowerCase().equals("y")) {
                
                System.out.print("Please enter your zip code: ");
                String zipCode = sc.nextLine();
                isValid = true;

            }
            else if (cardType.toLowerCase().equals("n")) {
        
                System.out.print("Please enter your pin number: ");
                String pinNumber = sc.nextLine();
                isValid = true;
        
            }
            else if (!isValid){
                
                System.out.print("Invalid input! Please enter y or n: ");
                cardType = sc.nextLine();
            
            }
        } while (!isValid);
           
    } 

    public void carwashValid() {
   
        System.out.print("Purchase car wash? Please enter y or n: ");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean isValid = false;
        wantCarwash = false;

        do {
            if (input.toLowerCase().equals("y")) {
                System.out.println("Okay, that'll be $" + String.format("%.2f", priceOfCarwash) + ". It will be added to your receipt.");
                isValid = true;
                wantCarwash = true;
            }
            else if (input.toLowerCase().equals("n")) {
                System.out.println("Okay then... :(");
                isValid = true;
                wantCarwash = false;
        
            }
            else if (!isValid)
                System.out.println("Invalid input, Please enter y (yes) or n (no).");
        } while (!isValid);

    
    }
    
    public void calculateTotal() {
        System.out.print("How many gallons of gas do you want to purchase? ");
        
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        gasTotal = gasPrice * input;
         
        System.out.println("Your total is $" + String.format("%.2f", gasTotal) + ". The cost will be added to your receipt total.");
         
    }

    public final void receipt() {
    
        System.out.printf("Total: $%.2f", gasTotal);
        if (hasCarwash == true && wantCarwash == true)
            System.out.printf(" + $%.2f = $%.2f", priceOfCarwash, priceOfCarwash + gasTotal);
    }

    public final void endTransaction() {
    
        System.out.println("\nThank you for your purchase today at " + gasStationName + "!");
    
    }
}
