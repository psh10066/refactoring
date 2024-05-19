package com.psh10066.refactoring._01_mysterious_name._03_rename_field;

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

    // Record 자료 구조 : 특정 데이터와 관련있는 필드를 묶어놓은 자료 구조
    private Set<StudyReviews> studyReviews = new HashSet<>();

    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     *
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        // review를 가져오는 메소드에서 review가 없으면 부자연스럽다.
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            this.studyReviews.add(new StudyReviews(review.getUserName(), review.getBody()));
        }
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();
        studyDashboard.getStudyReviews().forEach(System.out::println);
    }
}
