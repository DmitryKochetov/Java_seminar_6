package DZ;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private int id, ram, hd;
    private String vendor, os, model, color;

    public Notebook(String color, String vendor, String model, int ram, int hd, String os, int id) {
        this.id = id;
        this.vendor = vendor;
        this.model = model;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;

    }

    // public Notebook(String string, boolean b, String string2, String string3, int
    // i, int j, int k) {
    // }

    public String toString() {
        return "\nNotebook id: " + id + "\n" +
                "vendor: " + vendor +
                ", model: " + model + "\n" +
                "ram: " + ram +
                ", hd: " + hd +
                ", os: " + os +
                ", color " + color;
    }

    public String getmodel() {
        return model;
    }

    public static List<Notebook> getBooksByColor(List<Notebook> noteb, String color) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : noteb) {
            if (c.color.toLowerCase().equals(color.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByOs(List<Notebook> noteb, String osys) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : noteb) {
            if (c.os.toLowerCase().equals(osys.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByVendor(List<Notebook> noteb, String vend) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : noteb) {
            if (c.vendor.toLowerCase().equals(vend.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByRam(List<Notebook> noteb, int min, int max) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : noteb) {
            if ((c.ram >= min) && (c.ram <= max)) {
                result.add(c);
            }
        }
        return result;
    }

    public static List<Notebook> getBooksByHdd(List<Notebook> noteb, int min, int max) {

        List<Notebook> result = new ArrayList<>();
        for (Notebook c : noteb) {
            if ((c.hd >= min) && (c.hd <= max)) {
                result.add(c);
            }
        }
        return result;
    }
}
