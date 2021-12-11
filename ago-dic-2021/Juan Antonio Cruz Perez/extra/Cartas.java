
public class Cartas {
public int valor,J,Q,K;
public String palo;
public Cartas (int val,String palo){
    this.valor = val;
this.palo = palo;
J=11;
Q=12;
K=13;

}

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getJ() {
        return J;
    }

    public void setJ(int J) {
        this.J = J;
    }

    public int getQ() {
        return Q;
    }

    public void setQ(int Q) {
        this.Q = Q;
    }

    public int getK() {
        return K;
    }

    public void setK(int K) {
        this.K = K;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
}
