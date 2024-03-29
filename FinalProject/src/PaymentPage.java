
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csche
 */
public class PaymentPage extends javax.swing.JFrame {

    /**
     * Creates new form PaymentPage
     */
    
    
     JDBCLect db;
     int userId=1;
     double subtotal;
  
    
  
    
    public PaymentPage(JDBCLect db, double subtotal) {
        this.db=db;
        this.subtotal=subtotal;

        initComponents();
        txt_subtotal.setText(subtotal+"");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocationRelativeTo(null);
        this.setSize(1300,800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        PaymentPageTitle = new javax.swing.JPanel();
        TItleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddressPanel = new javax.swing.JPanel();
        Address = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        CreditCardPanel = new javax.swing.JPanel();
        CredCardNumber = new javax.swing.JLabel();
        txt_credit_card_number = new javax.swing.JTextField();
        ExpirePanel = new javax.swing.JPanel();
        ExpireLabel = new javax.swing.JLabel();
        bx_month = new javax.swing.JComboBox<>();
        bx_year = new javax.swing.JComboBox<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        CVVPanel = new javax.swing.JPanel();
        CVVLabel = new javax.swing.JLabel();
        txt_cvv = new javax.swing.JTextField();
        BillingPanel = new javax.swing.JPanel();
        BillingLabel = new javax.swing.JLabel();
        txt_billing_address = new javax.swing.JTextField();
        ButtonPanel = new javax.swing.JPanel();
        btn_cancel = new javax.swing.JButton();
        SubmitLabel = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        Submit1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NamePanel = new javax.swing.JPanel();
        Name = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaymentPageTitle.setBackground(new java.awt.Color(102, 102, 102));

        TItleLabel.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        TItleLabel.setForeground(new java.awt.Color(102, 255, 102));
        TItleLabel.setText("Payment Page Information");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PaymentPageTitleLayout = new javax.swing.GroupLayout(PaymentPageTitle);
        PaymentPageTitle.setLayout(PaymentPageTitleLayout);
        PaymentPageTitleLayout.setHorizontalGroup(
            PaymentPageTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaymentPageTitleLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(TItleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PaymentPageTitleLayout.setVerticalGroup(
            PaymentPageTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TItleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PaymentPageTitleLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        AddressPanel.setBackground(new java.awt.Color(102, 102, 102));

        Address.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Address.setForeground(new java.awt.Color(0, 0, 255));
        Address.setText("Address");

        CreditCardPanel.setBackground(new java.awt.Color(102, 102, 102));

        CredCardNumber.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        CredCardNumber.setForeground(new java.awt.Color(0, 0, 255));
        CredCardNumber.setText("Credit Card #");

        txt_credit_card_number.setText("Please Enter 16 digits");
        txt_credit_card_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_credit_card_numberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditCardPanelLayout = new javax.swing.GroupLayout(CreditCardPanel);
        CreditCardPanel.setLayout(CreditCardPanelLayout);
        CreditCardPanelLayout.setHorizontalGroup(
            CreditCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CredCardNumber)
                .addGap(31, 31, 31)
                .addComponent(txt_credit_card_number, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CreditCardPanelLayout.setVerticalGroup(
            CreditCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditCardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreditCardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CredCardNumber)
                    .addComponent(txt_credit_card_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ExpirePanel.setBackground(new java.awt.Color(102, 102, 102));

        ExpireLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        ExpireLabel.setForeground(new java.awt.Color(0, 0, 255));
        ExpireLabel.setText("Expire Date");

        bx_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "Septermber", "Octuber", "November", "December" }));
        bx_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx_monthActionPerformed(evt);
            }
        });

        bx_year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", " " }));
        bx_year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bx_yearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExpirePanelLayout = new javax.swing.GroupLayout(ExpirePanel);
        ExpirePanel.setLayout(ExpirePanelLayout);
        ExpirePanelLayout.setHorizontalGroup(
            ExpirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpirePanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ExpireLabel)
                .addGap(41, 41, 41)
                .addComponent(bx_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bx_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExpirePanelLayout.setVerticalGroup(
            ExpirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpirePanelLayout.createSequentialGroup()
                .addGroup(ExpirePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExpireLabel)
                    .addComponent(bx_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bx_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ExpirePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        CVVPanel.setBackground(new java.awt.Color(102, 102, 102));

        CVVLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        CVVLabel.setForeground(new java.awt.Color(0, 0, 255));
        CVVLabel.setText("CVV");

        txt_cvv.setText("Number on Back of Card");
        txt_cvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cvvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CVVPanelLayout = new javax.swing.GroupLayout(CVVPanel);
        CVVPanel.setLayout(CVVPanelLayout);
        CVVPanelLayout.setHorizontalGroup(
            CVVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CVVPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CVVLabel)
                .addGap(73, 73, 73)
                .addComponent(txt_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CVVPanelLayout.setVerticalGroup(
            CVVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CVVPanelLayout.createSequentialGroup()
                .addGroup(CVVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVVLabel)
                    .addComponent(txt_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 16, Short.MAX_VALUE))
        );

        BillingPanel.setBackground(new java.awt.Color(102, 102, 102));

        BillingLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        BillingLabel.setForeground(new java.awt.Color(0, 0, 255));
        BillingLabel.setText("Billing Address");

        javax.swing.GroupLayout BillingPanelLayout = new javax.swing.GroupLayout(BillingPanel);
        BillingPanel.setLayout(BillingPanelLayout);
        BillingPanelLayout.setHorizontalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addComponent(BillingLabel)
                .addGap(31, 31, 31)
                .addComponent(txt_billing_address, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BillingPanelLayout.setVerticalGroup(
            BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillingPanelLayout.createSequentialGroup()
                .addGroup(BillingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BillingLabel)
                    .addComponent(txt_billing_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(0, 0, 255));

        btn_cancel.setBackground(new java.awt.Color(255, 153, 51));
        btn_cancel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        SubmitLabel.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        SubmitLabel.setForeground(new java.awt.Color(102, 255, 102));
        SubmitLabel.setText("Subtotal");

        txt_subtotal.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });

        Submit1.setBackground(new java.awt.Color(255, 151, 55));
        Submit1.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Submit1.setForeground(new java.awt.Color(0, 0, 255));
        Submit1.setText("Confirm Payment");
        Submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(SubmitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Submit1)))
                .addGap(28, 28, 28))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(SubmitLabel)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addComponent(txt_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Submit1)
                    .addComponent(btn_cancel))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout AddressPanelLayout = new javax.swing.GroupLayout(AddressPanel);
        AddressPanel.setLayout(AddressPanelLayout);
        AddressPanelLayout.setHorizontalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddressPanelLayout.createSequentialGroup()
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpirePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddressPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CreditCardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CVVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BillingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        AddressPanelLayout.setVerticalGroup(
            AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddressPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CreditCardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpirePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CVVPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BillingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setText("jLabel1");

        NamePanel.setBackground(new java.awt.Color(102, 102, 102));

        Name.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 255));
        Name.setText("Name");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NamePanelLayout = new javax.swing.GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamePanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(Name)
                .addGap(61, 61, 61)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NamePanelLayout.setVerticalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(NamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(NamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PaymentPageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(AddressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PaymentPageTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        PaymentPageTitle.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_credit_card_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_credit_card_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_credit_card_numberActionPerformed

    private void txt_cvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cvvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cvvActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
     this.dispose();
      
        
        
    }//GEN-LAST:event_btn_cancelActionPerformed

       public void displayMessageError(){
    
        
        
    String msg = "All fields are required. Plese complete the infomation  " ;
                    

    JOptionPane optionPane = new JOptionPane();
    optionPane.setMessage(msg);
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog(null, "Width 100");
    dialog.setVisible(true);
    
    
    }
    
    public void displayMessage(String name, String address, String CreditCard, String BillingAddres){
    
        
        
    String msg = "Summary  \n" +
                  "Name :" +name +"\n"+
                  "Adress :" +name +"\n"+
                  "CreditCard :xxxxx \n"+
                  "BillingAddress "+ BillingAddres;
                    

    JOptionPane optionPane = new JOptionPane();
    optionPane.setMessage(msg);
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    JDialog dialog = optionPane.createDialog(null, "Width 100");
    dialog.setVisible(true);
    this.dispose();
    
    }
    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void bx_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx_monthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bx_monthActionPerformed

    private void bx_yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bx_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bx_yearActionPerformed

    private void Submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit1ActionPerformed
        // TODO add your handling code here:
        
         if(txt_name.getText().equals("") || txt_address.getText().equals("") || txt_billing_address.getText().equals("")|| txt_credit_card_number.getText().equals("")|| txt_cvv.getText().equals("")|| txt_subtotal.getText().equals(""))  
         {
         
         displayMessageError();
         }else{
      
          
          int idPayment=db.payementId()+1;
          
          String mounth=bx_month.getSelectedItem().toString();
          String year =bx_year.getSelectedItem().toString();
          
          String date = mounth+"/"+year;
          
          
          db.insertPayment(idPayment, txt_cvv.getText(), date, txt_credit_card_number.getText(),Double.parseDouble(txt_subtotal.getText()));
          
              int idOrder=db.OrderId()+1;
          db.insertOrder(idOrder, txt_address.getText(), txt_name.getText(), idPayment, userId);
          
          displayMessage(txt_name.getText(),txt_address.getText(),txt_credit_card_number.getText(),txt_billing_address.getText());
      
      }
    }//GEN-LAST:event_Submit1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JPanel AddressPanel;
    private javax.swing.JLabel BillingLabel;
    private javax.swing.JPanel BillingPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JLabel CVVLabel;
    private javax.swing.JPanel CVVPanel;
    private javax.swing.JLabel CredCardNumber;
    private javax.swing.JPanel CreditCardPanel;
    private javax.swing.JLabel ExpireLabel;
    private javax.swing.JPanel ExpirePanel;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JPanel PaymentPageTitle;
    private javax.swing.JButton Submit1;
    private javax.swing.JLabel SubmitLabel;
    private javax.swing.JLabel TItleLabel;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JComboBox<String> bx_month;
    private javax.swing.JComboBox<String> bx_year;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_billing_address;
    private javax.swing.JTextField txt_credit_card_number;
    private javax.swing.JTextField txt_cvv;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_subtotal;
    // End of variables declaration//GEN-END:variables

    private void setLocation(float CENTER_ALIGNMENT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
