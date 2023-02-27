class Hangar {
    public static void main(String[] args){
      Car ferrari = new Car("Ferrari", 69);
      Boat cigarette = new Boat("Cigarette", 30);
    
      System.out.println(ferrari.doStuff());
      System.out.println(cigarette.doStuff());
  }
}