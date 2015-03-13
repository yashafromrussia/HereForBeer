import java.util.ArrayList;
import java.util.List;

/**
 * Represents a single transaction
 * Includes methods to fetch all transactions from transaction file
 */
public class Transaction {

  private String code;
  private String username;
  private String sellerName;
  private String userType;
  private float credit;
  private String eventName;
  private int countTickets;
  private int ticketPrice;

  public Transaction() {}

  // Returns transaction code
  public String getCode() {
    return code;
  }

  // Returns username (buyer if there's also a seller)
  public String getUsername() {
    return username;
  }

  // Returns seller's username
  public String getSellerUsername() {
    return sellerName;
  }

  // Returns user's account type
  public String getUserType() {
    return userType;
  }

  // Returns credit (depends on the context of the transaction)
  public float getCredit() {
    return credit;
  }

  // Returns event name
  public String getEventName() {
    return eventName;
  }

  // Returns number of tickets
  public int countTickets() {
    return countTickets;
  }

  // Returns ticket price
  public int getTicketPrice() {
    return this.ticketPrice;
  }

  // Returns a list of all transactions
  public static List<Transaction> getAllTransactions() {
    List<Transaction> transactions = new ArrayList<Transaction>();

      // TODO: read the file and fill up transactions
    return transactions;
  }

}
