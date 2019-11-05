import io.IPrinter;
import io.PrinterConsole;
import manager.OrderManager;
import manager.Printer;

public class Main {
    public static void main(String[] args) {
        IPrinter printer = new PrinterConsole();
        Printer printer1 = new Printer();
        OrderManager orderManager = new OrderManager();
        printer1.askHowManyTablesAreThere(printer);
        printer1.askActionOnTable(printer);

    }
}
