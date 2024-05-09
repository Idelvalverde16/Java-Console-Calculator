public class Funciones {
    public static void main(String[] args) {
         String infoIdelfonso = userInfo("Idelfonso", 21);
         System.out.println(infoIdelfonso);
    }

    public static String userInfo(String personName, int personAge) {
        return "Hola estoy imprimiendo la función y me llamo: " + personName + ". Tengo " + personAge + " anos.";

    }
}
