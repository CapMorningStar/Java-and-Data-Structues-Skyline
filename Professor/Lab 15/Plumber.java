//KYAW SOE LWIN
//Lab 15
//7 November
//This program is about informations of Plumbers

class Plumber extends Person
 {
    private String area=" ";
    private double fee;

    public Plumber()
    {
        super();  
        area = "None";
        fee = 0.0;
    }

    public Plumber(String plumberName, String areaTown, double cost) 
    {
        super(plumberName);  
        area = areaTown;
        fee = cost;
    }

    public String getArea()
    {
        return area;
    }

    public double getFee() 
    {
        return fee;

    }

    public boolean hasSameDetails(Plumber otherPlumber)
    {
        return super.hasSameDetails(otherPlumber) && area.equalsIgnoreCase(otherPlumber.area) && fee == otherPlumber.fee;
    }

    @Override
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Area: "+getArea());
        System.out.println("Fee: $"+getFee());
    }

}

