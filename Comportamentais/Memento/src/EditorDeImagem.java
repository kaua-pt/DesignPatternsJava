// originator

import java.sql.Date;

public class EditorDeImagem {
    private String path;
    private String fileFormat;

    public EditorDeImagem(String path, String fileFormat) {
        this.path = path;
        this.fileFormat = fileFormat;
    }

    public void convertFormat(String format) {
        this.fileFormat = format;
    }

    public Memento save() {
        Date date = new Date(1);
        return new ConcreteMemento("lalaalminhacabeçatapiscando", date, this.path, this.fileFormat);

    }

    public void restore(Memento memento) {
        ConcreteMemento cm = (ConcreteMemento) memento;
        this.fileFormat = cm.getFileFormat();
        this.path = cm.getFilePath();
    }
}