public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularSalario();
        men1.calcularInss();
        System.out.println(men1.imprimir());

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        System.out.println(men2.imprimir());

        // Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        System.out.println(hora1.imprimir());
        

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        System.out.println(hora2.imprimir()); 
        

        
    }
    
   
   
}