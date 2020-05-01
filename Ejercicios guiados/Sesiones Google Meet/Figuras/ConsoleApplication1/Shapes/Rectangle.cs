namespace ConsoleApplication1
{
    public class Rectangle : IShape
    {
        private double rBase, height;

        public Rectangle(double rBase, double height)
        {
            this.rBase = rBase;
            this.height = height;
        }

        public double CalculateArea() => rBase * height;

        public double CalculatePerimeter() => rBase * 2 + height * 2;
    }
}