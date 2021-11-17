namespace Lab9Bai1
{
    partial class FormTimKiemKhachHang
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.grTieuChi = new System.Windows.Forms.GroupBox();
            this.btnThoat = new System.Windows.Forms.Button();
            this.radSDT = new System.Windows.Forms.RadioButton();
            this.radTenKH = new System.Windows.Forms.RadioButton();
            this.label3 = new System.Windows.Forms.Label();
            this.btnTim = new System.Windows.Forms.Button();
            this.txtNoiDungTimKiem = new System.Windows.Forms.TextBox();
            this.radMaKH = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.grKetQua = new System.Windows.Forms.GroupBox();
            this.dataGridViewKetQuaTimKiem = new System.Windows.Forms.DataGridView();
            this.MaKH = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.HoTen = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.GioiTinh = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.SDT = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DiaChi = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.grTieuChi.SuspendLayout();
            this.grKetQua.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewKetQuaTimKiem)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(167, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(589, 55);
            this.label1.TabIndex = 3;
            this.label1.Text = "TÌM KIẾM KHÁCH HÀNG";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // grTieuChi
            // 
            this.grTieuChi.Controls.Add(this.btnThoat);
            this.grTieuChi.Controls.Add(this.radSDT);
            this.grTieuChi.Controls.Add(this.radTenKH);
            this.grTieuChi.Controls.Add(this.label3);
            this.grTieuChi.Controls.Add(this.btnTim);
            this.grTieuChi.Controls.Add(this.txtNoiDungTimKiem);
            this.grTieuChi.Controls.Add(this.radMaKH);
            this.grTieuChi.Controls.Add(this.label2);
            this.grTieuChi.Location = new System.Drawing.Point(15, 67);
            this.grTieuChi.Name = "grTieuChi";
            this.grTieuChi.Size = new System.Drawing.Size(764, 218);
            this.grTieuChi.TabIndex = 4;
            this.grTieuChi.TabStop = false;
            this.grTieuChi.Text = "Tiêu chí tìm kiếm";
            this.grTieuChi.Enter += new System.EventHandler(this.grTieuChi_Enter);
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(532, 147);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(117, 37);
            this.btnThoat.TabIndex = 7;
            this.btnThoat.Text = "Thoát";
            this.btnThoat.UseVisualStyleBackColor = true;
            // 
            // radSDT
            // 
            this.radSDT.AutoSize = true;
            this.radSDT.Location = new System.Drawing.Point(599, 34);
            this.radSDT.Name = "radSDT";
            this.radSDT.Size = new System.Drawing.Size(93, 33);
            this.radSDT.TabIndex = 6;
            this.radSDT.TabStop = true;
            this.radSDT.Text = "SĐT";
            this.radSDT.UseVisualStyleBackColor = true;
            // 
            // radTenKH
            // 
            this.radTenKH.AutoSize = true;
            this.radTenKH.Location = new System.Drawing.Point(407, 33);
            this.radTenKH.Name = "radTenKH";
            this.radTenKH.Size = new System.Drawing.Size(126, 33);
            this.radTenKH.TabIndex = 5;
            this.radTenKH.TabStop = true;
            this.radTenKH.Text = "Tên KH";
            this.radTenKH.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(-8, 94);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(207, 29);
            this.label3.TabIndex = 4;
            this.label3.Text = "Nội dung tim kiếm";
            // 
            // btnTim
            // 
            this.btnTim.Location = new System.Drawing.Point(265, 147);
            this.btnTim.Name = "btnTim";
            this.btnTim.Size = new System.Drawing.Size(100, 39);
            this.btnTim.TabIndex = 3;
            this.btnTim.Text = "Tìm";
            this.btnTim.UseVisualStyleBackColor = true;
            // 
            // txtNoiDungTimKiem
            // 
            this.txtNoiDungTimKiem.Location = new System.Drawing.Point(242, 88);
            this.txtNoiDungTimKiem.Name = "txtNoiDungTimKiem";
            this.txtNoiDungTimKiem.Size = new System.Drawing.Size(450, 35);
            this.txtNoiDungTimKiem.TabIndex = 2;
            // 
            // radMaKH
            // 
            this.radMaKH.AutoSize = true;
            this.radMaKH.Location = new System.Drawing.Point(242, 31);
            this.radMaKH.Name = "radMaKH";
            this.radMaKH.Size = new System.Drawing.Size(116, 33);
            this.radMaKH.TabIndex = 1;
            this.radMaKH.TabStop = true;
            this.radMaKH.Text = "Mã KH";
            this.radMaKH.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(-3, 33);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(108, 29);
            this.label2.TabIndex = 0;
            this.label2.Text = "Tìm theo";
            // 
            // grKetQua
            // 
            this.grKetQua.Controls.Add(this.dataGridViewKetQuaTimKiem);
            this.grKetQua.Location = new System.Drawing.Point(12, 291);
            this.grKetQua.Name = "grKetQua";
            this.grKetQua.Size = new System.Drawing.Size(781, 213);
            this.grKetQua.TabIndex = 5;
            this.grKetQua.TabStop = false;
            this.grKetQua.Text = "Kết quả tìm kiếm";
            // 
            // dataGridViewKetQuaTimKiem
            // 
            this.dataGridViewKetQuaTimKiem.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridViewKetQuaTimKiem.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewKetQuaTimKiem.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.MaKH,
            this.HoTen,
            this.GioiTinh,
            this.SDT,
            this.DiaChi});
            this.dataGridViewKetQuaTimKiem.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewKetQuaTimKiem.Location = new System.Drawing.Point(3, 31);
            this.dataGridViewKetQuaTimKiem.Name = "dataGridViewKetQuaTimKiem";
            this.dataGridViewKetQuaTimKiem.RowHeadersWidth = 82;
            this.dataGridViewKetQuaTimKiem.Size = new System.Drawing.Size(775, 179);
            this.dataGridViewKetQuaTimKiem.TabIndex = 0;
            this.dataGridViewKetQuaTimKiem.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridViewKetQuaTimKiem_CellContentClick);
            // 
            // MaKH
            // 
            this.MaKH.HeaderText = "Mã KH";
            this.MaKH.MinimumWidth = 10;
            this.MaKH.Name = "MaKH";
            // 
            // HoTen
            // 
            this.HoTen.HeaderText = "Họ Tên";
            this.HoTen.MinimumWidth = 10;
            this.HoTen.Name = "HoTen";
            // 
            // GioiTinh
            // 
            this.GioiTinh.HeaderText = "Giới tính";
            this.GioiTinh.MinimumWidth = 10;
            this.GioiTinh.Name = "GioiTinh";
            // 
            // SDT
            // 
            this.SDT.HeaderText = "Số Điện Thoại";
            this.SDT.MinimumWidth = 10;
            this.SDT.Name = "SDT";
            // 
            // DiaChi
            // 
            this.DiaChi.HeaderText = "Địa Chỉ";
            this.DiaChi.MinimumWidth = 10;
            this.DiaChi.Name = "DiaChi";
            // 
            // FormTimKiemKhachHang
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(14F, 29F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(931, 609);
            this.Controls.Add(this.grKetQua);
            this.Controls.Add(this.grTieuChi);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Name = "FormTimKiemKhachHang";
            this.Text = "FormTimKiemKhachHang";
            this.grTieuChi.ResumeLayout(false);
            this.grTieuChi.PerformLayout();
            this.grKetQua.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewKetQuaTimKiem)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox grTieuChi;
        private System.Windows.Forms.Button btnThoat;
        private System.Windows.Forms.RadioButton radSDT;
        private System.Windows.Forms.RadioButton radTenKH;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnTim;
        private System.Windows.Forms.TextBox txtNoiDungTimKiem;
        private System.Windows.Forms.RadioButton radMaKH;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.GroupBox grKetQua;
        private System.Windows.Forms.DataGridView dataGridViewKetQuaTimKiem;
        private System.Windows.Forms.DataGridViewTextBoxColumn MaKH;
        private System.Windows.Forms.DataGridViewTextBoxColumn HoTen;
        private System.Windows.Forms.DataGridViewTextBoxColumn GioiTinh;
        private System.Windows.Forms.DataGridViewTextBoxColumn SDT;
        private System.Windows.Forms.DataGridViewTextBoxColumn DiaChi;
    }
}