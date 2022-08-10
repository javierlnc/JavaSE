package model;

public abstract class User {
    private  int id;
    private String name;
    private  String email;
    private  String adress;
    private  String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    abstract  void showDataUser();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero telefonico debe tener 8 digitos");

        }else {
            this.phoneNumber = phoneNumber;
        }
    }
    @Override
    public String toString(){
        return  "Nombre: " + name + ", Email: " + email + "\nAddreess: " + adress + ", Phone: "+ phoneNumber;
    }

}
