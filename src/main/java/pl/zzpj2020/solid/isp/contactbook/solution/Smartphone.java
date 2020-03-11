package pl.zzpj2020.solid.isp.contactbook.solution;

public class Smartphone implements Dialer, Emailer {
    @Override
    public void makeCall(Dialable contact) {
        String telephone = contact.getTelephone();
        // Make a call
    }

    @Override
    public void sendEmail(Emailable contact, String subject, String body) {
        String email = contact.getEmailAddress();
        // Send email
    }
}
