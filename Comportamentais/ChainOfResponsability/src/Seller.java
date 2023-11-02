public class Seller extends BaseHandler {

    @Override
    public Costumer handle(Costumer cos) {
        if (cos.total <= 1000) {
            cos.aproved = true;
            return cos;
        }
        return super.handle(cos);
    }

    @Override
    public BaseHandler setNext(BaseHandler bh) {
        // TODO Auto-generated method stub
        return super.setNext(bh);
    }

}
