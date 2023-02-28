package homework.homework11.medicalCenter;

import homework.homework11.medicalCenter.model.Doctor;
import homework.homework11.medicalCenter.model.Patient;
import homework.homework11.medicalCenter.storage.PersonStorage;
import homework.homework11.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {
        boolean isRum = true;
        while (isRum) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRum = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with" + doctorId + " does not exists");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id, name,surname,phone,registerDateTime(27-02-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");

            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient added");
                } else {
                    System.out.println("doctor is unavailable");
                }

            } catch (ParseException e) {
                System.out.println("Incorrect date time format please try again");
            }
        } else {
            System.out.println("doctor with" + doctorId + " does not exists");
        }
    }


    private static void changeDoctorDataById() {
        personStorage.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("please input name,surname,phone,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhoneNumber(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(Profession.valueOf(doctorData[4]));
            personStorage.add(doctorById);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with" + doctorId + " does not exists");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("doctor with" + doctorId + " does not exists");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(Profession.valueOf(profession));
    }

    private static void addDoctor() {
        System.out.println("doctors from");
        Profession[] professions = Profession.values();
        for (Profession profession : professions) {
            System.out.println(profession);
        }
        try {
            System.out.println("please input id,name,surname,phone,email,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            String doctorId = doctorData[0];
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById == null) {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setPhoneNumber(doctorData[3]);
                doctor.setEmail(doctorData[4]);
                doctor.setProfession(Profession.valueOf(doctorData[5]));
                personStorage.add(doctor);
                System.out.println("Doctor added");
            } else {
                System.out.println("Doctor with" + doctorId + "already exists");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("please try again");
        }

    }
}
