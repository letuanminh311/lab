package Control;

import Model.Doctor;
import ViewModel.InputData;
import ViewModel.ViewDoctor;

public class DoctorController {
    DoctorManager doctorManager = new DoctorManager();
    ViewDoctor viewDoctor = new ViewDoctor();
    InputData inp = new InputData();

    // Add a new doctor
    public void addDoctor() {
        viewDoctor.displayMessage("———Add Doctor———");
        String code = inp.inputString("Enter Code: ", Common.Constant.REGCODE);
        String name = inp.inputString("Enter Name: ", Common.Constant.REGNAME);
        String specialization = inp.inputString("Enter Specialization: ", Common.Constant.REGSPECIALIZATION);
        int availability = inp.inputInteger("Enter Availability: ", Common.Constant.REGAVAILABILITY);

        try {
            doctorManager.addDoctor(new Doctor(code, name, specialization, availability));
            viewDoctor.displayMessage("Doctor added successfully.");
        } catch (Exception e) {
            viewDoctor.displayMessage(e.getMessage());
        }
    }

    // Update a doctor
    public void updateDoctor() {
        viewDoctor.displayMessage("———Update Doctor———");
        try {
            String code = inp.inputString("Enter Code: ", Common.Constant.REGCODE);

            // Kiểm tra nếu mã bác sĩ không tồn tại thì báo lỗi ngay lập tức
            if (doctorManager.findByCode(code) == null) {
                viewDoctor.displayMessage("Doctor code doesn't exist.");
                return;
            }

            String name = inp.inputString("Enter Name (leave blank to skip): ", ".*");
            String specialization = inp.inputString("Enter Specialization (leave blank to skip): ", ".*");

            // Nhập availability dưới dạng chuỗi, và kiểm tra hợp lệ qua regex
            String availabilityStr = inp.inputString("Enter Availability (leave blank to skip): ", ".*");

            doctorManager.updateDoctor(code, name, specialization, availabilityStr);
            viewDoctor.displayMessage("Doctor updated successfully.");
        } catch (Exception e) {
            viewDoctor.displayMessage(e.getMessage());
        }
    }


    // Delete a doctor
    public void deleteDoctor() {
        viewDoctor.displayMessage("———Delete Doctor———");
        try {
            String code = inp.inputString("Enter Code: ", Common.Constant.REGCODE);
            doctorManager.deleteDoctor(code);
            viewDoctor.displayMessage("Doctor deleted successfully.");
        } catch (Exception e) {
            viewDoctor.displayMessage(e.getMessage());
        }
    }

    // Search for doctors
    // Search for doctors
    public void searchDoctor() {
        viewDoctor.displayMessage("———Search Doctor———");
        String searchStr = inp.inputString("Enter search text (leave empty to display all): ", ".*");

        // Nếu người dùng không nhập gì thì hiển thị toàn bộ danh sách bác sĩ
        if (searchStr.isEmpty()) {
            viewDoctor.displayMessage("--------- Result ------------");
            viewDoctor.displayDoctorListHeader();
            for (Doctor doctor : doctorManager.getDoctorList()) {
                System.out.println(doctor);
            }
        } else {
            viewDoctor.displayMessage("--------- Result ------------");
            viewDoctor.displayDoctorListHeader();
            // Tìm kiếm bác sĩ theo chuỗi đã nhập
            for (Doctor doctor : doctorManager.searchDoctor(searchStr)) {
                System.out.println(doctor);
            }
        }
    }

    // Display all doctors
    public void displayAllDoctors() {
        viewDoctor.displayDoctorListHeader();
        for (Doctor doctor : doctorManager.getDoctorList()) {
            System.out.println(doctor);
        }
    }
}

