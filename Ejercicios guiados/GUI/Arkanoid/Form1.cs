using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Arkanoid
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void keyPressed(object sender, KeyEventArgs e)
        {
            int increment = 10;
            switch (e.KeyCode)
            {
                case Keys.Left:
                    pictureBox1.Left -= increment;
                    break;
                case Keys.Right:
                    pictureBox1.Left += increment;
                    break;
            }
        }
    }
}