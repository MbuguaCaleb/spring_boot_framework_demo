package demo;

//the two classes since they are implementing the Staff class will be injected
public class Doctor implements Staff {
    private  String qualification;
    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
