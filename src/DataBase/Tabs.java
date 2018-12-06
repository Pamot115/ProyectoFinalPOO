package DataBase;

import java.io.*;
import javax.swing.JOptionPane;

public class Tabs extends javax.swing.JFrame implements Serializable {
    PersistenciaUsuario p = new PersistenciaUsuario("Usuarios");
    int Pos=0;
    
    public Tabs() throws Exception {
        
        initComponents();
        //Se desactivan los campos que no deben modificarse
        IDBoxS.setEnabled(false);
        NameBoxS.setEnabled(false);
        AgeBoxS.setEnabled(false);
        SalaryBoxS.setEnabled(false);
        Tabs.setEnabledAt(2,false);
        IDBoxA.setEnabled(false);
        IDBoxE.setEnabled(false);        
        PrevBut.setEnabled(false);
        //Se comprueba si existe una base de datos previa, en caso de que no, se crea  una  nueva
        if(!p.f.exists()){
            p.f.createNewFile();
            Tabs.setSelectedIndex(1);
        }
        else {
            p.leerTodos();
        }
        //Si la DB no está vacía, se cargan los datos del primer usuario
        if(!p.Users.isEmpty()){
           AgeBoxS.setText(String.valueOf(p.leerTodos().get(Pos).getAge()));
           NameBoxS.setText(p.leerTodos().get(Pos).getName());
           SalaryBoxS.setText(String.valueOf(p.leerTodos().get(Pos).getSalary()));
        }
        else Tabs.setEnabledAt(0, false);
        if(p.Users.size()<=2){
               NextBut.setEnabled(false);
        }
        IDBoxS.setText(String.valueOf(Pos+1));
        IDBoxA.setText(String.valueOf(p.Users.size()+1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tabs = new javax.swing.JTabbedPane();
        Layout_A = new javax.swing.JPanel();
        FieldsSearch = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDBoxS = new javax.swing.JTextField();
        NameBoxS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AgeBoxS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SalaryBoxS = new javax.swing.JTextField();
        ButtonsSearch = new javax.swing.JLayeredPane();
        NextBut = new javax.swing.JButton();
        PrevBut = new javax.swing.JButton();
        SearchBut = new javax.swing.JButton();
        EditButS = new javax.swing.JButton();
        Layout_B = new javax.swing.JPanel();
        FieldsAdd = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDBoxA = new javax.swing.JTextField();
        NameBoxA = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        AgeBoxA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SalaryBoxA = new javax.swing.JTextField();
        ButtonsAdd = new javax.swing.JLayeredPane();
        AddBut = new javax.swing.JButton();
        Layout_C = new javax.swing.JPanel();
        FieldsEdit = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IDBoxE = new javax.swing.JTextField();
        NameBoxE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AgeBoxE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SalaryBoxE = new javax.swing.JTextField();
        ButtonsEdit = new javax.swing.JLayeredPane();
        EditBut = new javax.swing.JButton();
        DelThis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Tabs.setMinimumSize(new java.awt.Dimension(110, 30));
        Tabs.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TabsFocusGained(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");
        jLabel2.setToolTipText("");

        IDBoxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NameBoxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Edad:");
        jLabel3.setToolTipText("");

        AgeBoxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("Salario:");
        jLabel4.setToolTipText("");

        SalaryBoxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FieldsSearch.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(IDBoxS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(NameBoxS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(AgeBoxS, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsSearch.setLayer(SalaryBoxS, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FieldsSearchLayout = new javax.swing.GroupLayout(FieldsSearch);
        FieldsSearch.setLayout(FieldsSearchLayout);
        FieldsSearchLayout.setHorizontalGroup(
            FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(FieldsSearchLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(25, 25, 25)
                        .addComponent(SalaryBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FieldsSearchLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(AgeBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FieldsSearchLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(NameBoxS))
                    .addGroup(FieldsSearchLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(IDBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FieldsSearchLayout.setVerticalGroup(
            FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(IDBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(NameBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(AgeBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(SalaryBoxS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        NextBut.setText("→");
        NextBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButActionPerformed(evt);
            }
        });

        PrevBut.setText("←");
        PrevBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButActionPerformed(evt);
            }
        });

        SearchBut.setText("Buscar");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });

        EditButS.setText("Editar");
        EditButS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButSActionPerformed(evt);
            }
        });

        ButtonsSearch.setLayer(NextBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ButtonsSearch.setLayer(PrevBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ButtonsSearch.setLayer(SearchBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ButtonsSearch.setLayer(EditButS, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ButtonsSearchLayout = new javax.swing.GroupLayout(ButtonsSearch);
        ButtonsSearch.setLayout(ButtonsSearchLayout);
        ButtonsSearchLayout.setHorizontalGroup(
            ButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsSearchLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(ButtonsSearchLayout.createSequentialGroup()
                        .addComponent(PrevBut)
                        .addGap(95, 95, 95)
                        .addComponent(NextBut))
                    .addComponent(SearchBut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditButS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        ButtonsSearchLayout.setVerticalGroup(
            ButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonsSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(PrevBut)
                    .addComponent(NextBut)
                    .addGroup(ButtonsSearchLayout.createSequentialGroup()
                        .addComponent(SearchBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditButS)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout Layout_ALayout = new javax.swing.GroupLayout(Layout_A);
        Layout_A.setLayout(Layout_ALayout);
        Layout_ALayout.setHorizontalGroup(
            Layout_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_ALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Layout_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonsSearch)
                    .addComponent(FieldsSearch))
                .addGap(10, 10, 10))
        );
        Layout_ALayout.setVerticalGroup(
            Layout_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_ALayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(FieldsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Tabs.addTab("Buscar", Layout_A);

        jLabel5.setText("ID:");

        jLabel6.setText("Nombre:");
        jLabel6.setToolTipText("");

        IDBoxA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NameBoxA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setText("Edad:");
        jLabel7.setToolTipText("");

        AgeBoxA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setText("Salario:");
        jLabel8.setToolTipText("");

        SalaryBoxA.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FieldsAdd.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(IDBoxA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(NameBoxA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(AgeBoxA, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsAdd.setLayer(SalaryBoxA, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FieldsAddLayout = new javax.swing.GroupLayout(FieldsAdd);
        FieldsAdd.setLayout(FieldsAddLayout);
        FieldsAddLayout.setHorizontalGroup(
            FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FieldsAddLayout.createSequentialGroup()
                        .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FieldsAddLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46)
                                .addComponent(IDBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FieldsAddLayout.createSequentialGroup()
                                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(25, 25, 25)
                                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SalaryBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FieldsAddLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(20, 20, 20)
                        .addComponent(NameBoxA)
                        .addGap(10, 10, 10))))
        );
        FieldsAddLayout.setVerticalGroup(
            FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsAddLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(IDBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(FieldsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalaryBoxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );

        AddBut.setText("Añadir");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        ButtonsAdd.setLayer(AddBut, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ButtonsAddLayout = new javax.swing.GroupLayout(ButtonsAdd);
        ButtonsAdd.setLayout(ButtonsAddLayout);
        ButtonsAddLayout.setHorizontalGroup(
            ButtonsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsAddLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(AddBut)
                .addGap(96, 96, 96))
        );
        ButtonsAddLayout.setVerticalGroup(
            ButtonsAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBut)
                .addContainerGap())
        );

        javax.swing.GroupLayout Layout_BLayout = new javax.swing.GroupLayout(Layout_B);
        Layout_B.setLayout(Layout_BLayout);
        Layout_BLayout.setHorizontalGroup(
            Layout_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_BLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Layout_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonsAdd)
                    .addComponent(FieldsAdd))
                .addGap(10, 10, 10))
        );
        Layout_BLayout.setVerticalGroup(
            Layout_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_BLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(FieldsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        Tabs.addTab("Añadir", Layout_B);

        jLabel9.setText("ID:");

        jLabel10.setText("Nombre:");
        jLabel10.setToolTipText("");

        IDBoxE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        NameBoxE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setText("Edad:");
        jLabel11.setToolTipText("");

        AgeBoxE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setText("Salario:");
        jLabel12.setToolTipText("");

        SalaryBoxE.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        FieldsEdit.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(IDBoxE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(NameBoxE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(AgeBoxE, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        FieldsEdit.setLayer(SalaryBoxE, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout FieldsEditLayout = new javax.swing.GroupLayout(FieldsEdit);
        FieldsEdit.setLayout(FieldsEditLayout);
        FieldsEditLayout.setHorizontalGroup(
            FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsEditLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(FieldsEditLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(20, 20, 20)
                        .addComponent(NameBoxE))
                    .addGroup(FieldsEditLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(46, 46, 46)
                        .addComponent(IDBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FieldsEditLayout.createSequentialGroup()
                        .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SalaryBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FieldsEditLayout.setVerticalGroup(
            FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FieldsEditLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IDBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(FieldsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalaryBoxE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap())
        );

        EditBut.setText("Guardar Cambios");
        EditBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButActionPerformed(evt);
            }
        });

        DelThis.setText("Eliminar Usuario");
        DelThis.setToolTipText("");
        DelThis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelThisActionPerformed(evt);
            }
        });

        ButtonsEdit.setLayer(EditBut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        ButtonsEdit.setLayer(DelThis, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout ButtonsEditLayout = new javax.swing.GroupLayout(ButtonsEdit);
        ButtonsEdit.setLayout(ButtonsEditLayout);
        ButtonsEditLayout.setHorizontalGroup(
            ButtonsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsEditLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(ButtonsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DelThis, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EditBut, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        ButtonsEditLayout.setVerticalGroup(
            ButtonsEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsEditLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditBut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(DelThis))
        );

        javax.swing.GroupLayout Layout_CLayout = new javax.swing.GroupLayout(Layout_C);
        Layout_C.setLayout(Layout_CLayout);
        Layout_CLayout.setHorizontalGroup(
            Layout_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_CLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Layout_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonsEdit)
                    .addComponent(FieldsEdit))
                .addGap(10, 10, 10))
        );
        Layout_CLayout.setVerticalGroup(
            Layout_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Layout_CLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(FieldsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonsEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Tabs.addTab("Editar", Layout_C);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        try {
            Pos= (Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca ID a buscar","Búsqueda",JOptionPane.QUESTION_MESSAGE))-1);
            if (Pos+1<=p.Users.size() && Pos>=0){
                Actualiza();
            }
            else{
                JOptionPane.showMessageDialog(null, "El ID buscado no existe","Error al buscar",JOptionPane.ERROR_MESSAGE);
            }            
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código: "+ex);
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        try {
            Usuario u= new Usuario(NameBoxA.getText(),Integer.parseInt(AgeBoxA.getText()),Float.parseFloat(SalaryBoxA.getText()));
            p.guardar(u);
            Pos++;
            NameBoxA.setText("");
            AgeBoxA.setText("");
            SalaryBoxA.setText("");
            Tabs.setEnabledAt(0, true);
            Actualiza();
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código: "+ex);
        }
    }//GEN-LAST:event_AddButActionPerformed

    private void EditButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButActionPerformed
        try {
               p.actualiza(Pos, NameBoxE.getText(), Integer.parseInt(AgeBoxE.getText()),Float.parseFloat(SalaryBoxE.getText()));
               Tabs.setSelectedIndex(0);
               Actualiza();
               Tabs.setEnabledAt(2, false);
               Tabs.setEnabledAt(1,true);
               Tabs.setEnabledAt(0,true);
           } catch (Exception ex) {
               System.out.println("Algo salió mal, revisa el código");
           }
    }//GEN-LAST:event_EditButActionPerformed

    private void EditButSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButSActionPerformed
        try {
            Tabs.setEnabledAt(2,true);
            Tabs.setEnabledAt(0,false);
            Tabs.setEnabledAt(1,false);
            Tabs.setSelectedIndex(2);
            IDBoxE.setText(String.valueOf(Pos+1));
            AgeBoxE.setText(String.valueOf(p.leerTodos().get(Pos).getAge()));
            NameBoxE.setText(p.leerTodos().get(Pos).getName());
            SalaryBoxE.setText(String.valueOf(p.leerTodos().get(Pos).getSalary()));
            
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código");
        }
    }//GEN-LAST:event_EditButSActionPerformed

    private void PrevButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevButActionPerformed
        try {
            Pos--;
            Actualiza();
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_PrevButActionPerformed

    private void NextButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButActionPerformed
        try {
            Pos++;
            Actualiza();
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código");
        }
    }//GEN-LAST:event_NextButActionPerformed

    private void TabsFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabsFocusGained
        try {
            Pos=p.Users.size()-1;
            Actualiza();
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código: "+ex);
        }
    }//GEN-LAST:event_TabsFocusGained

    private void DelThisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelThisActionPerformed
        try {
            int Ans=JOptionPane.showConfirmDialog(null, "¿Desea borrar el elemento: "+Integer.parseInt(IDBoxE.getText())+"?","Eliminando",JOptionPane.YES_NO_OPTION);
            if (Ans==JOptionPane.YES_OPTION){
                p.borra(Integer.parseInt(IDBoxE.getText())-1);
            }
            Tabs.setSelectedIndex(0);
            Tabs.setEnabledAt(2, false);
            Tabs.setEnabledAt(1,true);
            Tabs.setEnabledAt(0,true);
        } catch (Exception ex) {
            System.out.println("Algo salió mal, revisa el código: "+ex);
        }
    }//GEN-LAST:event_DelThisActionPerformed
    
    public final void Actualiza() throws Exception{
        if(Pos>=1) PrevBut.setEnabled(true);
        else PrevBut.setEnabled(false);
        if (Pos<=(p.Users.size()-2)) NextBut.setEnabled(true);
        else NextBut.setEnabled(false);
        IDBoxA.setText(String.valueOf(p.Users.size()+1));
        IDBoxS.setText(String.valueOf(Pos+1));
        AgeBoxS.setText(String.valueOf(p.leerTodos().get(Pos).getAge()));
        NameBoxS.setText(p.leerTodos().get(Pos).getName());
        SalaryBoxS.setText(String.valueOf(p.leerTodos().get(Pos).getSalary()));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.out.println("Algo salió mal, revisa el código");
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Tabs().setVisible(true);
            } catch (Exception ex) {
                System.out.println("Algo salió mal, revisa el código");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private javax.swing.JTextField AgeBoxA;
    private javax.swing.JTextField AgeBoxE;
    private javax.swing.JTextField AgeBoxS;
    private javax.swing.JLayeredPane ButtonsAdd;
    private javax.swing.JLayeredPane ButtonsEdit;
    private javax.swing.JLayeredPane ButtonsSearch;
    private javax.swing.JButton DelThis;
    private javax.swing.JButton EditBut;
    private javax.swing.JButton EditButS;
    private javax.swing.JLayeredPane FieldsAdd;
    private javax.swing.JLayeredPane FieldsEdit;
    private javax.swing.JLayeredPane FieldsSearch;
    private javax.swing.JTextField IDBoxA;
    private javax.swing.JTextField IDBoxE;
    private javax.swing.JTextField IDBoxS;
    private javax.swing.JPanel Layout_A;
    private javax.swing.JPanel Layout_B;
    private javax.swing.JPanel Layout_C;
    private javax.swing.JTextField NameBoxA;
    private javax.swing.JTextField NameBoxE;
    private javax.swing.JTextField NameBoxS;
    private javax.swing.JButton NextBut;
    private javax.swing.JButton PrevBut;
    private javax.swing.JTextField SalaryBoxA;
    private javax.swing.JTextField SalaryBoxE;
    private javax.swing.JTextField SalaryBoxS;
    private javax.swing.JButton SearchBut;
    private javax.swing.JTabbedPane Tabs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
