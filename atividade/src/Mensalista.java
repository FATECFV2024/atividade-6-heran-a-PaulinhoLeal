import javax.lang.model.util.ElementScanner14;

public class Mensalista extends Empregado {
    protected String cargo;

    public Mensalista(String nome, String endereco, String cargo){
        super(nome, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void calcularSalario(){
        if(cargo.equalsIgnoreCase("junior")){
            salario = 2500;
        }else if (cargo.equalsIgnoreCase("pleno")){
            salario = 3500;
        }else if (cargo.equalsIgnoreCase("senior")){
            salario = 5500;
        }else{
            System.out.println("Cargo não existe!");
        }
    }

    public String imprimir(){
        return "Nome: " + nome + ", Endereco: " + endereco + ", Salario: " + salario + ", Cargo: " + cargo; 
    }
    
}
