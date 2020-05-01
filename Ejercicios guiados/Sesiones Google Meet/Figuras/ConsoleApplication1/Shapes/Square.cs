
using System;

namespace ConsoleApplication1
{
    public class Square : IShape
    {
        private double side;

        public Square(double side)
        {
            this.side = side;
        }

        public double CalculateArea() => Math.Pow(side, 2);
        // public double CalculateArea() { return Math.Pow(side, 2); }

        public double CalculatePerimeter() => 4 * side;
    }
}