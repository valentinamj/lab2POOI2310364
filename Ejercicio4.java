package Practica1;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
            System.out.println("Por favor, ingrese un año como argumento: ");
            return;
        }
        try {
            int year = Integer.parseInt(args[0]);
            int remainder = year % 12;
            
            String zodiacSign;

            switch (remainder) {
                case 0:
                    zodiacSign = "Mono";
                    break;
                case 1:
                    zodiacSign = "Gallo";
                    break;
                case 2:
                    zodiacSign = "Perro";
                    break;
                case 3:
                    zodiacSign = "Cerdo";
                    break;
                case 4:
                    zodiacSign = "Rata";
                    break;
                case 5:
                    zodiacSign = "Buey";
                    break;
                case 6:
                    zodiacSign = "Tigre";
                    break;
                case 7:
                    zodiacSign = "Conejo";
                    break;
                case 8:
                    zodiacSign = "Dragón";
                    break;
                case 9:
                    zodiacSign = "Serpiente";
                    break;
                case 10:
                    zodiacSign = "Caballo";
                    break;
                default:
                    zodiacSign = "Año no válido";
                    break;
            }

            System.out.println(year + " es el año del " + zodiacSign + ".");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese un año válido como argumento.");
        }
    }

}
