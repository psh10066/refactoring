package com.psh10066.refactoring._13_loop._33_replace_loop_with_pipeline;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorTest {

    @Test
    void twitterHandler() {
        Author hojun = new Author("ms", null);
        Author psh10066 = new Author("naver", "hojun");
        assertEquals(List.of("hojun"), Author.TwitterHandles(List.of(hojun, psh10066), "naver"));
    }
}