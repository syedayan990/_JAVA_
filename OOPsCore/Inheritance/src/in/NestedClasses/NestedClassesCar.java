package in.NestedClasses;

public class NestedClassesCar {

    private int noOfDoors;

    public void repair(){
        tire t = new tire();
    }



    protected static class tire{

        private double width;

        private double pressure;

        private String material;

        public void inflate(){
           // noOfDoors = 2;// error come because this is static class, and we take the non-static value
        }

    }
}
