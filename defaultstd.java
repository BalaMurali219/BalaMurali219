public class defaultstd{
    String fullName;
    double semPercentage;
    defaultstd()
    {
        System.out.println("college name = MVGR");
        System.out.println("college code =33");
    }
    defaultstd(String fullNmae , double semPercentage)
    {
        System.out.println("Name = "+fullNmae);
        System.out.println("sempercentage = "+semPercentage);
    }
}
class test{
    public static void main(String[] args)
    {
        defaultstd Murali = new defaultstd();
        defaultstd Murali1 = new defaultstd("name",100);
    }
}

