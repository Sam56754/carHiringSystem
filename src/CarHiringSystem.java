import java.util.Scanner;

class car {
 Scanner company = new Scanner(System.in);
    private String numberPlate;
    private String brand;
    private String make;

    // Implementing setters and getters to make the private variables accessible in other classes
    public String getNumberPlate() {
        return numberPlate;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public void setNumberPlate(String newNumberPlate) {
        this.numberPlate = newNumberPlate;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setMake(String newMake) {
        this.make = newMake;
    }

    void compute() {
        // Input of the car details
        System.out.print("Enter the number plate: ");
        setNumberPlate(company.nextLine());
        System.out.print("Enter the car brand: ");
        setBrand(company.nextLine());
        System.out.print("Enter the car make: ");
        setMake(company.nextLine());
    }
}

class client extends car {
    private long idNumber;
    private String firstName;
    private String lastName;
    private long phoneNumber;

    void input() {
        compute();
        System.out.println("\nCustomer details");
        System.out.print("Enter the customer's ID number: ");
        idNumber = company.nextLong();
        company.nextLine(); // Consume the leftover newline
        System.out.print("Enter the customer's first name: ");
        firstName = company.nextLine();
        System.out.print("Enter the customer's last name: ");
        lastName = company.nextLine();
        System.out.print("Enter the customer's phone number: ");
        phoneNumber = company.nextLong();
    }

    public long getIdNumber() {
        return idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}

class hiringAgency extends client {
    private int hours;
    private final int price = 1000;

    void calculate() {
        input();
        System.out.println();
        System.out.print("Enter the hours to be hired for: ");
        hours = company.nextInt();

        System.out.printf("\n\n\t%s %s of ID number %d and phone number 0%d, has hired the car %s %s of plate number %s.",
                getFirstName(), getLastName(), getIdNumber(), getPhoneNumber(), getBrand(), getMake(), getNumberPlate());
        System.out.printf("\nAs per our agreement of him/her having the car for %d hrs, the total payable amount is Ksh%d/=\n",
                hours, hours * price);
    }

    public static void main(String[] args) {
        hiringAgency hireus = new hiringAgency();
        hireus.calculate();
    }
}
