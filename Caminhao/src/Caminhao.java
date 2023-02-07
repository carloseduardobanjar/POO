//Carlos Eduardo de Schuller Banjar - 122056361
public class Caminhao extends Veiculo{
    public int qtd_eixos;
    private double capacid_carga;

    public Caminhao (String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l, double capacid_carga, int qtd_eixos){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);
        this.qtd_eixos = qtd_eixos;
        this.capacid_carga = capacid_carga;
    }

    public Caminhao (String marca, String modelo, String dono, double tanque_capacid, double autonomia_km_l, double capacid_carga, int qtd_eixos, int km_rodados){
        super(marca, modelo, dono, tanque_capacid, autonomia_km_l);
        this.qtd_eixos = qtd_eixos;
        this.capacid_carga = capacid_carga;
        super.alterarKMRodados(km_rodados);
    }

    public double lerCapacidadeCarga(){
        return capacid_carga;
    }

    public boolean fazerViagem(double km, double carga){
        if(capacid_carga >= carga){
            return super.fazerViagem(km);
        }
        else{
            return false;
        }
    }
}
