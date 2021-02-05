import java.util.Scanner;

public class WestExpress extends GasStation {

    public WestExpress(String[] acceptedCards, String cardUsed, boolean hasCarwash,
                    String gasStationName, String gasStationLocation) {
   
        super(acceptedCards, cardUsed, hasCarwash, gasStationName, gasStationLocation);
        gasPrice = 1.99;
        if (hasCarwash == true)
            priceOfCarwash = 6.00;

    }

}
