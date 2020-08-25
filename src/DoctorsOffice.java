public class DoctorsOffice {

    public static void main(String[] args) {
        String patientName="Stacey Manson";
        boolean hasInsurane = false;
        double temp = 102.2;
        double numVisits=5.02;
        int copay= 130;
        String appointmentDate="September 20, 2020";
        String phoneNumber="(240) 867-5309";

        System.out.println("Patient Details:");
        System.out.println("Name: " +patientName);
        System.out.println("Patient has Insurance: " + hasInsurane);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Patient copay (USD): " + copay);
        System.out.println("Next appointment date: "+ appointmentDate);
        System.out.println("Contact Number: " + phoneNumber);
    }
}
