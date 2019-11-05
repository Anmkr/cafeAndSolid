package manager;

import io.IPrinter;

public class Printer {
    public  void askHowManyTablesAreThere(IPrinter printer) {
        printer.println("How many table do you have?");
    }

    public void invalidFormatForTableNumber(IPrinter printer){
        printer.println("Invalid number format, please enter number again.");
    }
    public void tableSelectionDialogue(IPrinter printer) {
        printer.println("Enter table number for actions...");

    }

    public void askActionOnTable(IPrinter printer) {
        printer.println("Enter price follow by menu item name to add " +
                "to table receipt, x - clear, p to print, q - do noting ");
        printer.print("> ");
    }

    public void invalidFormat(IPrinter printer) {
        printer.println("Invalid format,enter in following format" + "\n[Number][Space][Item name]");
    }

}
