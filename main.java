public class Main{
    public static void main (String args[]){
        System.out.println(numeroIf(71));
        bucleWhile();
        bucleFor();
        bucleSwitch();
    }
    
    public static String numeroIf(int a){
        if(a > 0)
            return "Es positivo";
        if(a == 0)
            return "Es cero";
        return "Es negativo";
    }
    

    public static void bucleWhile(){
        int numero_while = 0;
        while(numero_while < 3){
            System.out.println(numero_while);
            numero_while++;
        }
    }

   // Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    public static void bucleDoWhile(){
        int numero_while = 3;
        do{
            System.out.println(numero_while);
            numero_while++;
        } while(numero_while < 3);
    }
    
}

public static void bucleFor(){
        for(int numeroFor = 0; numeroFor < 3; numeroFor++){
            System.out.println(numeroFor);
        }
    }
  
    public static void bucleSwitch(){
        var estacion = "primavera"; 
        switch(estacion){
            case "invierno":
                System.out.println("invierno");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "verano":
                System.out.println("verano");
                break;
            default:
                System.out.println("no es estación");
            
        }
        
    }
