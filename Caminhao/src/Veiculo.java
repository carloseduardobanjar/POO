//Carlos Eduardo de Schuller Banjar - 122056361
public class Veiculo {
    public String marca;
    public String modelo;
    public String dono;
    private double tanque_capacid;
    private double tanque_atual;
    private double autonomia_km_l;
    private double km_rodados;

    public Veiculo(String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l){
        this.marca = marca;
        this.modelo = modelo;
        this.dono = dono;
        if(validarProp(tanque_capacid)){
            this.tanque_capacid = tanque_capacid;
        }
        else{
            this.tanque_capacid = 10;
        }
        this.tanque_atual = 0;
        if(validarProp(autonomia_km_l)){
            this.autonomia_km_l = autonomia_km_l;
        }
        else{
            this.autonomia_km_l = 10;
        }
        this.km_rodados = 0;
    }

    private boolean validarProp(double prop){
        if(prop <= 0){
            System.out.println("Parâmetro inválido!");
            return false;
        }
        else
            return true;
    }

    public double lerTanqueAtual(){
        return this.tanque_atual;
    }

    public double lerTanqueCapacidad(){
        return this.tanque_capacid;
    }

    public double lerAutonomia(){
        return this.autonomia_km_l;
    }

    public double lerRodagem(){
        return this.km_rodados;
    }

    public boolean alterarAutonomia(double autonomia){
        if(validarProp(autonomia)){
            this.autonomia_km_l = autonomia;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean abastecerTanque(double litros){
        if(validarProp(litros)){
            if(this.tanque_atual + litros <= tanque_capacid){
                this.tanque_atual = this.tanque_atual + litros;
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public boolean fazerViagem(double km){
        if(km / this.autonomia_km_l <= this.tanque_atual){
            this.tanque_atual = this.tanque_atual - (km / autonomia_km_l);
            this.km_rodados = this.km_rodados + km;
            return true;
        }
        else{
            return false;
        }
    }

    public void alterarKMRodados(double km_rodados){
        this.km_rodados = km_rodados;
    }

    public double lerKm(){ return this.km_rodados; }
}
