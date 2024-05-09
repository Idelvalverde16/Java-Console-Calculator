public class Bucles {
    public static void main (String[] args){

/*        String[] names = {"ARTURO", "PEDRO","MIGUEL"};
//
//        for(int i = 0; i <= names.length; i++) {
//             System.out.println("Los nombres en este arreglo son: " + names[i]);
       }*/

        double vehicleSpeed = 0.0;
        double speedLimit = 50.0;

        while(vehicleSpeed < speedLimit){
            vehicleSpeed += 12.5;
            System.out.print("The speed of the vehicle is: " + vehicleSpeed);
        }
  }
}
