import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;


public class PerformanceManagementUI {
    private JTable table1;
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton 保存Button;
    private JButton 查看录入信息Button;
    private JScrollPane scrollPane1;
    List<Student> students=new ArrayList<>();
    String[] columnNames = {"姓名",
            "年龄",
            "出生日期",
            "Java实验成绩"};


    public static void main(String[] args) {
        JFrame frame = new JFrame("PerformanceManagementUI");//PerformanceManagementUI
        frame.setContentPane(new PerformanceManagementUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PerformanceManagementUI() {//s,object
        保存Button.addMouseListener(new MouseAdapter() {//create
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                students.add(new Student(textField1.getText(),Integer.valueOf(textField2.getText()),textField3.getText(),Double.valueOf(textField4.getText())));
            }
        });


        查看录入信息Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Object[][] data = new Object[students.size()][4];//Table Rows
                for (int i=0;i<students.size();i++)
                {
                    data[i][0]=students.get(i).name;
                    data[i][1]=students.get(i).age;
                    data[i][2]=students.get(i).birthday;
                    data[i][3]=students.get(i).javaScore;
                }
                table1.setModel(new DefaultTableModel(data,columnNames));
            }
        });
    }

    class Student {
        private String name;
        private int age;
        private String birthday;
        private double javaScore;

        public Student(String name, int age, String birthday, double javaScore) {
            this.name = name;
            this.age = age;
            this.birthday = birthday;
            this.javaScore = javaScore;
        }

        public Student() {
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getBirthday() {
            return birthday;
        }

        public double getJavaScore() {
            return javaScore;
        }


    }
}


