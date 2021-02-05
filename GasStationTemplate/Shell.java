import java.util.Scanner;

public class Shell extends GasStation {

    public Shell(String[] acceptedCards, String cardUsed, boolean hasCarwash,
                    String gasStationName, String gasStationLocation) {
   
        super(acceptedCards, cardUsed, hasCarwash, gasStationName, gasStationLocation);
        gasPrice = 2.09;
        if (hasCarwash == true)
            priceOfCarwash = 8.00; 
    }

}
