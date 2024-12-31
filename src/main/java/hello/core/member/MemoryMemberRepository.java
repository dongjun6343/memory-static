package hello.core.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

//    private final Map<Long, Member> store = new HashMap<>();
    private static final Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        // @930
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        // @939
        return store.get(memberId);
    }
}
