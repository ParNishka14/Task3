
public class Main {
    public static void main(String[] args) {
        Sotrud[] persArray= new Sotrud[5];
        persArray[0] = new Sotrud("Petrov P.G.","jumper","Pertovpg@mail.ru",892137645,35000,35);
        persArray[1] = new Sotrud("Smakov G.P..","fighter","smakov@mail.ru",892157568,65000,50);
        persArray[2] = new Sotrud("Gimbov j.k.","chief","gimbov@mail.ru",892357768,80000,15);
        persArray[3] = new Sotrud("Jorov N.M.","programmer","jorov@mail.ru",892135734,1555000,24);
        persArray[4] = new Sotrud("Uryhgf J.K>","jumper","yegfbv@mail.ru",89984398,1000,52);
        for (int i=0;i<=persArray.length;i++){
            if (persArray[i].age==40){
                System.out.println(persArray[i].getInfo());
            }
        }


    }
}