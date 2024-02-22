class Student {
    String fullNmae;
    int rollNum;
    double semPercentage;
    String collegeName;
    int collegeCode;
    //constructor
    Student()
    {
        System.out.println("The student ID has been created.");
        fullNmae = "Murali";
        rollNum = 527;
        semPercentage = 85;
        collegeCode = 33;
        collegeName = "MVGR";

    }
    void display()
    {
        //System.out.println();
        System.out.println(fullNmae);
        System.out.println(rollNum);
        System.out.println(semPercentage);
        System.out.println(collegeCode);
        System.out.println(collegeName);
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.display();
    }
}
