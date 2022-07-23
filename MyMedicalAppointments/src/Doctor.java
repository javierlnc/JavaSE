public class Doctor {
    static int id = 0; //Autoincrement
    private String name;
    private String speciality;
    private String email;
    /**
     * Descripción: inprime el nombre del doctor
     * */
    Doctor (String name, String speciality){
        System.out.println("New Docto ID");
        id++;
        this.name = name;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
