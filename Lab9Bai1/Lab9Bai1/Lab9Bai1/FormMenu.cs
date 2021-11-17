using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab9Bai1
{
    public partial class FormMenu : Form
    {
        public FormMenu()
        {
            InitializeComponent();
        }

        private void thôngTinBánHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormKhachHang formKhachHang = new FormKhachHang();
            formKhachHang.MdiParent = this;
            formKhachHang.Show();
        }

        private void thôngTinMặtHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormMatHang formMatHang = new FormMatHang();
            formMatHang.MdiParent = this;
            formMatHang.Show();
        }

        private void chiTiếtBánHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormBanHang formBanHang = new FormBanHang();
            formBanHang.MdiParent = this;
            formBanHang.Show();
        }

        private void thoátToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void tìmKiếmKháchHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormTimKiemKhachHang formTimKiemKhachHang = new FormTimKiemKhachHang();
            formTimKiemKhachHang.MdiParent = this;
            formTimKiemKhachHang.Show();
        }

        private void tìmKiếmMặtHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormTimKiemMatHang formTimKiemMatHang = new FormTimKiemMatHang();
            formTimKiemMatHang.MdiParent = this;
            formTimKiemMatHang.Show();
        }

        private void tìmKiếmBánHàngToolStripMenuItem_Click(object sender, EventArgs e)
        {
            FormTimKiemBanHang formTimKiemBanHang = new FormTimKiemBanHang();
            formTimKiemBanHang.MdiParent = this;
            formTimKiemBanHang.Show();
        }

        private void FormMenu_Load(object sender, EventArgs e)
        {

        }
    }
}
