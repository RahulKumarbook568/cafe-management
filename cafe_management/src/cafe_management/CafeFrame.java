package cafe_management;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class CafeFrame extends JFrame {
	
	double drink[]=new double[5];
	double cake[]=new double[5];
	double cost[]=new double[3];

	private JPanel contentPane;
	private JTextField textField_lattle_total;
	private JTextField textField_iced_lattle_total;
	private JTextField textField_espresso_total;
	private JTextField textField_cappuccino_total;
	private JTextField textField_ice_cappuccino_total;
	private JTextField textField_coffe_cake_unit;
	private JTextField textField_redVelved_cake_unit;
	private JTextField textField_boston_cake_unit;
	private JTextField textField_blackForest_cake_unit;
	private JTextField textField_lagos_cake_unit;
	private JTextField textField_costOfDrink;
	private JTextField textField_costOfCakes;
	private JTextField textField_serviceCharge;
	private JTextField textField_tax;
	private JTextField textField_subTotal;
	private JTextField textField_total;
	private JTextField textField_lagos_cake_total;
	private JTextField textField_blackForest_cake_total;
	private JTextField textField_boston_cake_total;
	private JTextField textField_redVelved_cake_total;
	private JTextField textField_coffee_cake_total;
	private JTextField textField_ice_cappuccino_unit;
	private JTextField textField_cappuccino_unit;
	private JTextField textField_espresso_unit;
	private JTextField textField_iced_lattle_unit;
	private JTextField textField_lattle_unit;
	
	private static final int SERVICE_CHARGE=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CafeFrame frame = new CafeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CafeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1445, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(10, 100, 417, 330);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Lattle");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					setEditableTrue(1);
				}
				else {
					setEditableFalse(1);
					setPrice(textField_lattle_unit,textField_lattle_total,1);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		
		
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(6, 61, 153, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Iced Lattle");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_1.isSelected()) {
					setEditableTrue(2);
				}
				else {
					setEditableFalse(2);
					setPrice(textField_lattle_unit,textField_lattle_total,2);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(6, 102, 153, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Espresso");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_2.isSelected()) {
					setEditableTrue(3);
				}
				else {
					setEditableFalse(3);
					setPrice(textField_lattle_unit,textField_lattle_total,3);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_2.setBounds(6, 142, 153, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Cappuccino");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_3.isSelected()) {
					setEditableTrue(4);
				}
				else {
					setEditableFalse(4);
					setPrice(textField_lattle_unit,textField_lattle_total,4);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_3.setBounds(6, 182, 153, 23);
		panel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Ice Cappuccino");
		chckbxNewCheckBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox_4.isSelected()) {
					setEditableTrue(5);
				}
				else {
					setEditableFalse(5);
					setPrice(textField_lattle_unit,textField_lattle_total,5);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxNewCheckBox_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox_4.setBounds(6, 222, 153, 23);
		panel.add(chckbxNewCheckBox_4);
		
		textField_lattle_total = new JTextField();
		textField_lattle_total.setEditable(false);
		textField_lattle_total.setText("0");
		textField_lattle_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lattle_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_lattle_total.setBounds(321, 61, 86, 28);
		panel.add(textField_lattle_total);
		textField_lattle_total.setColumns(10);
		
		textField_iced_lattle_total = new JTextField();
		textField_iced_lattle_total.setEditable(false);
		textField_iced_lattle_total.setText("0");
		textField_iced_lattle_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_iced_lattle_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_iced_lattle_total.setColumns(10);
		textField_iced_lattle_total.setBounds(321, 102, 86, 28);
		panel.add(textField_iced_lattle_total);
		
		textField_espresso_total = new JTextField();
		textField_espresso_total.setEditable(false);
		textField_espresso_total.setText("0");
		textField_espresso_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_espresso_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_espresso_total.setColumns(10);
		textField_espresso_total.setBounds(321, 142, 86, 27);
		panel.add(textField_espresso_total);
		
		textField_cappuccino_total = new JTextField();
		textField_cappuccino_total.setEditable(false);
		textField_cappuccino_total.setText("0");
		textField_cappuccino_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_cappuccino_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_cappuccino_total.setColumns(10);
		textField_cappuccino_total.setBounds(321, 182, 86, 27);
		panel.add(textField_cappuccino_total);
		
		textField_ice_cappuccino_total = new JTextField();
		textField_ice_cappuccino_total.setEditable(false);
		textField_ice_cappuccino_total.setText("0");
		textField_ice_cappuccino_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ice_cappuccino_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_ice_cappuccino_total.setColumns(10);
		textField_ice_cappuccino_total.setBounds(321, 222, 86, 27);
		panel.add(textField_ice_cappuccino_total);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(10, 11, 1350, 78);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Cafe Management System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(437, 100, 536, 330);
		contentPane.add(panel_2);
		
		JCheckBox chckbxCoffeeCake = new JCheckBox("Coffee Cake");
		chckbxCoffeeCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxCoffeeCake.isSelected()) {
					setEditableTrue(6);
				}
				else {
					setEditableFalse(6);
					setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,6);	
					cakeCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxCoffeeCake.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxCoffeeCake.setBounds(6, 62, 207, 23);
		panel_2.add(chckbxCoffeeCake);
		
		JCheckBox chckbxRedVelvedCake = new JCheckBox("Red Velved Cake");
		chckbxRedVelvedCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRedVelvedCake.isSelected()) {
					setEditableTrue(7);
				}
				else {
					setEditableFalse(7);
					setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,7);	
					cakeCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxRedVelvedCake.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxRedVelvedCake.setBounds(6, 103, 207, 23);
		panel_2.add(chckbxRedVelvedCake);
		
		JCheckBox chckbxBostonCreamCake = new JCheckBox("Boston Cream Cake");
		chckbxBostonCreamCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBostonCreamCake.isSelected()) {
					setEditableTrue(8);
				}
				else {
					setEditableFalse(8);
					setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,8);	
					cakeCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxBostonCreamCake.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxBostonCreamCake.setBounds(6, 140, 207, 23);
		panel_2.add(chckbxBostonCreamCake);
		
		JCheckBox chckbxBlackForestCake = new JCheckBox("Black Forest Cake");
		chckbxBlackForestCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxBlackForestCake.isSelected()) {
					setEditableTrue(9);
				}
				else {
					setEditableFalse(9);
					setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,9);	
					cakeCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxBlackForestCake.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxBlackForestCake.setBounds(6, 183, 207, 23);
		panel_2.add(chckbxBlackForestCake);
		
		JCheckBox chckbxLagosChocolateCake = new JCheckBox("Lagos Chocolate Cake");
		chckbxLagosChocolateCake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxLagosChocolateCake.isSelected()) {
					setEditableTrue(10);
				}
				else {
					setEditableFalse(10);
					setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,10);	
					cakeCost();
					taxCal();
					subTotal();
					total();
				}
			}
		});
		chckbxLagosChocolateCake.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxLagosChocolateCake.setBounds(6, 223, 207, 23);
		panel_2.add(chckbxLagosChocolateCake);
		
		textField_coffe_cake_unit = new JTextField();
		textField_coffe_cake_unit.setEditable(false);
		textField_coffe_cake_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_coffe_cake_unit.getText().equals("")) {
					setDefault(textField_coffe_cake_unit,textField_coffee_cake_total);
				}
				else {
				setPrice(textField_coffe_cake_unit,textField_coffee_cake_total,6);	
				cakeCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_coffe_cake_unit.setText("");
			}
		});
		textField_coffe_cake_unit.setText("0");
		textField_coffe_cake_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_coffe_cake_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_coffe_cake_unit.setColumns(10);
		textField_coffe_cake_unit.setBounds(318, 60, 94, 26);
		panel_2.add(textField_coffe_cake_unit);
		
		textField_redVelved_cake_unit = new JTextField();
		textField_redVelved_cake_unit.setEditable(false);
		textField_redVelved_cake_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_redVelved_cake_unit.getText().equals("")) {
					setDefault(textField_redVelved_cake_unit,textField_redVelved_cake_total);
				}
				else {
				setPrice(textField_redVelved_cake_unit,textField_redVelved_cake_total,7);
				cakeCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_redVelved_cake_unit.setText("");
			}
		});
		textField_redVelved_cake_unit.setText("0");
		textField_redVelved_cake_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_redVelved_cake_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_redVelved_cake_unit.setColumns(10);
		textField_redVelved_cake_unit.setBounds(318, 101, 94, 26);
		panel_2.add(textField_redVelved_cake_unit);
		
		textField_boston_cake_unit = new JTextField();
		textField_boston_cake_unit.setEditable(false);
		textField_boston_cake_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_boston_cake_unit.getText().equals("")) {
					setDefault(textField_boston_cake_unit,textField_boston_cake_total);
				}
				else {
				setPrice(textField_boston_cake_unit,textField_boston_cake_total,8);	
				cakeCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_boston_cake_unit.setText("");
			}
		});
		textField_boston_cake_unit.setText("0");
		textField_boston_cake_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_boston_cake_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_boston_cake_unit.setColumns(10);
		textField_boston_cake_unit.setBounds(318, 138, 94, 26);
		panel_2.add(textField_boston_cake_unit);
		
		textField_blackForest_cake_unit = new JTextField();
		textField_blackForest_cake_unit.setEditable(false);
		textField_blackForest_cake_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_blackForest_cake_unit.getText().equals("")) {
					setDefault(textField_blackForest_cake_unit,textField_blackForest_cake_total);
				}
				else {
				setPrice(textField_blackForest_cake_unit,textField_blackForest_cake_total,9);	
				cakeCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_blackForest_cake_unit.setText("");
			}
			
		});
		textField_blackForest_cake_unit.setText("0");
		textField_blackForest_cake_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_blackForest_cake_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_blackForest_cake_unit.setColumns(10);
		textField_blackForest_cake_unit.setBounds(318, 181, 94, 26);
		panel_2.add(textField_blackForest_cake_unit);
		
		textField_lagos_cake_unit = new JTextField();
		textField_lagos_cake_unit.setEditable(false);
		textField_lagos_cake_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_lagos_cake_unit.getText().equals("")) {
					setDefault(textField_lagos_cake_unit,textField_lagos_cake_total);
				}
				else {
				setPrice(textField_lagos_cake_unit,textField_lagos_cake_total,10);	
				cakeCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_lagos_cake_unit.setText("");
			}
		});
		textField_lagos_cake_unit.setText("0");
		textField_lagos_cake_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lagos_cake_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_lagos_cake_unit.setColumns(10);
		textField_lagos_cake_unit.setBounds(318, 221, 94, 26);
		panel_2.add(textField_lagos_cake_unit);
		
		textField_lagos_cake_total = new JTextField();
		textField_lagos_cake_total.setEditable(false);
		textField_lagos_cake_total.setText("0");
		textField_lagos_cake_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lagos_cake_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_lagos_cake_total.setColumns(10);
		textField_lagos_cake_total.setBounds(432, 220, 94, 26);
		panel_2.add(textField_lagos_cake_total);
		
		textField_blackForest_cake_total = new JTextField();
		textField_blackForest_cake_total.setEditable(false);
		textField_blackForest_cake_total.setText("0");
		textField_blackForest_cake_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_blackForest_cake_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_blackForest_cake_total.setColumns(10);
		textField_blackForest_cake_total.setBounds(432, 180, 94, 26);
		panel_2.add(textField_blackForest_cake_total);
		
		textField_boston_cake_total = new JTextField();
		textField_boston_cake_total.setEditable(false);
		textField_boston_cake_total.setText("0");
		textField_boston_cake_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_boston_cake_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_boston_cake_total.setColumns(10);
		textField_boston_cake_total.setBounds(432, 137, 94, 26);
		panel_2.add(textField_boston_cake_total);
		
		textField_redVelved_cake_total = new JTextField();
		textField_redVelved_cake_total.setEditable(false);
		textField_redVelved_cake_total.setText("0");
		textField_redVelved_cake_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_redVelved_cake_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_redVelved_cake_total.setColumns(10);
		textField_redVelved_cake_total.setBounds(432, 100, 94, 26);
		panel_2.add(textField_redVelved_cake_total);
		
		textField_coffee_cake_total = new JTextField();
		textField_coffee_cake_total.setEditable(false);
		textField_coffee_cake_total.setText("0");
		textField_coffee_cake_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_coffee_cake_total.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_coffee_cake_total.setColumns(10);
		textField_coffee_cake_total.setBounds(432, 59, 94, 26);
		panel_2.add(textField_coffee_cake_total);
		
		JLabel lblRs_4 = new JLabel("Rs.150");
		lblRs_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_4.setBounds(219, 59, 67, 28);
		panel_2.add(lblRs_4);
		
		JLabel lblRs_5 = new JLabel("Rs.250");
		lblRs_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_5.setBounds(219, 100, 67, 28);
		panel_2.add(lblRs_5);
		
		JLabel lblRs_6 = new JLabel("Rs.250");
		lblRs_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_6.setBounds(219, 137, 67, 28);
		panel_2.add(lblRs_6);
		
		JLabel lblRs_7 = new JLabel("Rs.300");
		lblRs_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_7.setBounds(219, 180, 67, 28);
		panel_2.add(lblRs_7);
		
		JLabel lblRs_8 = new JLabel("Rs.400");
		lblRs_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_8.setBounds(219, 220, 67, 28);
		panel_2.add(lblRs_8);
		
		JLabel label_9 = new JLabel("Items");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_9.setBounds(10, 11, 203, 23);
		panel_2.add(label_9);
		
		JLabel label_10 = new JLabel("Price");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_10.setBounds(219, 8, 67, 28);
		panel_2.add(label_10);
		
		JLabel label_11 = new JLabel("Unit");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_11.setBounds(326, 8, 86, 28);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("Total");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_12.setBounds(440, 8, 86, 28);
		panel_2.add(label_12);
		
		JPanel panel_3 = new JPanel();
		textField_iced_lattle_total.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_ice_cappuccino_unit = new JTextField();
		textField_ice_cappuccino_unit.setEditable(false);
		textField_ice_cappuccino_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_ice_cappuccino_unit.getText().equals("")) {
					setDefault(textField_ice_cappuccino_unit,textField_ice_cappuccino_total);
				}
				else {
				setPrice(textField_ice_cappuccino_unit,textField_ice_cappuccino_total,5);
				drinkCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_ice_cappuccino_unit.setText("");
			}
		});
		textField_ice_cappuccino_unit.setText("0");
		textField_ice_cappuccino_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_ice_cappuccino_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_ice_cappuccino_unit.setColumns(10);
		textField_ice_cappuccino_unit.setBounds(225, 222, 86, 27);
		panel.add(textField_ice_cappuccino_unit);
		
		textField_cappuccino_unit = new JTextField();
		textField_cappuccino_unit.setEditable(false);
		textField_cappuccino_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_cappuccino_unit.getText().equals("")) {
					setDefault(textField_cappuccino_unit,textField_cappuccino_total);
				}
				else {
				setPrice(textField_cappuccino_unit,textField_cappuccino_total,4);
				drinkCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_cappuccino_unit.setText("");
			}
		});
		textField_cappuccino_unit.setText("0");
		textField_cappuccino_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_cappuccino_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_cappuccino_unit.setColumns(10);
		textField_cappuccino_unit.setBounds(225, 182, 86, 27);
		panel.add(textField_cappuccino_unit);
		
		textField_espresso_unit = new JTextField();
		textField_espresso_unit.setEditable(false);
		textField_espresso_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_espresso_unit.getText().equals("")) {
					setDefault(textField_espresso_unit,textField_espresso_total);
				}
				else {
				setPrice(textField_espresso_unit,textField_espresso_total,3);
				drinkCost();
				taxCal();
				subTotal();
				total();
				}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_espresso_unit.setText("");
			}
		});
		textField_espresso_unit.setText("0");
		textField_espresso_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_espresso_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_espresso_unit.setColumns(10);
		textField_espresso_unit.setBounds(225, 142, 86, 27);
		panel.add(textField_espresso_unit);
		
		textField_iced_lattle_unit = new JTextField();
		textField_iced_lattle_unit.setEditable(false);
		textField_iced_lattle_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(textField_iced_lattle_unit.getText().equals("")) {
					setDefault(textField_iced_lattle_unit,textField_iced_lattle_total);
				}
				else {
					setPrice(textField_iced_lattle_unit,textField_iced_lattle_total,2);	
					drinkCost();
					taxCal();
					subTotal();
					total();
			}
			}
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_iced_lattle_unit.setText("");
			}
		});
		textField_iced_lattle_unit.setText("0");
		textField_iced_lattle_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_iced_lattle_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_iced_lattle_unit.setColumns(10);
		textField_iced_lattle_unit.setBounds(225, 102, 86, 28);
		panel.add(textField_iced_lattle_unit);
		
		textField_lattle_unit = new JTextField();
		textField_lattle_unit.setEditable(false);
		textField_lattle_unit.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(textField_lattle_unit.getText().equals("")) {
					setDefault(textField_lattle_unit,textField_lattle_total);
				}
				else {
					setPrice(textField_lattle_unit,textField_lattle_total,1);			
					drinkCost();
					taxCal();
					subTotal();
					total();
				}				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				textField_lattle_unit.setText("");
			}
		});
		textField_lattle_unit.setText("0");
		textField_lattle_unit.setHorizontalAlignment(SwingConstants.CENTER);
		textField_lattle_unit.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_lattle_unit.setColumns(10);
		textField_lattle_unit.setBounds(225, 61, 86, 28);
		panel.add(textField_lattle_unit);
		
		JLabel lblNewLabel_2 = new JLabel("Rs.30");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(165, 61, 50, 28);
		panel.add(lblNewLabel_2);
		
		JLabel lblRs = new JLabel("Rs.35");
		lblRs.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs.setBounds(165, 102, 50, 28);
		panel.add(lblRs);
		
		JLabel lblRs_1 = new JLabel("Rs.40");
		lblRs_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_1.setBounds(165, 142, 50, 28);
		panel.add(lblRs_1);
		
		JLabel lblRs_2 = new JLabel("Rs.50");
		lblRs_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_2.setBounds(165, 182, 50, 28);
		panel.add(lblRs_2);
		
		JLabel lblRs_3 = new JLabel("Rs.60");
		lblRs_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRs_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRs_3.setBounds(165, 222, 50, 28);
		panel.add(lblRs_3);
		
		JLabel lblNewLabel_3 = new JLabel("Items");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 11, 149, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrice.setBounds(165, 11, 50, 28);
		panel.add(lblPrice);
		
		JLabel lblUnit = new JLabel("Unit");
		lblUnit.setHorizontalAlignment(SwingConstants.CENTER);
		lblUnit.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUnit.setBounds(225, 11, 86, 28);
		panel.add(lblUnit);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTotal_1.setBounds(321, 11, 86, 28);
		panel.add(lblTotal_1);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(983, 100, 377, 423);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 357, 401);
		panel_3.add(textArea);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_4.setBounds(10, 441, 417, 209);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Cost of Drinks");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 29, 183, 35);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblCostOfCakes = new JLabel("Cost of Cakes");
		lblCostOfCakes.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCostOfCakes.setBounds(10, 88, 183, 34);
		panel_4.add(lblCostOfCakes);
		
		JLabel lblServiceCharge = new JLabel("Service Charge");
		lblServiceCharge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblServiceCharge.setBounds(10, 147, 183, 34);
		panel_4.add(lblServiceCharge);
		
		textField_costOfDrink = new JTextField();
		textField_costOfDrink.setText("0");
		textField_costOfDrink.setEditable(false);
		textField_costOfDrink.setHorizontalAlignment(SwingConstants.CENTER);
		textField_costOfDrink.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_costOfDrink.setColumns(10);
		textField_costOfDrink.setBounds(203, 29, 204, 38);
		panel_4.add(textField_costOfDrink);
		
		textField_costOfCakes = new JTextField();
		textField_costOfCakes.setText("0");
		textField_costOfCakes.setEditable(false);
		textField_costOfCakes.setHorizontalAlignment(SwingConstants.CENTER);
		textField_costOfCakes.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_costOfCakes.setColumns(10);
		textField_costOfCakes.setBounds(203, 84, 204, 38);
		panel_4.add(textField_costOfCakes);
		
		textField_serviceCharge = new JTextField("0");
		textField_serviceCharge.setEditable(false);
		textField_serviceCharge.setHorizontalAlignment(SwingConstants.CENTER);
		textField_serviceCharge.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_serviceCharge.setColumns(10);
		textField_serviceCharge.setBounds(203, 143, 204, 38);
		panel_4.add(textField_serviceCharge);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_5.setBounds(437, 441, 536, 209);
		contentPane.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax      18%");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(24, 31, 246, 37);
		panel_5.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(24, 90, 246, 37);
		panel_5.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(24, 149, 246, 37);
		panel_5.add(lblTotal);
		
		textField_tax = new JTextField();
		textField_tax.setEditable(false);
		textField_tax.setHorizontalAlignment(SwingConstants.CENTER);
		textField_tax.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_tax.setColumns(10);
		textField_tax.setBounds(280, 30, 246, 38);
		panel_5.add(textField_tax);
		
		textField_subTotal = new JTextField();
		textField_subTotal.setEditable(false);
		textField_subTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textField_subTotal.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_subTotal.setColumns(10);
		textField_subTotal.setBounds(280, 89, 246, 38);
		panel_5.add(textField_subTotal);
		
		textField_total = new JTextField();
		textField_total.setEditable(false);
		textField_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_total.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_total.setColumns(10);
		textField_total.setBounds(280, 148, 246, 38);
		panel_5.add(textField_total);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel_6.setBounds(983, 537, 377, 113);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		JButton btnReciept = new JButton("Reciept");
		btnReciept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink[0]=Double.parseDouble(textField_lattle_total.getText());
				drink[1]=Double.parseDouble(textField_iced_lattle_total.getText());
				drink[2]=Double.parseDouble(textField_espresso_total.getText());
				drink[3]=Double.parseDouble(textField_cappuccino_total.getText());
				drink[4]=Double.parseDouble(textField_ice_cappuccino_total.getText());
				
				cake[0]=Double.parseDouble(textField_coffe_cake_unit.getText());
				cake[1]=Double.parseDouble(textField_redVelved_cake_unit.getText());
				cake[2]=Double.parseDouble(textField_boston_cake_unit.getText());
				cake[3]=Double.parseDouble(textField_blackForest_cake_unit.getText());
				cake[4]=Double.parseDouble(textField_lagos_cake_unit.getText());
				
				
				cost[0]=Double.parseDouble(textField_tax.getText());
				cost[1]=Double.parseDouble(textField_subTotal.getText());
				cost[2]=Double.parseDouble(textField_total.getText());
				//================================
				int refs=1325+(int)(Math.random()*4230);
							
				//================================
				
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				tTime.format(timer.getTime());
				SimpleDateFormat Tdate=new SimpleDateFormat("dd-MM-yyyy");
				Tdate.format(timer.getTime());
				//================================
				textArea.append("\tCafe Mangement System:\n\n"+
				"Reference:\t\t\t"+refs+
				"\n===============================================\t"+
				"\n Lattle:\t\t\t"+drink[0]+
				"\n Iced Lattle:\t\t\t"+drink[1]+
				"\n Espresso:\t\t\t"+drink[2]+
				"\n Cappuccino:\t\t\t"+drink[3]+
				"\n Iced Cappuccino:\t\t"+drink[4]+
				
				"\n===============================================\t"+
				"\n Coffe:\t\t\t"+cake[0]+
				"\n Red Velvet Cakes:\t\t"+cake[1]+
				"\n Boston Cream Pie:\t\t"+cake[2]+
				"\n Black Forest Cake:\t\t"+cake[3]+
				"\n Lagos Chocolate Cake:\t\t"+cake[4]+				
				
				"\n===============================================\t"+
				"\n Tax:\t\t\t"+cost[0]+
			 	"\n Sub Total:\t\t\t"+cost[1]+
				"\n Total:\t\t\t"+cost[2]+
				"\n\n\n Date:"+Tdate.format(timer.getTime())+
				"\tTime:"+tTime.format(timer.getTime())+			
				
				"\n===============================================\t"+
				"\n\n Thank you");
			}
		});
		
		btnReciept.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReciept.setBounds(20, 21, 180, 33);
		panel_6.add(btnReciept);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 textField_lattle_unit.setText("0");
				 textField_iced_lattle_unit.setText("0");
				 textField_espresso_unit.setText("0");
				 textField_cappuccino_unit.setText("0");
				 textField_ice_cappuccino_unit.setText("0");
				 
				 textField_lattle_total.setText("0");
				 textField_iced_lattle_total.setText("0");
				 textField_espresso_total.setText("0");
				 textField_cappuccino_total.setText("0");
				 textField_ice_cappuccino_total.setText("0");
				 
				 textField_coffe_cake_unit.setText("0");
				 textField_redVelved_cake_unit.setText("0");
				 textField_boston_cake_unit.setText("0");
				 textField_blackForest_cake_unit.setText("0");
				 textField_lagos_cake_unit.setText("0");
				 
				 textField_coffee_cake_total.setText("0");
				 textField_redVelved_cake_total.setText("0");
				 textField_boston_cake_total.setText("0");
				 textField_blackForest_cake_total.setText("0");
				 textField_lagos_cake_total.setText("0");
				 
				 textField_costOfDrink.setText("0");
				 textField_costOfCakes.setText("0");
				 textField_serviceCharge.setText("0");
				 textField_tax.setText("0");
				 textField_subTotal.setText("0");
				 textField_total.setText("0");
				 
				 chckbxNewCheckBox.setSelected(false);
				 chckbxNewCheckBox_1.setSelected(false);
				 chckbxNewCheckBox_2.setSelected(false);
				 chckbxNewCheckBox_3.setSelected(false);
				 chckbxNewCheckBox_4.setSelected(false);
				 
				 chckbxCoffeeCake.setSelected(false);
				 chckbxBostonCreamCake.setSelected(false);
				 chckbxRedVelvedCake.setSelected(false);
				 chckbxBlackForestCake.setSelected(false);
				 chckbxLagosChocolateCake.setSelected(false);
				 
				 textArea.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(210, 21, 157, 33);
		panel_6.add(btnReset);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(210, 65, 157, 37);
		panel_6.add(btnExit);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textArea.print();
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnPrint.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPrint.setBounds(20, 65, 180, 37);
		panel_6.add(btnPrint);
	}
	
	//////////////////////////////////////////////////////////////////////////////
	private void setPrice(JTextField tf_unit,JTextField tf_total,int id) {		
		int price=0;
		switch(id) {
		case 1:	
			price=Price.LATTLE.getPrice();
			break;
		case 2:	
			price=Price.ICED_LATTLE.getPrice();
			break;
		case 3:	
			price=Price.ESPRESSO.getPrice();
			break;
		case 4:	
			price=Price.CAPPUCCINO.getPrice();
			break;	
		case 5:	
			price=Price.ICE_CAPPUCCINO.getPrice();
		    break;
		case 6:	
			price=Price.COFFEE_CAKE.getPrice();
			break;
		case 7:	
			price=Price.RED_VELVED_CAKE.getPrice();
			break;
		case 8:	
			price=Price.BOSTON_CAKE.getPrice();
			break;
		case 9:	
			price=Price.BLACK_FOREST_CAKE.getPrice();
		    break;
		case 10:	
			price=Price.LAGOS_CAKE.getPrice();
			break;		
		}
		
		tf_total.setText(""+price*Integer.parseInt(tf_unit.getText()));
					
	}
	/////////////////////////////////////////////////////////////
	private void drinkCost() {
		int drinkCost=Integer.parseInt(textField_lattle_total.getText())+Integer.parseInt(textField_iced_lattle_total.getText())+
				Integer.parseInt(textField_espresso_total.getText())+Integer.parseInt(textField_cappuccino_total.getText())+
				Integer.parseInt(textField_ice_cappuccino_total.getText());
		textField_costOfDrink.setText(""+drinkCost);		
	}
	////////////////////////////////////////////////////////
	private void cakeCost() {
		int caakeCost=Integer.parseInt(textField_coffee_cake_total.getText())+Integer.parseInt(textField_redVelved_cake_total.getText())+
				Integer.parseInt(textField_boston_cake_total.getText())+Integer.parseInt(textField_blackForest_cake_total.getText())+
				Integer.parseInt(textField_lagos_cake_total.getText());
		textField_costOfCakes.setText(""+caakeCost);		
	}
	//////////////////////////////////////////
	private void taxCal() {
		int purchase=Integer.parseInt(textField_costOfDrink.getText())+Integer.parseInt(textField_costOfCakes.getText())+Integer.parseInt(textField_serviceCharge.getText());
		int tax=(purchase*18)/100;
		textField_tax.setText(""+tax);
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	////////////////////////////
	private void subTotal() {
		
		int purchase=Integer.parseInt(textField_costOfDrink.getText())+Integer.parseInt(textField_costOfCakes.getText());
		textField_subTotal.setText(""+purchase);
		
	}
	//////////////////////////////
	private void total() {
		
		int total=Integer.parseInt(textField_tax.getText())+Integer.parseInt(textField_subTotal.getText())+Integer.parseInt(textField_serviceCharge.getText());
		textField_total.setText(""+total);
		
	}
	//////////////////////////////
	private void setEditableTrue(int a) {
	
	switch(a) {
	case 1:
		textField_lattle_unit.setEditable(true);
		break;
	case 2:
		textField_iced_lattle_unit.setEditable(true);
		break;
	case 3:
		textField_espresso_unit.setEditable(true);
		break;
	case 4:
		textField_cappuccino_unit.setEditable(true);
		break;
	case 5:
		textField_ice_cappuccino_unit.setEditable(true);
		setEditable2(textField_lagos_cake_unit);
		break;
	case 6:
		textField_coffe_cake_unit.setEditable(true);
		break;
	case 7:
		textField_redVelved_cake_unit.setEditable(true);
		break;
	case 8:
		textField_boston_cake_unit.setEditable(true);
		break;
	case 9:
		textField_blackForest_cake_unit.setEditable(true);
		break;
	case 10:
		textField_lagos_cake_unit.setEditable(true);
		break;
		
	}
	
	}
	///////////////////////////////////////////////////
	private void setEditableFalse(int a) {
		
		switch(a) {
		case 1:
			textField_lattle_unit.setEditable(false);
			setDefault(textField_lattle_unit,textField_lattle_total);
			break;
		case 2:
			textField_iced_lattle_unit.setEditable(false);
			setDefault(textField_iced_lattle_unit,textField_iced_lattle_total);
			break;
		case 3:
			textField_espresso_unit.setEditable(false);
			setDefault(textField_espresso_unit,textField_espresso_total);
			break;
		case 4:
			textField_cappuccino_unit.setEditable(false);
			setDefault(textField_cappuccino_unit,textField_cappuccino_total);
			break;
		case 5:
			textField_ice_cappuccino_unit.setEditable(false);
			setDefault(textField_ice_cappuccino_unit,textField_ice_cappuccino_total);
			break;
		case 6:
			textField_coffe_cake_unit.setEditable(false);
			setDefault(textField_coffe_cake_unit,textField_coffee_cake_total);
			break;
		case 7:
			textField_redVelved_cake_unit.setEditable(false);
			setDefault(textField_redVelved_cake_unit,textField_redVelved_cake_total);
			break;
		case 8:
			textField_boston_cake_unit.setEditable(false);
			setDefault(textField_boston_cake_unit,textField_boston_cake_total);
			break;
		case 9:
			textField_blackForest_cake_unit.setEditable(false);
			setDefault(textField_blackForest_cake_unit,textField_blackForest_cake_total);
			break;
		case 10:
			textField_lagos_cake_unit.setEditable(false);
			setDefault(textField_lagos_cake_unit,textField_lagos_cake_total);
			break;
			
		}
		
	}
	//////////////////////////////////////////////////////////
	private void setDefault(JTextField tfunit,JTextField tftotal) {
		tfunit.setText("0");
		tftotal.setText("0");
	}
//////////////////////////////////////////////////////////
	private void setEditable2(JTextField tfunit) {
		tfunit.setText("");
		
	}
}
