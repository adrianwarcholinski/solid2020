package pl.zzpj2020.solid.isp.contactbook.solution;

public class EmailContact extends Contact implements Emailable {
    private String emailAddress;

    public EmailContact(String name, String address, String emailAddress) {
        super(name, address);
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
