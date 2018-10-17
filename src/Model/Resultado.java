
package Model;

public class Resultado {
    private int proceso;
    private int ncpu;
    private int tiempo_espera;
    private int tiempo_vuelta;

    public Resultado() {
        
    }

    public int getProceso() {
        return proceso;
    }

    public void setProceso(int proceso) {
        this.proceso = proceso;
    }

    public int getNcpu() {
        return ncpu;
    }

    public void setNcpu(int ncpu) {
        this.ncpu = ncpu;
    }

    public int getTiempo_espera() {
        return tiempo_espera;
    }

    public void setTiempo_espera(int tiempo_espera) {
        this.tiempo_espera = tiempo_espera;
    }

    public int getTiempo_vuelta() {
        return tiempo_vuelta;
    }

    public void setTiempo_vuelta(int tiempo_vuelta) {
        this.tiempo_vuelta = tiempo_vuelta;
    }

    public Resultado(int proceso, int ncpu, int tiempo_espera, int tiempo_vuelta) {
        this.proceso = proceso;
        this.ncpu = ncpu;
        this.tiempo_espera = tiempo_espera;
        this.tiempo_vuelta = tiempo_vuelta;
    }
    
}
