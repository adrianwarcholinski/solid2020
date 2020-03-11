package pl.zzpj2020.solid.isp.contactbook.solution;

public class PhoneContact extends Contact implements Dialable {
    private String telephone;

    public PhoneContact(String name, String address, String telephone) {
        super(name, address);
        this.telephone = telephone;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
