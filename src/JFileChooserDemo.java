import java.io.File; import javax.swing.*; import javax.swing.filechooser.FileFilter;

public class JFileChooserDemo {
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                return f.isDirectory() ||
                        f.getName().toLowerCase().endsWith(".txt");
            }
            @Override
            public String getDescription() {
                return "Text Files";
            }
        });
        int state = fc.showOpenDialog(null); // Varianten öffnen / zeigen
// int state = fc.showSaveDialog(null); // Variante speichern
// int state = fc.showDialog(null, "Delete"); // freie Variante
        if (state == JFileChooser.APPROVE_OPTION){
            System.out.println(fc.getSelectedFile().getAbsolutePath());
        } else {
            System.out.println("No selection");
        }
    }
}
