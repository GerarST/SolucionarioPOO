using System;

namespace ConsoleApplication1
{
    public class InvalidHeightException : Exception
    {
        public InvalidHeightException(string message) : base(message)
        {
        }
    }
}