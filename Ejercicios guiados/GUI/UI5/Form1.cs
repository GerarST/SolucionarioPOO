using System;
using System.Collections.Generic;
using System.Data;
using System.Windows.Forms;

namespace UI5
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            var players = new List<string>();
            var dt = ConnectionDB.ExecuteQuery(
                "SELECT nickname FROM player"
            );

            players.Add("");
            foreach (DataRow row in dt.Rows)
            {
                players.Add(row[0].ToString());
            }

            comboBox1.DataSource = players;
        }
    }
}