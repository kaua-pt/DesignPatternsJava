import java.util.Stack;

public class BackupImagem {
    private EditorDeImagem editor;
    private Stack<Memento> mmStack = new Stack();

    public BackupImagem(EditorDeImagem editor) {
        this.editor = editor;
    }

    public void backup() {
        this.mmStack.add(this.editor.save());
    }

    public void restore() {
        Memento m = this.mmStack.pop();
        if (m == null)
            return;
        this.editor.restore(m);
    }
}
