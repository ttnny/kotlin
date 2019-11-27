package designPatterns.visitor.visitor;

import designPatterns.visitor.visitable.Book;
import designPatterns.visitor.visitable.Clothing;
import designPatterns.visitor.visitable.Toy;

public interface Visitor {
    double visit(Toy toy);
    double visit(Clothing clothing);
    double visit(Book book);
}