package pl.zzpj2020.solid.isp.contactbook.solution;

public interface Emailer {
    void sendEmail(Emailable contact, String subject, String body);
}
