
public class Client {

    public static void main(String[] args) {
    
        WestExpress we = new WestExpress(new String[] {"Visa", "Mastercard", "Discover"},
                                  "Visa", false, "West Express", "Vale, NC");
        
                                   
        Shell shell1 = new Shell(new String[] {"Visa", "Mastercard"}, "Mastercard", true,
                             "Shell", "Lincolnton, NC");
        
        Shell shell2 = new Shell(new String[] {"Visa", "Mastercard"}, "Discover", false,
                             "Shell", "Hickory, NC");

        we.printReceipt();
        System.out.println();

        shell1.printReceipt();
        System.out.println();

        shell2.printReceipt();
        System.out.println();

    }

}
