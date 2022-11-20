public class Permanent implements EmployeeType {

    int noOfDays;
    double monthlySalary;
    int noOfChildren = 0;
    boolean married;
    double amountForChild;

    public Permanent(int noOfDays, double monthlySalary, int noOfChildren, boolean married, double amountForChild) {
        this.noOfDays = noOfDays;
        this.monthlySalary = monthlySalary;
        this.noOfChildren = noOfChildren;
        this.married = married;
        this.amountForChild = amountForChild;
    }

    @Override
    public double getSalary(){
        if (married ) {
            return ((monthlySalary + (amountForChild * noOfChildren)) / 20 ) * noOfDays;
        }else{
            return (monthlySalary / 20 ) * noOfDays;
        }
    }

    @Override
    public double getSalaryAccumulated() {
        return ((monthlySalary + (amountForChild * noOfChildren)) / 20 ) * noOfDays;
    }

    @Override
    public String display()
    {
        return "salary : $" + getSalary() + "\n";
    }

    @Override
    public String toString() {
        String n = super.toString();
        return "Permanent{" +
                "\n\tnoOfDays = " + noOfDays +
                "\n\tmonthlySalary = " + monthlySalary +
                "\n\tnoOfChildren = " + noOfChildren +
                "\n\tmarried = " + married +
                "\n\tamountForChild = " + amountForChild ;
    }

//    @Override
//    public double getSalaryAccumulated() {
//        return ((monthlySalary + (amountForChild * noOfChildren)) / 20 ) * noOfDays;
//    }
}
