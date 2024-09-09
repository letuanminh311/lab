package Control;

import Model.Doctor;

import java.util.HashMap;

public class DoctorHash {
    private HashMap<String, Doctor> doctorDatabase;

    public DoctorHash() {
        this.doctorDatabase = new HashMap<>();
    }

    public Doctor findDoctorById(String doctorId) {
        return doctorDatabase.get(doctorId);
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        if(doctorDatabase == null){
            throw new Exception("Database does not exist");
        }
        if(doctor == null){
            throw new Exception("Data does not exist");
        }
        if(doctorDatabase.containsKey(doctor.getDoctorId())){
            throw new Exception("Doctor code " + doctor.getDoctorId() + " already exists");
        }
        doctorDatabase.put(doctor.getDoctorId(), doctor);
        return true;
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (doctorDatabase == null) {
            throw new Exception("Database does not exist");
        }
        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }
        if (!doctorDatabase.containsKey(doctor.getDoctorId())) {
            throw new Exception("Doctor code doesn’t exist");
        }
        doctorDatabase.put(doctor.getDoctorId(), doctor);
        return true;
    }

    public boolean deleteDoctor(Doctor doctor) throws Exception {
        if (doctorDatabase == null || doctor == null) {
            throw new Exception("Database or doctor data does not exist");
        }
        if (!doctorDatabase.containsKey(doctor.getDoctorId())) {
            throw new Exception("Doctor code doesn’t exist");
        }

        doctorDatabase.remove(doctor.getDoctorId());
        return true;
    }

    public HashMap<String, Doctor> getAllDoctors() throws Exception {
        if (doctorDatabase == null || doctorDatabase.isEmpty()) {
            throw new Exception("Database does not exist or is empty");
        }
        return new HashMap<>(doctorDatabase);
    }

    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        if (doctorDatabase == null) {
            throw new Exception("Database does not exist");
        }
        HashMap<String, Doctor> result = new HashMap<>();
        for (Doctor doctor : doctorDatabase.values()) {
            if (doctor.getDoctorId().contains(input) ||
                    doctor.getName().contains(input) ||
                    doctor.getSpecialization().contains(input)) {
                result.put(doctor.getDoctorId(), doctor);
            }
        }
        return result;
    }
}
