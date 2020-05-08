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
        private bool setOperation, setFirstDecimal, setSecondDecimal;
        private String first, second, ope;
        public MainWindow()
        {
            setFirstDecimal = setSecondDecimal = setOperation = false;
            first = second = ope = "";
            InitializeComponent();
        }

        private void ButtonAction(double number)
        {
            if (!setOperation)
                first += number;
            else
                second += number;

            label1.Text = first + ope + second;
        }

        private void OperatorAction(char c)
        {
            if (!setOperation)
            {
                ope = c.ToString();
                
                Calculadora.A = Convert.ToDouble(first);
                Calculadora.Op = c;
                
                setOperation = true;

                label1.Text = first + ope + second;
                return;
            }
            
            if(setOperation && !second.Equals(""))
            {
                Calculadora.B = Convert.ToDouble(second);
                
                first = Calculadora.Calculate();
                second = "";

                Calculadora.A = Convert.ToDouble(first);

                ope = c.ToString();
                Calculadora.Op = c;
                
                setOperation = true;
                
                label1.Text = first + ope + second;
            }
        }

        private void SetDot()
        {
            if (second.Equals("") && !setFirstDecimal)
            {
                first += ".";
                setFirstDecimal = true;
            }

            if (!second.Equals("") && !setSecondDecimal)
            {
                second += ".";
                setSecondDecimal = true;
            }

            label1.Text = first + ope + second;
        }

        private void equalsButton_Click(object sender, EventArgs e)
        {
            label1.Text = Calculadora.Calculate();
        }

        private void button7_Click(object sender, EventArgs e)
        {
            ButtonAction(7);
        }

        private void button9_Click(object sender, EventArgs e)
        {
            ButtonAction(9);
        }

        private void MultiplyButton_Click(object sender, EventArgs e)
        {
            OperatorAction('*');
        }

        private void button8_Click(object sender, EventArgs e)
        {
            ButtonAction(8);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ButtonAction(4);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            ButtonAction(5);
        }

        private void button6_Click(object sender, EventArgs e)
        {
            ButtonAction(6);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            ButtonAction(1);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ButtonAction(2);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            ButtonAction(3);
        }

        private void button0_Click(object sender, EventArgs e)
        {
            ButtonAction(0);
        }

        private void dot_Click(object sender, EventArgs e)
        {
            SetDot();
        }
    }
}