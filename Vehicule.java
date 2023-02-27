public abstract class Vehicule {

      String brand;
      int kilometers;

    public abstract String doStuff();

    public Vehicule(String brand, int kilometers) {
      this.brand = brand;
      this.kilometers = kilometers;
    }

    public String getBrand() {
      return this.brand;
    }
    
    public int getKilometers() {
      return this.kilometers;
    }

    public void setBrand( String newBrand) {
      this.brand = newBrand;
    }
    
    public void setKilometers(int newKilometers) {
      this.kilometers = newKilometers;
    }
}