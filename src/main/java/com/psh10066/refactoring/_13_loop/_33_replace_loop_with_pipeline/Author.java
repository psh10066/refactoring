package com.psh10066.refactoring._13_loop._33_replace_loop_with_pipeline;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class Author {

    private String company;

    private String twitterHandle;

    static public List<String> TwitterHandles(List<Author> authors, String company) {
//        var result = new ArrayList<String>();
//        for (Author a : authors) {
//            if (a.company.equals(company)) {
//                var handle = a.twitterHandle;
//                if (handle != null)
//                    result.add(handle);
//            }
//        }
//        return result;

        return authors.stream()
            .filter(author -> author.company.equals(company))
            .map(author -> author.twitterHandle)
            .filter(Objects::nonNull)
            .toList();
    }
}
