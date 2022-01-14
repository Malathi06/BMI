class Patient{
	String patientName;
	double height;
	double weight;
	double computeBMI() {
		return((weight/(height*height)));
	}
}
public class PatientMain {
public static void main(String[]args) {
	Patient p1=new Patient();
	p1.patientName="Malu";
	p1.height=156;
	p1.weight=50;
	System.out.println(p1.patientName +  "="+ p1.computeBMI());	
}
}
