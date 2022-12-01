package lab32;

import lab9.StudentNotFoundException;
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;

class Interface  extends JFrame  {

    InternetOrder tablesOrderManager = new InternetOrder() {
        public boolean add(Item dish) {
            return super.add(dish);
        }
    };

    InternetOrder internetOrder = new InternetOrder();
    private int a = 0, b = 0;
    boolean age = false;
    JLabel label1 = new JLabel("ФИО");
    JLabel label2 = new JLabel("Общий счет: ");

    JLabel label3 = new JLabel("Адресс доставки");

    JLabel label4 = new JLabel("Оплата");

    JLabel label5 = new JLabel("Телефон для связи");

    JRadioButton r1 = new JRadioButton("Картой");

    JRadioButton r2 = new JRadioButton("Наличными");

    JButton but1 = new JButton("Заказ в зале");

    JButton but2 = new JButton("Онлайн Заказ");

    JButton but3 = new JButton("Pepsi");
    JButton but4 = new JButton("Hennessy");
    JButton but5 = new JButton("Beef stroganoff");
    JButton but6 = new JButton("Borstch");
    JButton but7 = new JButton("Cheesecake");


    JButton but8 = new JButton("Нажимая на эту кнопку я подтверждаю, что мне есть 18 лет");

    JButton but9 = new JButton("Продолжая вы подтверждаете, что ознакомлены с 152-ФЗ РФ, и соглашаетесь на обработку персональных данных");

    JTextPane TextPane1 = new JTextPane();
    JTextPane TextPane2 = new JTextPane();
    JTextPane TextPane3 = new JTextPane();
    Interface() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(547, 400);
        add(but1);
        add(but2);
        but1.addActionListener(ActionEvent ->
        {
            but1.setVisible(false);
            but2.setVisible(false);

            add(but3);
            but3.addActionListener(ActionEvent3 ->
            {
                internetOrder.add(new Dish(59,"Pepsi", "drink"));
                label2.setText("Общий счет " + internetOrder.costTotal() + " рублей");
            });

            add(but4);
            but4.addActionListener(ActionEvent4 ->
            {
                if (age == true){
                    internetOrder.add(new Dish(800,"Hennesi", "drink"));
                    label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
                }else{
                    JOptionPane.showMessageDialog(this,"ст. 16 Федерального закона № 171 не допускает реализацию спиртного детям и подросткам");
                }
            });

            add(but5);
            but5.addActionListener(ActionEvent5 ->
            {
                internetOrder.add(new Dish(500,"Beef Stroganoff", "Main Dish"));
                label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
            });

            add(but6);
            but6.addActionListener(ActionEvent6 ->
            {
                internetOrder.add(new Dish(250,"Borstch", "Soup"));
                label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
            });

            add(but7);
            but7.addActionListener(ActionEvent7 ->
            {
                internetOrder.add(new Dish(250,"Cheesecake", "Dessert"));
                label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
            });

            add(but8);

            but8.addActionListener(ActionEvent8 ->
            {
                age = true;
                but8.setVisible(false);
            });
            add(label2);

        });
        but2.addActionListener(ActionEvent ->
        {
            setSize(750,400);
            but1.setVisible(false);
            but2.setVisible(false);
            add(but9);
            but9.addActionListener(ActionEvent9 ->
            {
                setSize(547, 400);
                but9.setVisible(false);
                add(label1);
                add(TextPane1);
                add(label3);
                add(TextPane2);
                add(label5);
                add(TextPane3);
                add(label4);
                ButtonGroup bg = new ButtonGroup();
                bg.add(r1);
                bg.add(r2);
                add(r1);
                add(r2);

                add(but3);
                but3.addActionListener(ActionEvent3 ->
                {
                    internetOrder.add(new Dish(59,"Pepsi", "drink"));
                    label2.setText("Общий счет " + internetOrder.costTotal() + " рублей");
                });

                add(but4);
                but4.addActionListener(ActionEvent4 ->
                {
                    JOptionPane.showMessageDialog(this,"Закон запрещает продажу алкоголя при выполнении заказа онлайн");
                });

                add(but5);
                but5.addActionListener(ActionEvent5 ->
                {
                    internetOrder.add(new Dish(500,"Beef Stroganoff", "Main Dish"));
                    label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
                });

                add(but6);
                but6.addActionListener(ActionEvent6 ->
                {
                    internetOrder.add(new Dish(250,"Borstch", "Soup"));
                    label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
                });

                add(but7);
                but7.addActionListener(ActionEvent7 ->
                {
                    internetOrder.add(new Dish(250,"Cheesecake", "Dessert"));
                    label2.setText("Общий счет " + internetOrder.costTotal()+ " рублей");
                });
                add(label2);
            });
        });
    }
}




