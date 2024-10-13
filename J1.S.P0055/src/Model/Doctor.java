package Model;

import Common.Constant;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int availability;

    public Doctor(String doctorId, String name, String specialization, int availability) {
        if(name.matches(Constant.REGNAME) && doctorId.matches(Constant.REGCODE) && specialization.matches(Constant.REGSPECIALIZATION) && availability >= 0) {
            this.doctorId = doctorId;
            this.name = name;
            this.specialization = specialization;
            this.availability = availability;
        }
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) throws Exception {
        if(doctorId.matches(Constant.REGCODE)) {
            this.doctorId = doctorId;
        }
        else {
            throw new Exception("Doctor ID is not valid");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        if(name.matches(Constant.REGNAME)) {
            this.name = name;
        }
        else {
            throw new Exception("Doctor Name is not valid");
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) throws Exception {
        if(specialization.matches(Constant.REGSPECIALIZATION)) {
            this.specialization = specialization;
        }
        else {
            throw new Exception("Doctor Specialization is not valid");
        }
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) throws Exception {
        if(availability >= 0) {
            this.availability = availability;
        }
        else {
            throw new Exception("Doctor Availability is not valid");
        }
    }

    @Override
    public String toString() {
        return String.format("%5s %10s %10s %d\n", getDoctorId(), getName(), getSpecialization(), getAvailability());
    }
}
