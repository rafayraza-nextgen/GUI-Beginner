class HBD {
    
    private int doctorId;
    private int patientId;
    private int bedNumber;

    public HBD() {
        this.doctorId = 0;
        this.patientId = 0;
        this.bedNumber = 0;
    }

    public HBD(int doctorId, int patientId, int bedNumber) {
        
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.bedNumber = bedNumber;
    }
    public HBD( int doctorId, int patientId) {
      
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.bedNumber = bedNumber;
        bedNumber = 0;
    }

    public HBD( int doctorId) {
       
        this.doctorId = doctorId;
        this.patientId = patientId;
        patientId=0;

        this.bedNumber = bedNumber;
        bedNumber=0;
    }



    public void displayInfo() {

        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Patient ID: " + patientId);
        System.out.println("Bed Number: " + bedNumber);
        System.out.println("-----------------------");
    }
}
    
public class Main{
    public static void main(String[] args) {
        HBD obj1 = new HBD();
        HBD obj2 = new HBD( 101, 201, 1);
        HBD obj3 = new HBD( 102, 202, 2);

        
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();
    }
}