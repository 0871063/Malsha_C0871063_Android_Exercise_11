public class Temporary implements EmployeeType{

    double hourlyWage;
    double numberOfHour;
    double salesVolume;

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getNumberOfHour() {
        return numberOfHour;
    }

    public void setNumberOfHour(double numberOfHour) {
        this.numberOfHour = numberOfHour;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(double salesVolume) {
        this.salesVolume = salesVolume;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public boolean isSeller() {
        return isSeller;
    }

    public void setSeller(boolean seller) {
        isSeller = seller;
    }

    double commission;

    boolean isSeller;

    public Temporary(double hourlyWage, double numberOfHour, double salesVolume, double commission, boolean isSeller) {
        this.setHourlyWage(hourlyWage) ;
        this.setNumberOfHour(numberOfHour);
        this.setSalesVolume(salesVolume);
        this.setCommission(commission);
        this.setSeller(isSeller);
    }


    @Override
    public double getSalary() {
        double salary = hourlyWage * numberOfHour;
        if(isSeller) {
            return salary + (salesVolume * commission);
        }else {
            return salary;
        }
    }

    @Override
    public double getSalaryAccumulated() {
        return (hourlyWage * numberOfHour) + (salesVolume * commission);
    }

    @Override
    public String display()
    {
        return "salary : $" + getSalary() + "\n";
    }

    @Override
    public String toString() {
        return "Temporary Employee" +
                "\n\thourlyWage = " + hourlyWage +
                "\n\tnumberOfHour = " + numberOfHour +
                "\n\tsalesVolume = " + salesVolume +
                "\n\tcommission = " + commission +
                "\n\tisSeller = " + isSeller ;
    }
}
