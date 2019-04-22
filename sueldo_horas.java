import java.util.Scanner;
class Main {
    public static void main(String[] args) {
      int numdias=1,hordia,hortotal=0;
      float sueldo;
      String nombre;
      Scanner leer=new Scanner(System.in);
      System.out.println("Ingrese el nombre del empleado: ");
      nombre=leer.next();
      System.out.println("Ingrese el sueldo de "+nombre+": ");
      sueldo=leer.nextFloat();
      while (numdias<=5) {
          System.out.println("Ingrese el # de horas trabajadas el dia "+numdias+": ");
          hordia=leer.nextInt();
          hortotal=hordia+hortotal;
          numdias++;
      }
      System.out.println("Horas trabajadas en la semana: "+hortotal);
      System.out.println("Sueldo pagado a "+nombre+" en la semana: "+(sueldo*hortotal)+"$")


    }
  }