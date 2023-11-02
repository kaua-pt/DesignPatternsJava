public class CEO extends BaseHandler {

    @Override
    public Costumer handle(Costumer cos) {
        cos.aproved = true;
        return cos;
    }

    @Override
    public BaseHandler setNext(BaseHandler bh) {
        // TODO Auto-generated method stub
        return super.setNext(bh);
    }

}
