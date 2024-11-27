public class Empregado {
    
    protected String nome;
    protected String endereco;
    protected double salario;

    public Empregado(){}

    public Empregado(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularIrpf(){
        double aux;
        if (salario <= 2112.00) {
            aux = 0.0; 
        } else if (salario <= 2826.65) {
            aux = (salario - 2112.00) * 0.075; 
        } else if (salario <= 3751.05) {
            aux = (salario - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075; 
        } else if (salario <= 4664.68) {
            aux = (salario - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075;   
        } else {
            aux = (salario - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 +
                      (3751.05 - 2826.65) * 0.15 + (2826.65 - 2112.00) * 0.075; 
        }
        return aux;
    }
    public double calcularInss(){
        if(salario < 1412){
            return 0.075 * salario;
        }
        else if(salario > 1412 && salario <= 2666.68){
            return 0.09 * salario;
        }else if (salario > 2666.68 && salario <= 4000.03){
            return 0.12 * salario;
        }else if(salario > 4000.03 && salario <= 7786.02){
            return 0.14 * salario;
        }
        return salario;
    }
}