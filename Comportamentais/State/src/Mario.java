public class Mario implements Estado {

    @Override
    public Estado pegarCogu() {
        return new Forte();
    }

    @Override
    public Estado largarCogu() {
        return new Mario();
    }

    @Override
    public Estado correndoDoYoshi() {
        return new Medo();
    }

}
