package Ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {
    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto",
                                            "Septiembre","Octubre","Noviembre","Diciembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    autUser(1);
                    break;
                case 2:
                    System.out.println("Doctor");
                    response = 0;
                    autUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

        }while (response != 0);

    }
    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appoinment");

                    break;
                case  2:
                    System.out.println("::My Appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response !=0);
    }
    private  static  void  autUser(int userType){
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Castro","alejandro@gmail.com"));
        doctors.add(new Doctor("Daniel Calderon","daniel@gmail.com"));
        doctors.add(new Doctor("Miriam Ruiz","miriam@gmail.com"));
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Alvaro Leon","alvaro@gmail.com"));
        patients.add(new Patient("Carlos Martinez","carlos@gmail.com"));
        patients.add(new Patient("Daniela Camacho","daniela@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert you email: ");
            Scanner sc = new Scanner(System.in);
            String email= sc.nextLine();
            if (userType == 1){
                for(Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect=true;
                        doctorLogged = d;
                    }
                }
            }
            if (userType == 2){
                for(Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect=true;
                        patientLogged = p;
                    }
                }
            }

        }while(!emailCorrect);


    }
}
