package MyPackage2;

import java.awt.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.*;

public class LinList extends JFrame 
{
    private LinkedList<Integer> list;
    
    private JRadioButton stackButton, queueButton;
    
    private JButton pushButton, popButton, addButton, deleteButton;
    
    private JTextArea textArea;

    public LinList() 
    {
        super("LinkedList Stack/Queue");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400, 300);
        
        setLayout(new BorderLayout());

        // Initialize LinkedList with 10 random integers
        list = new LinkedList<Integer>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
        {
            list.add(rand.nextInt(100));
        }

        // Create radio buttons for choosing Stack or Queue
        JPanel radioPanel = new JPanel();
        
        ButtonGroup group = new ButtonGroup();
        
        stackButton = new JRadioButton("Stack");
        
        stackButton.addActionListener(new RadioListener());
        
        group.add(stackButton);
        
        queueButton = new JRadioButton("Queue");
        
        queueButton.addActionListener(new RadioListener());
        
        group.add(queueButton);
        
        radioPanel.add(stackButton);
        
        radioPanel.add(queueButton);
        
        add(radioPanel, BorderLayout.NORTH);

        // Create buttons for Stack/Queue operations
        JPanel buttonPanel = new JPanel();
        
        pushButton = new JButton("Push");
        
        pushButton.addActionListener(new PushListener());
        
        popButton = new JButton("Pop");
        
        popButton.addActionListener(new PopListener());
        
        addButton = new JButton("Add");
        
        addButton.addActionListener(new AddListener());
        
        deleteButton = new JButton("Delete");
        
        deleteButton.addActionListener(new DeleteListener());
        
        buttonPanel.add(pushButton);
        
        buttonPanel.add(popButton);
        
        buttonPanel.add(addButton);
        
        buttonPanel.add(deleteButton);
        
        add(buttonPanel, BorderLayout.SOUTH);

        // Create text area to display LinkedList
        textArea = new JTextArea(list.toString());
        
        textArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        add(scrollPane, BorderLayout.CENTER);
        
    }

    private class RadioListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            // Clear text area when switching between Stack/Queue
            textArea.setText(list.toString());
        }
    }

    private class PushListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (stackButton.isSelected()) 
            {
                // Stack operation - Push
                int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an Stack integer:"));
                list.push(num);
            }
            textArea.setText(list.toString());
        }
    }

    private class PopListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (stackButton.isSelected()) 
            {
                // Stack operation - Pop
                if (!list.isEmpty()) 
                {
                    list.pop();
                } else
                {
                    JOptionPane.showMessageDialog(null, "Stack is empty.");
                }
            }
            textArea.setText(list.toString());
        }
    }

    private class AddListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e)
        {
            if (queueButton.isSelected()) 
            {
                // Queue operation - Add
                int num = Integer.parseInt(JOptionPane.showInputDialog("Enter an Queue integer:"));
                list.addLast(num);
            }
            textArea.setText(list.toString());
        }
    }

    private class DeleteListener implements ActionListener 
    {
        public void actionPerformed(ActionEvent e) 
        {
            if (queueButton.isSelected()) 
            {
                // Queue operation - Delete
                if (!list.isEmpty()) 
                {
                    list.removeFirst();
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Queue is empty.");
                }
            }
            textArea.setText(list.toString());
        }
    }

    public static void main(String[] args) 
    {
        LinList gui = new LinList();
        gui.setVisible(true);
    }
    
}
