package construct;

public class MethodInitMain02 {
    public static void main(String[] args) {
        MemberInit member1= new MemberInit();
        initMember(member1,"user1",17,90);

        MemberInit member2= new MemberInit();
        initMember(member2,"user2",16,80);


        MemberInit[] members ={member1,member2};

        for (MemberInit s : members) {
            System.out.println("이름: "+s.name + " age: " +s.age +" grade: "+ s.grade );
        }

    }
    static void  initMember (MemberInit member, String name ,int age ,int grade){
        member.name = "user1";
        member.age = 15;
        member.grade = 90;
    }

}
