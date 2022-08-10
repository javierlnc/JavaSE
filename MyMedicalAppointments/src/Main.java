import model.Doctor;
import model.Patient;

public class Main {
    public static void main(String[] args) {

       //showMenu();

       Doctor myDoctor = new Doctor("Alvaro Leon","Nutricionista");
       System.out.println(myDoctor);
       myDoctor.showDataUser();

       Patient patient1 = new Patient("Carolina","caro@gmail.com");
       System.out.println(patient1);
       patient1.setPhoneNumber("12345678");
       patient1.setAdress("Itagui");
       patient1.setBlood("O+");
       patient1.setBirthday("27/04/1998");
       patient1.setWeight(50.3);
       patient1.setHeight(1.69);
       System.out.println(patient1);



    }
}
