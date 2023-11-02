import java.util.ArrayList;
import java.util.List;

public abstract class ParserData {
    private List<CustomerData> customerData = new ArrayList<CustomerData>();
    private String filepath;

    // executa algo em determinada ordem, mas n está completo
    public ParserData(String filepath) {
        this.filepath = filepath;
    }

    // muda a implementação de arquivo em arquivo
    protected abstract List<CustomerData> parseData();

    // metodo não muda independente do arquivo
    private List<CustomerData> fixCpf() {
        return new ArrayList<CustomerData>();
    }

    public void fixCostumerData() {
        this.customerData = this.parseData();
        this.customerData = this.fixCpf();
    };
}
