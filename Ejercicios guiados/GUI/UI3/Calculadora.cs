namespace UI3
{
    public static class Calculadora
    {
        private static double a = 0, b = 0, res = 0;
        private static char op;

        public static double A
        {
            get => a;
            set => a = value;
        }

        public static double B
        {
            get => b;
            set => b = value;
        }

        public static double Res
        {
            get => res;
            set => res = value;
        }

        public static char Op
        {
            get => op;
            set => op = value;
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
            return res.ToString();
        }
    }
}