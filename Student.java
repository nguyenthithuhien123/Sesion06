package bailuyentap;

public class Student {
    private String msv;
    private Boolean sex;

    public Student(String msv, Boolean sex) {
        this.msv = msv;
        this.sex = sex;
    }

    public Student() {
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }
    public void showInfor(){
        System.out.printf("Mã sinh viên: %s --  giới tính sinh viên %s",this.msv,this.sex?"Nam":"Nữ");
    }
}
