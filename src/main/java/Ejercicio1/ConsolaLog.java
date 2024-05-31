package Ejercicio1;

public class ConsolaLog implements Observer{
    @Override
    public void actualizar(String valor) {
        String[] parts = valor.split(" ");
        String[] parts2 = parts[0].split(",");
        String stringNumber = parts2[0]; // 123
        float number = Integer.parseInt(stringNumber);

        if(number <= 12){
            System.out.println("Hace frio, se encenderá la caldera");
        }
        if(number >= 17){
            System.out.println("Hace calor, se encenderá el aire acondicionado");
        }
    }
}
