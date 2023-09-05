public class Sotrud {
    String fio;
    String doljnost;
    String email;
    int tfnumber;
    int zp;
    int age;

    public Sotrud( String fio, String doljnost,  String email, int tfnumber, int zp,int age ){
        this.fio=fio;
        this.doljnost=doljnost;
        this.email=email;
        this.tfnumber=tfnumber;
        this.zp=zp;
        this.age=age;
    }
    String getInfo(){
        return fio+" "+doljnost+" "+email+" "+tfnumber+" "+zp+" "+age;

    }
}
