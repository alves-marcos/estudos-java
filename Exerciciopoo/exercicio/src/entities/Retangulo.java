package entities;

public class Retangulo {
    public double width;
    public double height;

    public double area(){
        return width*height;
    }

    public double perimetro(){
        return 2*width+2*height;
    }

    public double diagonal(){
        double raiz =  Math.sqrt((width*width)+(height*height));
        return raiz;
    }

}
