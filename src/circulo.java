public class circulo extends figura{
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = (radio * radio) * 3,1416;
        return area;
    }

    @Override
    public double calcularPerimetro() {
       double perimetro = (2 * radio) * 3,1416;
        return perimetro;

    }
}
