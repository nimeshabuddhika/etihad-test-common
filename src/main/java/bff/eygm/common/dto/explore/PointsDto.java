package bff.eygm.common.dto.explore;

/**
 * @author Nimesha Buddhika on 4/10/2019 12:14 PM
 */
public class PointsDto {
    private String email;
    private String firstName;
    private String lastName;
    private String memberId;
    private String applicationLink;
    private double balance;

    public PointsDto() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getApplicationLink() {
        return applicationLink;
    }

    public void setApplicationLink(String applicationLink) {
        this.applicationLink = applicationLink;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "PointsDto{" +
                "email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", memberId='" + memberId + '\'' +
                ", applicationLink='" + applicationLink + '\'' +
                ", balance=" + balance +
                '}';
    }
}
