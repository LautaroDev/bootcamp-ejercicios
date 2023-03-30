public class Ej5 {
    public static void main(String[] args) {
        String estacion = "INVIERNO";

        switch (estacion) {
            case "VERANO":
                    System.out.println("la estacion es: "+ estacion + " llego la hora de ropa mas ligera");
                break;
        
            case "INVIERNO":
            System.out.println("la estacion es: "+ estacion +  " llego la hora de abrigarse");
                break;
        
            case "OTOÑO":
            System.out.println("la estacion es: "+ estacion + " , el clima se vuelve inestable"  );
                break;
        
            case "PRIMAVERA":
            System.out.println("la estacion es: "+ estacion + ", Caen las hojas ");
                break;
        
            default:
            System.out.println( "No es una estacion del año");
                break;
        }
    }
}
