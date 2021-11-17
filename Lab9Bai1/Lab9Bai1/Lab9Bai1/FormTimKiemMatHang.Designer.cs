namespace Lab9Bai1
{
    partial class FormTimKiemMatHang
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
            this.MaMH = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.TenMH = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.DVT = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.grTieuChi = new System.Windows.Forms.GroupBox();
            this.btnThoat = new System.Windows.Forms.Button();
            this.radTenMH = new System.Windows.Forms.RadioButton();
            this.label3 = new System.Windows.Forms.Label();
            this.btnTim = new System.Windows.Forms.Button();
            this.txtNoiDungTimKiem = new System.Windows.Forms.TextBox();
            this.radMaMH = new System.Windows.Forms.RadioButton();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.grKetQua.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewKetQuaTimKiem)).BeginInit();
            this.grTieuChi.SuspendLayout();
            this.SuspendLayout();
            // 
            // grKetQua
            // 
            this.grKetQua.Controls.Add(this.dataGridViewKetQuaTimKiem);
            this.grKetQua.Location = new System.Drawing.Point(5, 287);
            this.grKetQua.Name = "grKetQua";
            this.grKetQua.Size = new System.Drawing.Size(684, 187);
            this.grKetQua.TabIndex = 8;
            this.grKetQua.TabStop = false;
            this.grKetQua.Text = "Kết quả tìm kiếm";
            // 
            // dataGridViewKetQuaTimKiem
            // 
            this.dataGridViewKetQuaTimKiem.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridViewKetQuaTimKiem.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewKetQuaTimKiem.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.MaMH,
            this.TenMH,
            this.DVT});
            this.dataGridViewKetQuaTimKiem.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewKetQuaTimKiem.Location = new System.Drawing.Point(3, 31);
            this.dataGridViewKetQuaTimKiem.Name = "dataGridViewKetQuaTimKiem";
            this.dataGridViewKetQuaTimKiem.RowHeadersWidth = 82;
            this.dataGridViewKetQuaTimKiem.Size = new System.Drawing.Size(678, 153);
            this.dataGridViewKetQuaTimKiem.TabIndex = 0;
            // 
            // MaMH
            // 
            this.MaMH.HeaderText = "Mã MH";
            this.MaMH.MinimumWidth = 10;
            this.MaMH.Name = "MaMH";
            // 
            // TenMH
            // 
            this.TenMH.HeaderText = "Tên Mặt Hàng";
            this.TenMH.MinimumWidth = 10;
            this.TenMH.Name = "TenMH";
            // 
            // DVT
            // 
            this.DVT.HeaderText = "Đơn Vị Tính";
            this.DVT.MinimumWidth = 10;
            this.DVT.Name = "DVT";
            // 
            // grTieuChi
            // 
            this.grTieuChi.Controls.Add(this.btnThoat);
            this.grTieuChi.Controls.Add(this.radTenMH);
            this.grTieuChi.Controls.Add(this.label3);
            this.grTieuChi.Controls.Add(this.btnTim);
            this.grTieuChi.Controls.Add(this.txtNoiDungTimKiem);
            this.grTieuChi.Controls.Add(this.radMaMH);
            this.grTieuChi.Controls.Add(this.label2);
            this.grTieuChi.Location = new System.Drawing.Point(12, 67);
            this.grTieuChi.Name = "grTieuChi";
            this.grTieuChi.Size = new System.Drawing.Size(674, 214);
            this.grTieuChi.TabIndex = 7;
            this.grTieuChi.TabStop = false;
            this.grTieuChi.Text = "Tiêu chí tìm kiếm";
            // 
            // btnThoat
            // 
            this.btnThoat.Location = new System.Drawing.Point(479, 167);
            this.btnThoat.Name = "btnThoat";
            this.btnThoat.Size = new System.Drawing.Size(89, 41);
            this.btnThoat.TabIndex = 7;
            this.btnThoat.Text = "Thoát";
            this.btnThoat.UseVisualStyleBackColor = true;
            // 
            // radTenMH
            // 
            this.radTenMH.AutoSize = true;
            this.radTenMH.Location = new System.Drawing.Point(438, 31);
            this.radTenMH.Name = "radTenMH";
            this.radTenMH.Size = new System.Drawing.Size(130, 33);
            this.radTenMH.TabIndex = 5;
            this.radTenMH.TabStop = true;
            this.radTenMH.Text = "Tên MH";
            this.radTenMH.UseVisualStyleBackColor = true;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(6, 100);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(207, 29);
            this.label3.TabIndex = 4;
            this.label3.Text = "Nội dung tim kiếm";
            // 
            // btnTim
            // 
            this.btnTim.Location = new System.Drawing.Point(274, 167);
            this.btnTim.Name = "btnTim";
            this.btnTim.Size = new System.Drawing.Size(106, 41);
            this.btnTim.TabIndex = 3;
            this.btnTim.Text = "Tìm";
            this.btnTim.UseVisualStyleBackColor = true;
            // 
            // txtNoiDungTimKiem
            // 
            this.txtNoiDungTimKiem.Location = new System.Drawing.Point(239, 94);
            this.txtNoiDungTimKiem.Name = "txtNoiDungTimKiem";
            this.txtNoiDungTimKiem.Size = new System.Drawing.Size(329, 35);
            this.txtNoiDungTimKiem.TabIndex = 2;
            // 
            // radMaMH
            // 
            this.radMaMH.AutoSize = true;
            this.radMaMH.Location = new System.Drawing.Point(239, 31);
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
            this.label2.Location = new System.Drawing.Point(0, 44);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(108, 29);
            this.label2.TabIndex = 0;
            this.label2.Text = "Tìm theo";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(106, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(519, 55);
            this.label1.TabIndex = 6;
            this.label1.Text = "TÌM KIẾM MẶT HÀNG";
            // 
            // FormTimKiemMatHang
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(14F, 29F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(723, 521);
            this.Controls.Add(this.grKetQua);
            this.Controls.Add(this.grTieuChi);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Microsoft Sans Serif", 9F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.Name = "FormTimKiemMatHang";
            this.Text = "FormTimKiemMatHang";
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
        private System.Windows.Forms.RadioButton radTenMH;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button btnTim;
        private System.Windows.Forms.TextBox txtNoiDungTimKiem;
        private System.Windows.Forms.RadioButton radMaMH;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DataGridViewTextBoxColumn MaMH;
        private System.Windows.Forms.DataGridViewTextBoxColumn TenMH;
        private System.Windows.Forms.DataGridViewTextBoxColumn DVT;
    }
}