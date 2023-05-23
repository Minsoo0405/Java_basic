public class AccessObj {

    // public => 어떤 클래스든 접근할 수 있다는 것을 의미
    public int p = 3;

    // protected => 자기 자신, 같은 패키지, 서로 다른 패키지다 하더라도 상속받은 자식 클래스에서는 접근할 수 있다는 것을 의미
    protected int p2 = 4;

    // private => 자기 자신만 접근할 수 있다는 것을 의미
    private int i = 1;

    // default 접근지정자 => 자기자신과 같은 패키지에서만 접근할 수 있다는 것을 의미
    int k = 4;
}
