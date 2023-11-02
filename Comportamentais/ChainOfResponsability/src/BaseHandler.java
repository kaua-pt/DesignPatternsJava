public abstract class BaseHandler {
    protected BaseHandler nextHandler = null;

    public Costumer handle(Costumer cos) {
        if (nextHandler != null)
            return this.nextHandler.handle(cos);
        return cos;
    }

    public BaseHandler setNext(BaseHandler bh) {
        this.nextHandler = bh;
        return bh;
    }
}
