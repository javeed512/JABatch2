package records;

public record Customer(int cid , String cname , double amount) {

	
	
	 // Constructor 1 of this class
    // Compact Constructor
    public Customer
    {
        if (cid < 100) {
            throw new IllegalArgumentException(
                "Customer Id cannot be below 100.");
        }
        if (cname.length() < 4) {
            throw new IllegalArgumentException(
                "Customer name must be 4 characters or more.");
        }
    }
	
	
	
}
