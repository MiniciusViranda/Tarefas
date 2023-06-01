import java.io.File;
import javax.swing.JOptionPane;

public class fileDemonstration{
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Enter file or directory name: ");
        analyzePath(input);
    }

    public static void analyzePath(String path){
        File name = new File (path);
        if (name.exists()){
            String response = (
                "\"" + path + "\" exists" +
                (name.isFile()? "\nIs a file" : "\nIs a directory") +
                (name.isHidden()? "\nIs hidden" : "") +
                (name.isAbsolute()? "\nIs an absolute path" : "\nIs a relative path") +
                "\nLast modified: " + name.lastModified() +
                "\nLength: " + name.length() +
                "\nPath: " + name.getPath() +
                "\nAbsolute path: " + name.getAbsolutePath() +
                "\nParent: " + name.getParent()
            );

            JOptionPane.showMessageDialog(null, response, "Response", JOptionPane.PLAIN_MESSAGE);

            if (name.isDirectory()){
                String[] directory = name.list();
                String concat = "";
                
                for(String directoryName : directory){
                    concat = concat + " " + directoryName + "\n";
                }
                JOptionPane.showMessageDialog(null,"Directory Contents: \n\n" + concat, "Directory Contents", JOptionPane.PLAIN_MESSAGE);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "\"" + path + "\" does not exist. ", "Error", JOptionPane.PLAIN_MESSAGE);
        }
    }
}