import java.time.LocalDate;
import java.util.Random;

/**
 * Represents a Medication in the pharmacy.
 * Contains information about dosage, quantity, and expiry date.
 */
public class Medication {
    private String id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

    /**
     * Constructs a Medication object with basic details.
     * Randomly sets an expiry date within ±1 year of today.
     *
     * @param id              Unique ID of the medication.
     * @param name            Name of the medication.
     * @param dose            Dosage of the medication.
     * @param quantityInStock Quantity in stock.
     */
    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        this.expiryDate = generateRandomExpiryDate();
    }

    /**
     * Generates a random expiry date within ±1 year of today.
     *
     * @return A LocalDate representing the expiry date.
     */
    private LocalDate generateRandomExpiryDate() {
        Random random = new Random();
        int daysOffset = random.nextInt(730) - 365;
        return LocalDate.now().plusDays(daysOffset);
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getDose() { return dose; }
    public int getQuantityInStock() { return quantityInStock; }
    public LocalDate getExpiryDate() { return expiryDate; }
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Updates the quantity of medication in stock.
     *
     * @param quantity The new quantity.
     */
    public void setQuantityInStock(int quantity) {
        this.quantityInStock = quantity;
    }

    /**
     * Checks if the medication is expired.
     *
     * @return True if expired, otherwise false.
     */
    public boolean isExpired() {
        return expiryDate.isBefore(LocalDate.now());
    }

    /**
     * Returns a string with full medication details.
     *
     * @return Medication info as a string.
     */
    @Override
    public String toString() {
        return "Medication ID: " + id + ", Name: " + name + ", Dose: " + dose +
               ", Quantity: " + quantityInStock + ", Expiry: " + expiryDate +
               (isExpired() ? " (Expired)" : "");
    }
}
