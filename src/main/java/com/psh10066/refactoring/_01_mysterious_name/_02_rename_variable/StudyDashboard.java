package com.psh10066.refactoring._01_mysterious_name._02_rename_variable;

import lombok.Getter;
import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
public class StudyDashboard {

    private Set<String> usernames = new HashSet<>();

    private Set<String> reviews = new HashSet<>();

    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        // review를 가져오는 메소드에서 review가 없으면 부자연스럽다.
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            this.usernames.add(review.getUserName());
            this.reviews.add(review.getBody());
        }
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        // 람다식에서는 변수 정의를 하지 않아도 된다.
        studyDashboard.getUsernames().forEach(System.out::println);
        studyDashboard.getReviews().forEach(System.out::println);
    }
}
