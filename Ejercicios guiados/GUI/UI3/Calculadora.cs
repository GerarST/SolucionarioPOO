namespace UI3
{
    public static class Calculadora
    {
        private static double a = 0, b = 0, res = 0;
        private static char op; 

        public static string SetFirstNumber(double x)
        {
            a = x;
            return a.ToString();
            // 4
        }

        public static string SetOperator(char c)
        {
            op = c;
            return a + $" {op} ";
            // 4 +
        }

        public static string SetSecondNumber(double x)
        {
            b = x;
            return a + $" {op} " + b;
            // 4 + 9
        }

        public static string Calculate()
        {
            switch (op)
            {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '*':
                    res = a * b;
                    break;
                case '/':
                    res = a / b;
                    break;
            }
            return a + $" {op} " + b + $" = " + res;
        }
    }
}