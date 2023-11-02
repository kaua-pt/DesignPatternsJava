import java.sql.Date;

public class ConcreteMemento implements Memento {
    private String name;
    private Date date;
    private String filePath;
    private String fileFormat;

    public ConcreteMemento(String name, Date date, String filePath, String fileFormat) {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileFormat() {
        return this.fileFormat;
    }
}
