using System;

namespace ConsoleApplication1
{
    public class PException : Exception
    {
        public PException(string message) : base(message)
        {
        }
    }
}