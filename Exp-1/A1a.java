import java.lang.*;

class A1a{
    public static void main(String[] args) {
        double len = 8.0; 
        double brd = 7.0; 
        double hgt = 6.0; 

        double vRectangle = len * brd * hgt;
        double vCube = len * len * len;
        double aSquare = len * len;

        System.out.println("Volume of Rectangle " + vRectangle);
        System.out.println("Volume of Cube " + vCube);
        System.out.println("Area of Square " + aSquare);
    }
}