package model;

public class Nurse extends User{
    private String specility;

    public Nurse(String name, String email) {
        super(name, email);
    }

    @Override
    void showDataUser() {
        System.out.println("Trabaja en el hospital: Pablo tobon");
        System.out.println("Departamento: General");
    }

    public String getSpecility() {
        return specility;
    }

    public void setSpecility(String specility) {
        this.specility = specility;
    }
}
