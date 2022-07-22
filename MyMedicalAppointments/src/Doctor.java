public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    /**
     * Descripción: inprime el nombre del doctor
     * */
    Doctor (String name, String speciality){
        System.out.println("New Docto ID");
        id++;
        this.name = name;
        this.speciality = speciality;
    }
    public  void showID(){
        System.out.println("el ID es: "+ id);
    }
    public void showName(){
        System.out.println(name);
    }
}
