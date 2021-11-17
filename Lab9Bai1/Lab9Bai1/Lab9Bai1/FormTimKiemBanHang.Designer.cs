namespace Lab9Bai1
{
    partial class FormTimKiemBanHang
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
            this.grKetQua = new System.Windows.Forms.GroupBox();
            this.dataGridViewKetQuaTimKiem = new System.Windows.Forms.DataGridView();
            this.STT = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.MaHH = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.SoLuong = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DonGia = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.ThanhTien = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.grTieuChi = new System.Windows.Forms.GroupBox();
            this.txtNoiDungTimKiem = new System.Windows.Forms.TextBox();
            this.radMaMH = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.btnThoat = new System.Windows.Forms.Button();
            this.label3 = new System.Windows.Forms.Label();
            this.btnTim = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.grKetQua.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewKetQuaTimKiem)).BeginInit();
            this.grTieuChi.SuspendLayout();
            this.SuspendLayout();
            // 
            // grKetQua
            // 
            this.grKetQua.Controls.Add(this.dataGridViewKetQuaTimKiem);
            this.grKetQua.Location = new System.Drawing.Point(14, 301);
            this.grKetQua.Name = "grKetQua";
            this.grKetQua.Size = new System.Drawing.Size(625, 180);
            this.grKetQua.TabIndex = 8;
            this.grKetQua.TabStop = false;
            this.grKetQua.Text = "Kết quả tìm kiếm";
            // 
            // dataGridViewKetQuaTimKiem
            // 
            this.dataGridViewKetQuaTimKiem.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridViewKetQuaTimKiem.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewKetQuaTimKiem.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.STT,
            this.MaHH,
            this.SoLuong,
            this.DonGia,
            this.ThanhTien});
            this.dataGridViewKetQuaTimKiem.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewKetQuaTimKiem.Location = new System.Drawing.Point(3, 31);
            this.dataGridViewKetQuaTimKiem.Name = "dataGridViewKetQuaTimKiem";
            this.dataGridViewKetQuaTimKiem.RowHeadersWidth = 82;
            this.dataGridViewKetQuaTimKiem.Size = new System.Drawing.Size(619, 146);
            this.dataGridViewKetQuaTimKiem.TabIndex = 0;
            // 
            // STT
            // 
            this.STT.HeaderText = "STT";
            this.STT.MinimumWidth = 10;
            this.STT.Name = "STT";
            // 
            // MaHH
            // 
            this.MaHH.HeaderText = "Mã Hàng Hóa";
            this.MaHH.MinimumWidth = 10;
            this.MaHH.Name = "MaHH";
            // 
            // SoLuong
            // 
            this.SoLuong.HeaderText = "Số Lượng";
            this.SoLuong.MinimumWidth = 10;
            this.SoLuong.Name = "SoLuong";
            // 
            // DonGia
            // 
            this.DonGia.HeaderText = "Đơn Giá";
            this.DonGia.MinimumWidth = 10;
            this.DonGia.Name = "DonGia";
            // 
            // ThanhTien
            // 
            this.ThanhTien.HeaderText = "Thành Tiền";
            this.ThanhTien.MinimumWidth = 10;
            this.ThanhTien.Name = "ThanhTien";
            // 
            // grTieuChi
            // 
            this.grTieuChi.Controls.Add(this.txtNoiDungTimKiem);
            this.grTieuChi.Controls.Add(this.radMaMH);
            this.grTieuChi.Controls.Add(this.label2);
            this.grTieuChi.Location = new System.Drawing.Point(14, 54);
            this.grTieuChi.Name = "grTieuChi";
            this.grTieuChi.Size = new System.Drawing.Size(652, 198);
            this.grTieuChi.TabIndex = 7;
            this.grTieuChi.TabStop = false;
            this.grTieuChi.Text = "Thông tin tìm kiếm";
            // 
            // txtNoiDungTimKiem
            // 
            this.txtNoiDungTimKiem.Location = new System.Drawing.Point(224, 138);
            this.txtNoiDungTimKiem.Name = "txtNoiDungTimKiem";
            this.txtNoiDungTimKiem.Size = new System.Drawing.Size(364, 35);
            this.txtNoiDungTimKiem.TabIndex = 2;
            this.txtNoiDungTimKiem.TextChanged += new System.EventHandler(this.txtNoiDungTimKiem_TextChanged);
            // 
            // radMaMH
            // 
            this.radMaMH.AutoSize = true;
            this.radMaMH.Location = new System.Drawing.Point(224, 67);
            this.radMaMH.Name = "radMaMH";
            this.radMaMH.Size = new System.Drawing.Size(120, 33);
            this.radMaMH.TabIndex = 1;
            this.radMaMH.TabStop = true;
            this.radMaMH.Text = "Mã MH";
            this.radMaMH.UseVisualStyleBackColor = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(21, 67);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(108, 29);
            this.label2.TabIndex = 0;
            this.label2.Text = "Tìm theo";
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(504, 258);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(98, 37);
            this.btnThoat.TabIndex = 7;
            this.btnThoat.Text = "Thoát";
            this.btnThoat.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 192);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(207, 29);
            this.label3.TabIndex = 4;
            this.label3.Text = "Nội dung tim kiếm";
            // 
            // btnTim
            // 
            this.btnTim.Location = new System.Drawing.Point(256, 258);
            this.btnTim.Name = "btnTim";
            this.btnTim.Size = new System.Drawing.Size(96, 37);
            this.btnTim.TabIndex = 3;
            this.btnTim.Text = "Tìm";
            this.btnTim.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(202, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(517, 55);
            this.label1.TabIndex = 6;
            this.label1.Text = "TÌM KIẾM BÁN HÀNG";
            // 
            // FormTimKiemBanHang
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(14F, 29F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(750, 512);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.btnThoat);
            this.Controls.Add(this.grKetQua);
            this.Controls.Add(this.grTieuChi);
            this.Controls.Add(this.btnTim);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Name = "FormTimKiemBanHang";
            this.Text = "FormTimKiemBanHangcs";
            this.grKetQua.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewKetQuaTimKiem)).EndInit();
            this.grTieuChi.ResumeLayout(false);
            this.grTieuChi.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.GroupBox grKetQua;
        private System.Windows.Forms.DataGridView dataGridViewKetQuaTimKiem;
        private System.Windows.Forms.GroupBox grTieuChi;
        private System.Windows.Forms.Button btnThoat;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnTim;
        private System.Windows.Forms.TextBox txtNoiDungTimKiem;
        private System.Windows.Forms.RadioButton radMaMH;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridViewTextBoxColumn STT;
        private System.Windows.Forms.DataGridViewTextBoxColumn MaHH;
        private System.Windows.Forms.DataGridViewTextBoxColumn SoLuong;
        private System.Windows.Forms.DataGridViewTextBoxColumn DonGia;
        private System.Windows.Forms.DataGridViewTextBoxColumn ThanhTien;
    }
}