namespace Lab9Bai1
{
    partial class FormMatHang
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
            this.grThongTin = new System.Windows.Forms.GroupBox();
            this.txtMaMatHang = new System.Windows.Forms.TextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.btnThoat = new System.Windows.Forms.Button();
            this.btnTimKiem = new System.Windows.Forms.Button();
            this.btnSua = new System.Windows.Forms.Button();
            this.btnXoa = new System.Windows.Forms.Button();
            this.btnThem = new System.Windows.Forms.Button();
            this.txtDonViTinh = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.txtTenMatHang = new System.Windows.Forms.TextBox();
            this.label3 = new System.Windows.Forms.Label();
            this.grDanhSach = new System.Windows.Forms.GroupBox();
            this.dataGridViewMatHang = new System.Windows.Forms.DataGridView();
            this.MaMatHang = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.TenMatHang = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DVT = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.grThongTin.SuspendLayout();
            this.grDanhSach.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewMatHang)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(117, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(571, 55);
            this.label1.TabIndex = 1;
            this.label1.Text = "THÔNG TIN MẶT HÀNG";
            this.label1.Click += new System.EventHandler(this.label1_Click);
            // 
            // grThongTin
            // 
            this.grThongTin.Controls.Add(this.txtMaMatHang);
            this.grThongTin.Controls.Add(this.label2);
            this.grThongTin.Location = new System.Drawing.Point(14, 60);
            this.grThongTin.Name = "grThongTin";
            this.grThongTin.Size = new System.Drawing.Size(486, 116);
            this.grThongTin.TabIndex = 2;
            this.grThongTin.TabStop = false;
            this.grThongTin.Text = "Thông tin chi tiết mặt hàng";
            // 
            // txtMaMatHang
            // 
            this.txtMaMatHang.Location = new System.Drawing.Point(173, 34);
            this.txtMaMatHang.Name = "txtMaMatHang";
            this.txtMaMatHang.Size = new System.Drawing.Size(226, 35);
            this.txtMaMatHang.TabIndex = 1;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(-2, 40);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(150, 29);
            this.label2.TabIndex = 0;
            this.label2.Text = "Mã mặt hàng";
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(577, 160);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(111, 46);
            this.btnThoat.TabIndex = 10;
            this.btnThoat.Text = "Thoát";
            this.btnThoat.UseVisualStyleBackColor = true;
            // 
            // btnTimKiem
            // 
            this.btnTimKiem.Location = new System.Drawing.Point(577, 89);
            this.btnTimKiem.Name = "btnTimKiem";
            this.btnTimKiem.Size = new System.Drawing.Size(111, 40);
            this.btnTimKiem.TabIndex = 9;
            this.btnTimKiem.Text = "Tìm kiếm";
            this.btnTimKiem.UseVisualStyleBackColor = true;
            // 
            // btnSua
            // 
            this.btnSua.Location = new System.Drawing.Point(459, 168);
            this.btnSua.Name = "btnSua";
            this.btnSua.Size = new System.Drawing.Size(88, 38);
            this.btnSua.TabIndex = 8;
            this.btnSua.Text = "Sửa";
            this.btnSua.UseVisualStyleBackColor = true;
            // 
            // btnXoa
            // 
            this.btnXoa.Location = new System.Drawing.Point(459, 227);
            this.btnXoa.Name = "btnXoa";
            this.btnXoa.Size = new System.Drawing.Size(88, 46);
            this.btnXoa.TabIndex = 7;
            this.btnXoa.Text = "Xóa";
            this.btnXoa.UseVisualStyleBackColor = true;
            // 
            // btnThem
            // 
            this.btnThem.Location = new System.Drawing.Point(459, 89);
            this.btnThem.Name = "btnThem";
            this.btnThem.Size = new System.Drawing.Size(88, 40);
            this.btnThem.TabIndex = 6;
            this.btnThem.Text = "Thêm";
            this.btnThem.UseVisualStyleBackColor = true;
            // 
            // txtDonViTinh
            // 
            this.txtDonViTinh.Location = new System.Drawing.Point(187, 224);
            this.txtDonViTinh.Name = "txtDonViTinh";
            this.txtDonViTinh.Size = new System.Drawing.Size(226, 35);
            this.txtDonViTinh.TabIndex = 5;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(12, 227);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(124, 29);
            this.label4.TabIndex = 4;
            this.label4.Text = "Đơn vị tính";
            // 
            // txtTenMatHang
            // 
            this.txtTenMatHang.Location = new System.Drawing.Point(187, 160);
            this.txtTenMatHang.Name = "txtTenMatHang";
            this.txtTenMatHang.Size = new System.Drawing.Size(226, 35);
            this.txtTenMatHang.TabIndex = 3;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(9, 166);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(160, 29);
            this.label3.TabIndex = 2;
            this.label3.Text = "Tên mặt hàng";
            // 
            // grDanhSach
            // 
            this.grDanhSach.Controls.Add(this.dataGridViewMatHang);
            this.grDanhSach.Location = new System.Drawing.Point(25, 286);
            this.grDanhSach.Name = "grDanhSach";
            this.grDanhSach.Size = new System.Drawing.Size(617, 186);
            this.grDanhSach.TabIndex = 3;
            this.grDanhSach.TabStop = false;
            this.grDanhSach.Text = "Danh sách mặt hàng";
            // 
            // dataGridViewMatHang
            // 
            this.dataGridViewMatHang.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridViewMatHang.BackgroundColor = System.Drawing.Color.White;
            this.dataGridViewMatHang.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewMatHang.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.MaMatHang,
            this.TenMatHang,
            this.DVT});
            this.dataGridViewMatHang.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewMatHang.Location = new System.Drawing.Point(3, 31);
            this.dataGridViewMatHang.Name = "dataGridViewMatHang";
            this.dataGridViewMatHang.RowHeadersWidth = 82;
            this.dataGridViewMatHang.Size = new System.Drawing.Size(611, 152);
            this.dataGridViewMatHang.TabIndex = 0;
            // 
            // MaMatHang
            // 
            this.MaMatHang.HeaderText = "Mã Mặt Hàng";
            this.MaMatHang.MinimumWidth = 10;
            this.MaMatHang.Name = "MaMatHang";
            // 
            // TenMatHang
            // 
            this.TenMatHang.HeaderText = "Tên Mặt Hàng";
            this.TenMatHang.MinimumWidth = 10;
            this.TenMatHang.Name = "TenMatHang";
            // 
            // DVT
            // 
            this.DVT.HeaderText = "Đơn Vị Tính";
            this.DVT.MinimumWidth = 10;
            this.DVT.Name = "DVT";
            // 
            // FormMatHang
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(14F, 29F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(814, 484);
            this.Controls.Add(this.btnThem);
            this.Controls.Add(this.btnTimKiem);
            this.Controls.Add(this.btnSua);
            this.Controls.Add(this.btnThoat);
            this.Controls.Add(this.btnXoa);
            this.Controls.Add(this.txtTenMatHang);
            this.Controls.Add(this.grDanhSach);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.grThongTin);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.txtDonViTinh);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Name = "FormMatHang";
            this.Text = "FormMatHang";
            this.grThongTin.ResumeLayout(false);
            this.grThongTin.PerformLayout();
            this.grDanhSach.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewMatHang)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox grThongTin;
        private System.Windows.Forms.Button btnThoat;
        private System.Windows.Forms.Button btnTimKiem;
        private System.Windows.Forms.Button btnSua;
        private System.Windows.Forms.Button btnXoa;
        private System.Windows.Forms.Button btnThem;
        private System.Windows.Forms.TextBox txtDonViTinh;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtTenMatHang;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox txtMaMatHang;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.GroupBox grDanhSach;
        private System.Windows.Forms.DataGridView dataGridViewMatHang;
        private System.Windows.Forms.DataGridViewTextBoxColumn MaMatHang;
        private System.Windows.Forms.DataGridViewTextBoxColumn TenMatHang;
        private System.Windows.Forms.DataGridViewTextBoxColumn DVT;
    }
}