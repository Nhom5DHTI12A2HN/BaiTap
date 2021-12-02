/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab2.bai2.qlsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLSP extends javax.swing.JFrame {

    private List<Products> list = new ArrayList<>();
    private DefaultTableModel model;
    private String[] collumHeaders = new String[]{"Mã sản phẩm ", "Tên SP", "Số lượng", "Giá bán "};

    public QLSP() {
        initComponents();
        initData();
        initTable();
    }

    public void initData() {
        list.add(new Products("TP1", "Sữa", 10, 500));
        list.add(new Products("TP2", "Bánh", 10, 20000));
    }

    private void initTable() {
        model = new DefaultTableModel();
        model.setColumnIdentifiers(collumHeaders);

        list.forEach(item -> {
            model.addRow(new Object[]{item.getID(), item.getName(), item.getSoluong(), item.getGiaSP()});
        });
        tbProducts.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        MaHH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cbxItem = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("List of Product"));

        tbProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbProductsMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbProducts);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        MaHH.setText("Mã HH");

        jLabel2.setText("Tên HH");

        jLabel3.setText("Số Lượng");

        jLabel4.setText("Giá ");

        txtSL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSLActionPerformed(evt);
            }
        });

        btnReset.setText("THêm Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSearch.setText("Tìm kiếm theo ID");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSort.setText("sắp xếp theo ");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu dữ liệu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cbxItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Price", "SL" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(MaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtID)
                    .addComponent(txtName)
                    .addComponent(txtSL, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(txtGia))
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbxItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaHH, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSort)
                            .addComponent(cbxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSLActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Mời nhập id cần tìm");

        } else {
            for (Products sp : list) {
                if (sp.getID().equals(txtSearch.getText()) ) {
                    txtID.setText(sp.getID());
                    txtName.setText(sp.getName());
                    txtSL.setText("" + sp.getSoluong());
                    txtGia.setText("" + sp.getGiaSP());
                }
                
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtID.setText("");
        txtName.setText("");
        txtSL.setText("");
        txtGia.setText("");
        btnSave.setText("Save");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            StringBuilder error = new StringBuilder();
            if (txtID.getText().equals("")) {
                error.append("ID k được để trống ");
            }
            if (txtName.getText().equals("")) {
                error.append("Name k được để trống ");
            }

            if (txtSL.getText().equals("")) {
                error.append("Số lượng k được để trống ");
            }
            if (txtGia.getText().equals("")) {
                error.append("Giá k được để trống ");
            }
            if (!error.isEmpty()) {
                JOptionPane.showMessageDialog(this, error.toString());
                return;
            }

            boolean isExisted = false;
            Products products = new Products();
            products.setID(txtID.getText());
            products.setName(txtName.getText());
            products.setSoluong(Integer.parseInt(txtSL.getText()));
            products.setGiaSP(Double.parseDouble(txtGia.getText()));

            if (btnSave.getText().equals("update")) {
                for (Products sp : list) {
                    if (sp.getID().equals(txtID.getText())) {
                        
                        sp.setName(txtName.getText());
                        sp.setSoluong(Integer.parseInt(txtSL.getText()));
                        sp.setGiaSP(Double.parseDouble(txtGia.getText()));
                    }
                    else{
                      JOptionPane.showMessageDialog(this, "bạn không thể thay đổi ID");
                      break;

                        }
                }
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Products pro = list.get(i);
                    if (pro.getID().equals(products.getID())) {
                        list.set(i, products);
                        isExisted = true;

                        break;
                    }

                }

                if (!isExisted) {
                    list.add(products);
                    JOptionPane.showMessageDialog(this, "Lưu thành công");
                    txtID.setText("");
                    txtName.setText("");
                    txtSL.setText("");
                    txtGia.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Id đã tồn tại. Mời nhập lại ");
                }
            }

            model.setRowCount(0);
            list.forEach(item -> {
                model.addRow(new Object[]{item.getID(), item.getName(), item.getSoluong(), item.getGiaSP()});
            });
            model.fireTableDataChanged();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tbProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProductsMousePressed
        int selectedRow = tbProducts.getSelectedRow();

        if (selectedRow >= 0) {
            Products products = list.get(selectedRow);
            txtID.setText(products.getID());
            txtName.setText(products.getName());
            txtSL.setText("" + products.getSoluong());
            txtGia.setText("" + products.getGiaSP());
            btnSave.setText("update");
        }
    }//GEN-LAST:event_tbProductsMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        try {
            if (txtID.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Mời nhập vào ID cần xóa");
                return;
            } else {
                if (JOptionPane.showConfirmDialog(this, "bạn có muốn xóa sản phẩm có id :" + txtID.getText(),
                        "thông báo ", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                    return;
                }
                boolean isDeleteted = false;
                for (int i = 0; i < list.size(); i++) {
                    Products item = list.get(i);
                    if (item.getID().equals(txtID.getText())) {
                        list.remove(i);
                        isDeleteted = true;
                        break;
                    }

                }
                if (isDeleteted) {
                    model.setRowCount(0);
                    list.forEach(item -> {
                        model.addRow(new Object[]{item.getID(), item.getName(), item.getSoluong(), item.getGiaSP()});
                    });

                    model.fireTableDataChanged();
                    JOptionPane.showMessageDialog(this, "đã xóa thành công");

                } else {
                    JOptionPane.showMessageDialog(this, "Sản phẩm cân xóa không tồn tại");
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error :" + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
            model.setRowCount(0);
            list.forEach(item -> {
            model.addRow(new Object[]{item.getID(), item.getName(), item.getSoluong(), item.getGiaSP()});
            });
            
        String selectedItem = (String) cbxItem.getSelectedItem();
        
        if (selectedItem.equals("Name")) {
             Collections.sort(list, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
               return  o1.getName().compareTo(o2.getName());
            }
        });
              model.fireTableDataChanged();
        }
        else if(selectedItem.equals("Price")) {
            Collections.sort(list, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
               return  o1.getGiaSP()>(o2.getGiaSP()) ? 1: -1;
            }
        });
              model.fireTableDataChanged(); 
        }
        else{
            Collections.sort(list, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
               return  o1.getSoluong()>(o2.getSoluong()) ? 1: -1;
            }
        });
              model.fireTableDataChanged(); 
        }
        
        
       model.fireTableDataChanged(); 
       
    }//GEN-LAST:event_btnSortActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaHH;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> cbxItem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProducts;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
