using System;

namespace ConsoleApplication1
{
    public class Circle : IShape
    {
        private double radius;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double CalculateArea() => Math.PI * Math.Pow(radius, 2);

        public double CalculatePerimeter() => 2 * Math.PI * radius;

        public override string ToString()
        {
            return $"{nameof(radius)}: {radius}";
        }
    }
}