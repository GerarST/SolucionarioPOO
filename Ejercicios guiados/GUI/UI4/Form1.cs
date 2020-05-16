using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UI4
{
    public partial class Form1 : Form
    {
        private UserControl current;
        private Register rg = new Register();

        public Form1()
        {
            InitializeComponent();
            current = login1;
        }
        
        protected override CreateParams CreateParams {
            get {
                CreateParams cp = base.CreateParams;
                cp.ExStyle |= 0x02000000;  // Turn on WS_EX_COMPOSITED
                return cp;
            }
        } 

        private void button1_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            tableLayoutPanel1.Controls.Add(login1, 1, 0);
            current = login1;
            tableLayoutPanel1.SetRowSpan(current, 4);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            tableLayoutPanel1.Controls.Remove(current);
            tableLayoutPanel1.Controls.Add(rg, 1, 0);
            current = rg;
            tableLayoutPanel1.SetRowSpan(current, 4);
        }
    }
}