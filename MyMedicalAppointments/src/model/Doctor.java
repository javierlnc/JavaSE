package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Doctor extends User {

    private String speciality;
    /**
     * Descripción: inprime el nombre del doctor
     * */
    public Doctor (String name, String email){
        super(name, email);
    }

    @Override
    public void showDataUser() {
        System.out.println("Trabaja en el hospital: Pablo tobon Uribe");
        System.out.println("Departamento: Radiologia");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    ArrayList<AvaliableAppointment> avaliableAppointments = new ArrayList<>();
    public void addAvailableAppointments(String date, String time){
        avaliableAppointments.add(new AvaliableAppointment(date, time));
    }
    public ArrayList<AvaliableAppointment> getAvaliableAppointments(){
        return avaliableAppointments;
    }
    @Override
    public String toString(){
        return super.toString() + ", Especialidad: "+ speciality;
    }

    public static class AvaliableAppointment{
        private int id;
        private String date;
        private String time;

        public AvaliableAppointment(String date, String time) {
            this.date = date;
            this.time = time;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }
}
