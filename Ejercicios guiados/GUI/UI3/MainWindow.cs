using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UI3
{
    public partial class MainWindow : Form
    {
        private bool firstNumber, secondNumber, setOperation;
        public MainWindow()
        {
            firstNumber = secondNumber = setOperation = false;
            InitializeComponent();
        }

        private void mainLayout_Paint(object sender, PaintEventArgs e)
        {
            
        }

        private void equalsButton_Click(object sender, EventArgs e)
        {
            label1.Text = Calculadora.Calculate();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            if (!firstNumber)
            {
                label1.Text = Calculadora.SetFirstNumber(7);
                firstNumber = true;
                return;
            }

            if (setOperation)
            {
                label1.Text = Calculadora.SetSecondNumber(7);
            }
        }

        private void button9_Click(object sender, EventArgs e)
        {
            if (!firstNumber)
            {
                label1.Text = Calculadora.SetFirstNumber(9);
                firstNumber = true;
                return;
            }

            if (setOperation)
            {
                label1.Text = Calculadora.SetSecondNumber(9);
            }
        }

        private void Button_Click(object sender, EventArgs e)
        {
            if (firstNumber)
                label1.Text = Calculadora.SetOperator('*');

            setOperation = true;
        }
    }
}