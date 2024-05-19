package com.psh10066.refactoring._01_mysterious_name._01_before;

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

    private void studyReviews() throws IOException {
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
        studyDashboard.studyReviews();
        studyDashboard.getUsernames().forEach(name -> System.out.println(name));
        studyDashboard.getReviews().forEach(review -> System.out.println(review));
    }
}
