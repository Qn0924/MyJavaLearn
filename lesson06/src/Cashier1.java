public class Cashier1 {
    private Member1 member1;

    public void setMember1(Member1 member1) {
        this.member1 = member1;
    }
    public void settlement1(){
        this.member1.buyBook();
    }
}
