public class Horista extends Empregado{
    protected int hora;


    public Horista(String nome, String endereco,int hora){
        super(nome, endereco);
        this.hora = hora;
    }


    public int getHora() {
        return hora;
    }


    public void setHora(int hora) {
        this.hora = hora;
    }

    public void calcularSalario(){
        salario = hora * 50;
    }

    public String imprimir(){
        return "Nome: " + nome + ", Endereco: " + endereco + ", Hora: " + hora + ", Salario: "+salario; 
    }
}
