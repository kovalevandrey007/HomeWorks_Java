import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Notebook {
    int id;
    int ram;
    int storage;
    String sizeMonitor;
    String brand;
    String color;
    String processor;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return id == notebook.id && ram == notebook.ram && storage == notebook.storage && Objects.equals(sizeMonitor, notebook.sizeMonitor) && Objects.equals(brand, notebook.brand) && Objects.equals(color, notebook.color) && Objects.equals(processor, notebook.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ram, storage, sizeMonitor, brand, color, processor);

    }

    @Override
    public String toString() {
        return "Notebook{" +
                "id=" + id +
                ", ram=" + ram +
                ", storage=" + storage +
                ", sizeMonitor='" + sizeMonitor + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}








