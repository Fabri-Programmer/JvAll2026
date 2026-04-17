/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicajavafull;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PracticaJavaFull {

    
     
    public static void main(String[] args) {
        
        
     // almacena un caracter char caracter = 'g';
     // Datos no primitivos = Integer n = 10;
     // Cadena no primito String h = "Hola que tal?";
     // asignacion de constante final int n = 10;
     
     Scanner entrada = new Scanner(System.in);
    
     //Suma
     
     /*int n1;
     int n2;
     
     System.out.print("Digite valor 1: ");
     n1 = entrada.nextInt();
     System.out.print("Digite valor 2: ");
     n2 = entrada.nextInt();
     
     
     System.out.print("\nLa suma es: "+(n1+n2)); 
     
     
     //Datos
     
     String n = "";
     
     System.out.print("Como te llamas: ");
     n = entrada.nextLine();
     
     System.out.print("Tu nombres es: "+n);
     */
     
     //JOoptionPane - Muestra datos pero no desde la consola
     
     /*
     int n;
     double r;
     char f;
     String d;
     
     n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
     r=  Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
     f = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
     d = JOptionPane.showInputDialog("Ingrese su nombre: ");
     
     JOptionPane.showMessageDialog(null, "Tu edad es: "+n);
     JOptionPane.showMessageDialog(null, "Tu numero decimal es: "+r);
     JOptionPane.showMessageDialog(null, "Tu letra favotira es: "+f);
     JOptionPane.showMessageDialog(null, "Tu Nombre es: "+d); */
     
    /* 
    double n1,n2,n3,n4;
     
    
     
   
     
     
     System.out.print("Ingresa un valor para Raiz cuadrada: ");
     n1 = entrada.nextDouble();
     System.out.print("Ingresa un valor para Redondear: ");
     n2 = entrada.nextDouble();
     System.out.print("Ingresa un numero base: ");
     n3= entrada.nextDouble();
     System.out.print("Ingresa un numero exponencial: ");
     n4= entrada.nextDouble();
     
     
     System.out.print("\nEl valor es : "+Math.sqrt(n1));
     System.out.print("\nEl valor redondeado es: "+Math.round(n2));
     System.out.print("\nEl valor Random: "+Math.random());
     System.out.print("\nEl numero a su exponencial es: "+Math.pow(n3, n4));
     */
    
    
    //Suma de promedio de notas
    /*
    int n1,n2,n3,n4,promedio;
    
    System.out.print("Ingresa nota 1: ");
    n1 = entrada.nextInt();
    System.out.print("Ingresa nota 2: ");
    n2 = entrada.nextInt();
    System.out.print("Ingresa nota 3: ");
    n3 = entrada.nextInt();
    System.out.print("Ingresa nota 4: ");
    n4 = entrada.nextInt();
    
    promedio= (n1+n2+n3+n4) / 4;
    
    System.out.print("Tu promedio es: "+promedio);
    */
    
    
    //Calculando Sueldo semanal por horas trabajadas 
    
    /*double S_hora, SueldoSemanal;
    
    SueldoSemanal = 3.50;
    
    System.out.print("¿Cuantas horas trabajas en la semana?: ");
    S_hora = entrada.nextDouble();
    
    SueldoSemanal = (SueldoSemanal * S_hora);
    
    System.out.print("Tu sueldo semanal es:"+SueldoSemanal);
    */
    
    /*
    double L2, J3;
    
   final double G1;
   
    System.out.print("¿Guillermo cuanto dolares tienes?: ");
    G1 = entrada.nextDouble();
    
    L2 = G1/2;
    
    J3 = (L2/2 + G1/2);
    
    System.out.print("\nGuillermo tiene S/: "+G1);
    System.out.print("\nJuan tiene S/: "+L2);
    System.out.print("\nLuis tiene S/: "+J3);
    
    System.out.print("\n\tLa suma de todos: "+(G1+L2+J3));
     */
    
    //notas con ponderados
    /*double p1,p2,p3,p4,total;
    
    //Historial academico:
  
    
    System.out.print("\nCuanta participacion tuvo: ");
    p1 = entrada.nextDouble();
    System.out.print("\nCuanto fue el primer examen parcial: ");
    p2= entrada.nextDouble();
    System.out.print("\nCuanto fue el segundo examen: ");
    p3= entrada.nextDouble();
    System.out.print("\nCuanto fue el examen final: ");
    p4 =entrada.nextDouble();
    
    p1 = p1 * 0.10;
    p2= p2* 0.25;
    p3 = p3* 0.25;
    p4 = p4* 0.40;
    
    total = (p1+p2+p3+p4);
    
    System.out.print("\nTu participacion con el 10% es: "+p1);
    System.out.print("\nTu primer examen con el 25% es: "+p2);
    System.out.print("\nTu segundo examen con el 25% es: "+p3);
    System.out.print("\nTu examen final con el 40% es: "+p4);
    System.out.print("\n\tTu promedio final es: "+total);
    
    */ 
    
    
    //swicht
   
    /*
    int d;
    
    System.out.println("Ingresa un numero de 1-3: ");
    d=entrada.nextInt();
   
    switch(d)
    {
        case 1: System.out.print("Ganaste una lavadora");
        break;
        case 2: System.out.print("Ganaste una Mandarina");
        break;
        case 3: System.out.print("Ganaste una taza");
        break;
        default: System.out.print("No ganaste nada");
        
    */
    
    
    
    //multiplos
    /*
    int dato;
    
    System.out.print("Ingresa un numero: ");
    dato = entrada.nextInt();
    
    if(dato % 10 == 0)
    {
        System.out.print("Es multiplo de 10");
    }
    else
    {
        System.out.print("No es multiplo de 10");
    }
    
    
*/
    
    //evaluando caracteres en mayuscula
    /*
    char r;
    
    
    System.out.print("Ingresa una letra: ");
    r = entrada.nextLine().charAt(0);
    
    {
        if(Character.isUpperCase(r))
        {
            System.out.print("Letra esta en mayuscula");
        }
        else{
            System.out.print("Letra esta en minuscula");
        }
    }
    
    */
    
    //Salario de un obrero con condicionales
    
    /*double Salario,total = 0;
    int hora = 16;
    
    
    System.out.print("Ingresa Horas Trabajas en la Semana: ");
    Salario = entrada.nextDouble();
    
    if(Salario <= 40){
       
        total = Salario*hora;
        System.out.print("Tu sueldo neto es: "+total);
    
    }
    if(Salario > 40){
        
        
        total= (40*16) + ((Salario-40)*20);
        System.out.print("Tu sueldo mayor a 40H + extras: "+total);
    }
    */
    
    
    int a,b,c;
    
    System.out.println("\nIngresa numero 1: ");
    a = entrada.nextInt();
    System.out.println("\nIngresa numero 2: ");
    b = entrada.nextInt();
    System.out.println("\nIngresa numero 3: ");
    c= entrada.nextInt();
    
    if(a>b && a>c)
    {
        System.out.println("El numero mayor es el 1 con: "+a);
        
    }
    if(b>a && b>c)
    {
        System.out.print("El numero mayor es el 2 con: "+b);
    }
    if(c>a && c>b)
    {
      System.out.print("El numero mayor es el 3 con: "+c);
    }
}
    }
