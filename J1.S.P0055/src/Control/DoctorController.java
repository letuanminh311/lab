package Control;

import Common.Constant;
import Model.Doctor;
import ViewModel.InputData;
import ViewModel.ViewDoctor;

import java.util.HashMap;

public class DoctorController {
    private DoctorHash doctorHash;
    private ViewDoctor view;
    private InputData inputData;

    public DoctorController(DoctorHash doctorHash, ViewDoctor view, InputData inputData) {
        this.doctorHash = doctorHash;
        this.view = view;
        this.inputData = inputData;
    }

    public void addDoctor() {
        String doctorId = inputData.inputString("Enter Doctor ID (format: DOC 01): ", Constant.REGDOCTORID);
        String name = inputData.inputString("Doctor Name: ", Constant.REGDOCTORNAME);
        String specialization = inputData.inputString("Specialization: ", Constant.REGSPECIALIZATION);
        int availability = inputData.inputInteger("Availability: ", Constant.REGAVAILABILITY);
        try {
            Doctor doctor = new Doctor(doctorId, name, specialization, availability);
            doctorHash.addDoctor(doctor);
            view.displayMessage("Doctor added successfully.");
        } catch (Exception ex) {
            view.displayMessage(ex.getMessage());
        }
    }

    public void updateDoctor() {
        String doctorId = inputData.inputString("Enter Doctor ID to update: ", Constant.REGDOCTORID);
        try {
            Doctor existingDoctor = doctorHash.findDoctorById(doctorId);
            if (existingDoctor == null) {
                view.displayMessage("Doctor ID not found.");
                return;
            }

            String newName = inputData.inputString("Enter new Doctor Name: ", Constant.REGDOCTORNAME);
            if (!newName.trim().isEmpty()) {
                existingDoctor.setName(newName);
            }

            String newSpecialization = inputData.inputString("Enter new Specialization: ", Constant.REGSPECIALIZATION);
            if (!newSpecialization.trim().isEmpty()) {
                existingDoctor.setSpecialization(newSpecialization);
            }

            String newAvailabilityStr = inputData.inputString("Enter new Availability: ", Constant.REGAVAILABILITY);
            if (!newAvailabilityStr.trim().isEmpty()) {
                int newAvailability = Integer.parseInt(newAvailabilityStr);
                existingDoctor.setAvailability(newAvailability);
            }

            doctorHash.updateDoctor(existingDoctor);
            view.displayMessage("Doctor updated successfully.");

        } catch (Exception ex) {
            view.displayMessage(ex.getMessage());
        }
    }

    public void searchDoctor() {
        String input = inputData.inputString("Enter search text: ", ".*");
        try {
            HashMap<String, Doctor> results;
            if (input.trim().isEmpty()) {
                results = doctorHash.getAllDoctors();
            } else {
                results = doctorHash.searchDoctor(input);
            }

            if (results.isEmpty()) {
                view.displayMessage("No doctor found.");
            } else {
                for (Doctor doctor : results.values()) {
                    view.displayMessage(doctor.toString());
                }
            }
        } catch (Exception ex) {
            view.displayMessage(ex.getMessage());
        }
    }

    public void deleteDoctor() {
        String doctorId = inputData.inputString("Enter Doctor ID to delete: ", Constant.REGDOCTORID);
        try {
            Doctor doctor = doctorHash.findDoctorById(doctorId);
            if (doctor == null) {
                view.displayMessage("Doctor ID not found.");
                return;
            }

            doctorHash.deleteDoctor(doctor);
            view.displayMessage("Doctor deleted successfully.");
        } catch (Exception ex) {
            view.displayMessage(ex.getMessage());
        }
    }
}
