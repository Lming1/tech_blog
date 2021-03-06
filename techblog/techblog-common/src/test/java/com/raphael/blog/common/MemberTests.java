//package com.raphael.blog.common;
//
//
//import com.raphael.blog.common.Domain.Member;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.CoreMatchers.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class MemberTests {
//    public static final String PATH = "/members";
//
//    @Autowired
//    private TestRestTemplate testRestTemplate;
//
//
//    @Test
//    public void create() {
//        String userId = "test";
//        String password = "12345";
//        String username = "test";
//        String nickname = "test";
//        String email = "test@test.com";
//        String introduce = "gklsdfjsdlkfjdfalksdf";
//        Member createdMember = createMember(userId, password, username, nickname, email, introduce);
//        validate(userId, password, username, nickname, email, introduce, createdMember);
//    }
//
//    private Member createMember(String userId, String password, String username, String nickname, String email, String introduce) {
//        Member member = new Member();
//        member.setUserId(userId);
//        member.setPassword(password);
//        member.setUsername(username);
//        member.setNickname(nickname);
//        member.setEmail(email);
//        member.setIntroduce(introduce);
//        return testRestTemplate.postForObject(PATH, member, Member.class);
//    }
//
//    private void validate(String userId, String password, String username, String nickname, String email, String introduce, Member createdMember) {
//        Member resultMember = testRestTemplate.getForObject(PATH + "/" + createdMember.getId(), Member.class);
//        assertThat(resultMember.getUserId(), is(userId));
//        assertThat(resultMember.getPassword(), is(password));
//        assertThat(resultMember.getUsername(), is(username));
//        assertThat(resultMember.getNickname(), is(nickname));
//        assertThat(resultMember.getEmail(), is(email));
//        assertThat(resultMember.getIntroduce(), is(introduce));
//
//    }
//
//
////    @Test
////    public void get() {
////        Integer id = 1;
////        String userId = "test";
////        String password = "12345";
////        String name = "test";
////        String nickname = "test";
////        String email = "test@test.com";
////        String introduce = "gklsdfjsdlkfjdfalksdf";
////        Member member = testRestTemplate.getForObject(PATH + "/" + id, Member.class);
////
////        assertThat(member.getId(), is(id));
////        assertThat(member.getUserId(), is(userId));
////        assertThat(member.getPassword(), is(password));
////        assertThat(member.getUsername(), is(name));
////        assertThat(member.getNickname(), is(nickname));
////        assertThat(member.getEmail(), is(email));
////        assertThat(member.getIntroduce(), is(introduce));
////    }
//}
