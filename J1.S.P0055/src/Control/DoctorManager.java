package Control;

import Common.Constant;
import Model.Doctor;
import java.util.ArrayList;

public class DoctorManager {
    private ArrayList<Doctor> doctorList;

    public DoctorManager() {
        doctorList = new ArrayList<>();
    }

    // Thêm bác sĩ
    public void addDoctor(Doctor doctor) throws Exception {
        if (findByCode(doctor.getDoctorId()) == null) {
            doctorList.add(doctor);
        } else {
            throw new Exception("Doctor code is duplicate.");
        }
    }

    // Tìm bác sĩ theo mã
    public Doctor findByCode(String code) {
        for (Doctor doctor : doctorList) {
            if (doctor.getDoctorId().equalsIgnoreCase(code)) {
                return doctor;
            }
        }
        return null;
    }

    // Cập nhật thông tin bác sĩ
    public void updateDoctor(String code, String name, String specialization, String availabilityStr) throws Exception {
        // Tìm bác sĩ theo mã
        Doctor doctor = findByCode(code);
        if (doctor == null) {
            throw new Exception("Doctor code doesn't exist.");  // Lập tức báo lỗi nếu mã bác sĩ không tồn tại
        }

        // Nếu tên không trống thì cập nhật tên
        if (!name.isBlank()) {
            doctor.setName(name);
        }

        // Nếu chuyên môn không trống thì cập nhật chuyên môn
        if (!specialization.isBlank()) {
            doctor.setSpecialization(specialization);
        }

        // Nếu availability không trống, kiểm tra với regex
        if (!availabilityStr.isBlank()) {
            // Sử dụng regex để kiểm tra xem có phải là số nguyên dương hay không
            if (availabilityStr.matches(Constant.REGAVAILABILITY)) {
                int availability = Integer.parseInt(availabilityStr);
                doctor.setAvailability(availability);
            } else {
                throw new Exception("Invalid input for Availability. It must be a positive number.");
            }
        }
        // Nếu để trống thì không thay đổi availability (giữ nguyên giá trị cũ)
    }

    // Xóa bác sĩ
    public void deleteDoctor(String code) throws Exception {
        Doctor doctor = findByCode(code);
        if (doctor == null) {
            throw new Exception("Doctor code doesn't exist.");
        }
        doctorList.remove(doctor);
    }

    // Tìm kiếm bác sĩ theo tên hoặc chuyên môn
    public ArrayList<Doctor> searchDoctor(String searchStr) {
        ArrayList<Doctor> result = new ArrayList<>();
        for (Doctor doctor : doctorList) {
            if (doctor.getDoctorId().contains(searchStr) ||
                    doctor.getName().contains(searchStr) ||
                    doctor.getSpecialization().contains(searchStr)) {
                result.add(doctor);
            }
        }
        return result;
    }

    // Lấy danh sách bác sĩ
    public ArrayList<Doctor> getDoctorList() {
        return new ArrayList<>(doctorList);
    }
}

