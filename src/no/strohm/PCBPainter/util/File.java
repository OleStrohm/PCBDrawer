package no.strohm.PCBPainter.util;

/**
 * Created by Elias F. Fyksen on 14.04.2017.
 */
public class File extends java.io.File {

    static final boolean unix = !System.getProperty("os.name").contains("Windows");

    public File(String m_path) {
        super(compile(m_path));
    }


    public static String compile(String m_path) {
        if (!unix) {
            m_path.replace("/", "\\");
        }
        return m_path;
    }
}
