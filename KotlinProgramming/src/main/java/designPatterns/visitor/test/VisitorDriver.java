package designPatterns.visitor.test;

import designPatterns.visitor.visitable.Book;
import designPatterns.visitor.visitable.Clothing;
import designPatterns.visitor.visitable.Toy;
import designPatterns.visitor.visitor.HolidaySaleVisitor;
import designPatterns.visitor.visitor.TaxVisitor;

public class VisitorDriver {
    public static void main(String[] args) {
        Toy actionFigure = new Toy(5.2);
        Book harryPotter = new Book(14.25);
        Clothing sweater = new Clothing(20.0);

        TaxVisitor visitor = new TaxVisitor();

        System.out.println(actionFigure.accept(visitor));
        System.out.println(harryPotter.accept(visitor));
        System.out.println(sweater.accept(visitor));
        System.out.println();

        HolidaySaleVisitor holidayVisitor = new HolidaySaleVisitor();
        System.out.println(actionFigure.accept(holidayVisitor));
        System.out.println(harryPotter.accept(holidayVisitor));
        System.out.println(sweater.accept(holidayVisitor));
    }
}