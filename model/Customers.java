package software2.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Customers class.
 * @author logan
 */
public class Customers {
    // customerId is autogenerated
    // int divisionId is FK to FirstLevelDivisions
    // first-level-division and country data should be from 2 comboboxes
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerPostalCode;
    private String customerPhone;
    private int divisionId;
    private String divisionName;
    private int countryId;
    private String countryName;

    private static ObservableList<Customers> allCustomers = FXCollections.observableArrayList();

    /**
     * Customer constructor.
     * @param customerId Customer ID.
     * @param customerName Customer name.
     * @param customerAddress Customer address.
     * @param customerPostalCode Customer postal code.
     * @param customerPhone Customer phone number.
     * @param divisionId Customer first level division ID.
     * @param divisionName Customer first level division name.
     * @param countryId Customer country ID.
     * @param countryName Customer country name.
     */
    public Customers(int customerId, String customerName, String customerAddress, String customerPostalCode,
                     String customerPhone, int divisionId, String divisionName, int countryId, String countryName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPostalCode = customerPostalCode;
        this.customerPhone = customerPhone;
        this.divisionId = divisionId;
        this.divisionName = divisionName;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    /**
     * Get customer ID.
     * @return Customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Get customer name.
     * @return Customer name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Get customer address.
     * @return Customer address.
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Get customer postal code.
     * @return Customer postal code.
     */
    public String getCustomerPostalCode() {
        return customerPostalCode;
    }

    /**
     * Get customer phone number.
     * @return Customer phone number.
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Get customer first level division ID.
     * @return Customer first level division ID.
     */
    public int getDivisionId() {
        return divisionId;
    }

    /**
     * Get customer first level division name.
     * @return Customer first level division name.
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Get customer country ID.
     * @return Customer country ID.
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Get customer country name.
     * @return Customer country name.
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Get all customers.
     * @return ObservableList of all customers.
     */
    public static ObservableList<Customers> getAllCustomers() {
        return allCustomers;
    }

    /**
     * Set all customers using database query.
     * @param allCustomers ObservableList from database query.
     */
    public static void setAllCustomers(ObservableList<Customers> allCustomers) {
        Customers.allCustomers = allCustomers;
        System.out.println("customers set");
    }

    /**
     * Customers toString override method for displaying name and ID in combo boxes.
     * @return Concatenation of customer name and customer ID.
     */
    @Override
    public String toString() {
        return customerName + " [" + customerId + "]";
    }
}