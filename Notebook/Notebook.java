package Notebook;

public interface Notebook {

    @Override
    String toString();

    int getId();

    int getRam();

    int getStorage();

    String getSizeMonitor();
}
