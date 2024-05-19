package com.psh10066.refactoring._01_mysterious_name._01_change_method_declaration;

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

    // 좋은 이름을 찾아내는 방법 : 함수에 주석을 작성한 다음, 주석을 함수 이름으로 만들어본다.
    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        List<GHIssueComment> comments = issue.getComments();
        for (GHIssueComment comment : comments) {
            this.usernames.add(comment.getUserName());
            this.reviews.add(comment.getBody());
        }
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getUsernames().forEach(name -> System.out.println(name));
        studyDashboard.getReviews().forEach(review -> System.out.println(review));
    }
}
