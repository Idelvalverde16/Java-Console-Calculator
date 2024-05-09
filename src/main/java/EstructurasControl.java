public class EstructurasControl {

    public static void main (String[] args) {

       // Operador logico ampersand:   && - AND (ambas condiciones verdaderas)
       // Operador logico or: || - OR (una de las condiciones verdaderas)
       // Operador logico not: ! - NOT (invertir el valor de la condicion)

       // Operador de comparacion equals:  ==   (igual a)
       // Operador de comparacion not equals: !=  (no es igual a)
       // Operador de comparacion menor que:  <
       // Operador de comparacion mayor que:  >
       // Operador de comparacion menor o igual que:  <=
       // Operador de comparacion mayor o igual que:  >=

       /*
       Salario anual del usuario es mayor a 100,000 -> le damos el prestamo
       Salario anual del usuario es mayor a 50,000 y su edad es menor a 30 anos -> le damos la mitad
        */

        double annualSalary = 10_000 ;
        int userAge = 35;
        boolean isVip = false;
        boolean hasDebt = false;

        if (annualSalary >= 100_000 || isVip ) {
            System.out.println("Enhorabuena, se le ha aprobado el prestamo completo!");
        } else if (annualSalary >= 50_000 && userAge < 30){
            System.out.println("Enhorabuena, se le concedio la mitad del prestamo");
        } else if (annualSalary >= 30_000 && userAge < 40){
            System.out.println("Felicidades, le concederemos un tercio del prestamo");
        } else if (!hasDebt) {
            System.out.println("Te concedemos el 10% del prestamo");
        }
        else {
            System.out.println("Lo sentimos, no se le ha concedido el prestamo");
        }

         /*
        String productType = "BELLEZA";

        switch (productType) {
            case "SALUD":
                System.out.println("El impuesto es de 5%");
                break;
            case "BELLEZA":
                System.out.println("El impuesto es de 10%");
                break;
            case "ALCOHOL":
                System.out.println("El impuesto es de 20%");
                break;
            default:
                System.out.println("El tipo de producto es desconocido");
                break;
        }
         */
    }
}
