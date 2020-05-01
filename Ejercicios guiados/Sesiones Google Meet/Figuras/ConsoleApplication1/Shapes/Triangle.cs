using System;

namespace ConsoleApplication1
{
    public class Triangle : IShape
    {
        private double tBase, side1, side2, height;

        public Triangle(double tBase, double side1, double side2, double height)
        {
            if(height == 0)
                throw new InvalidHeightException("No hay triangulos con altura 0");
            
            this.tBase = tBase;
            this.side1 = side1;
            this.side2 = side2;
            this.height = height;
        }

        public double CalculateArea() => (tBase * height) / 2;

        public double CalculatePerimeter() => tBase + side1 + side2;
    }
}