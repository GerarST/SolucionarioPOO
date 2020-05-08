using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace UI
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            comboBox1.DataSource = new List<String>() {"Morado", "Celeste", "Rosado"};
        }

        private void button1_Click(object sender, EventArgs e)
        {
            BackColor = Color.Red;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            BackColor = Color.Blue;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            BackColor = Color.Green;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            BackColor = ColorTranslator.FromHtml("#" + textBox1.Text);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            String morado = "#7d4ebf", celeste = "#45dbe6", rosado = "#e241e8";

            switch (comboBox1.SelectedIndex)
            {
                case 0:
                    BackColor = ColorTranslator.FromHtml(morado);
                    break;
                case 1:
                    BackColor = ColorTranslator.FromHtml(celeste);
                    break;
                case 2:
                    BackColor = ColorTranslator.FromHtml(rosado);
                    break;
            }
        }
    }
}