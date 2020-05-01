using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApplication1
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            try
            {
                var shapes = new List<IShape>()
                {
                    new Circle(5),
                    new Square(12),
                    new Circle(4),
                    new Triangle(15, 4, 9, 0),
                    new Rectangle(4, 10),
                    new Circle(512),
                    new Circle(1),
                    new Circle(11),
                    new Circle(25),
                    new Circle(32)
                };
                
                var justCircles = from element in shapes
                    where !(element is Circle)
                    select element;
            
                foreach (var element in justCircles)
                {
                    Console.WriteLine(element.ToString());
                }
            }
            catch (InvalidHeightException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
}