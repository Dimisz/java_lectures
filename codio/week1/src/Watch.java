public class Watch {
    private String manufacturer;
    private String model;
    private int diameter;
    private int waterResistance;
    private String material;

    public Watch(String manufacturer, String model, int diameter,
                 int waterResistance, String material){
        this.manufacturer = manufacturer;
        this.model = model;
        this.diameter = diameter;
        this.waterResistance = waterResistance;
        this.material = material;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getWaterResistance(){
        return waterResistance;
    }

    public void setWaterResistance(int waterResistance){
        this.waterResistance = waterResistance;
    }

    public String getMaterial(){
        return material;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    private String printWatch(){
        String summary = "Manufacturer: " + manufacturer.substring(0,1).toUpperCase() + manufacturer.substring(1);
        summary += "\nModel: " + model.substring(0,1).toUpperCase() + model.substring(1);
        summary += "\nDiameter: " + diameter + " mm";
        summary += "\nWater Resistance: " + waterResistance + " m";
        summary += "\nMaterial: " + material.substring(0,1).toUpperCase() + material.substring(1);
        return summary;
    }

    public String summary(){
        return printWatch();
    }


    public static void main(String[] args) {
        Watch myWatch = new Watch("omega", "speedmaster", 42, 50, "steel");
        System.out.println(myWatch.summary());

    }
}
