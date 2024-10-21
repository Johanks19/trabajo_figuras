public class rectangulo extends figura{
private int base;
private int altura;

    public rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;

    }

    @Override
    public double calcularPerimetro() {
        double perimetro = base + altura * 2;
        return perimetro;
    }
}
