package conicas1;

public class Parabola_Equipo2 {
    //Variables
    private double ejex; //eje x coordenadas
    private double ejey; //eje y coordenadas
    private double a; //parametro a
    private double b; //parametro b
    private double c; //parametro c


    //Constructores
    public Parabola_Equipo2(double ejex, double ejey, double a, double b, double c) {
        this.ejex = ejex;
        this.ejey = ejey;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Método calcular el vertice X, ingresar manualmente los valores de a y b
    public double Parabola_Equipo2_VerticeX(float a, float b){
        return this.ejex = (b/(2*a));
    }
    // Método calcular el vertice Y ingresar manualmente los valores a y b y c
    public double Parabola_Equipo2_VerticeY(float a, float b, float c){
        return this.ejey = (a*(ejex)*(ejex)+b*(ejex)+c);
    }
    public double Parabola_Equipo2_ImpVer(){
        System.out.println("La coordenada del vértice es: "+"("+this.ejex+","+this.ejey+")");
        return 0;
    }

    public double getEjex() {
        return ejex;
    }

    public void setEjex(double ejex) {
        this.ejex = ejex;
    }

    public double getEjey() {
        return ejey;
    }

    public void setEjey(double ejey) {
        this.ejey = ejey;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
//Setters y getters
}
