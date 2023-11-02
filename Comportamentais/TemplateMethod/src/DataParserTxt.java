import java.util.ArrayList;
import java.util.List;

public class DataParserTxt extends ParserData {

    public DataParserTxt(String filepath) {
        super(filepath);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected List<CustomerData> parseData() {
        String data = "Arquivo lido";
        // transforma arquivo
        return new ArrayList<CustomerData>();
    }

}
