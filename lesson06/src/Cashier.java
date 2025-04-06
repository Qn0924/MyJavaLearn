public class Cashier {
    public void settlement(Member member) {
        member.buyBook();
    }

    public Member getmember(String name) {
        if(name.equals("普通会员")){
            return new Odinarymember();
        }else if(name.equals("超级会员")){
            return new Supermember();
        }else{
            return new Member();
        }
    }
}
