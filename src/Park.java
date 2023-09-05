

public class Park {

    void init(){
        Attrakc[] attrakc = new Attrakc[3];
        attrakc[0] = new Attrakc(1,500);
        attrakc[1] = new Attrakc(3,1000);
        attrakc[2] = new Attrakc(5,200);
    }


class Attrakc {
    int vrrab;
    int cena;

    public Attrakc(int vrrab, int cena) {
        this.cena = cena;
        this.vrrab = vrrab;
        }
    }
}

