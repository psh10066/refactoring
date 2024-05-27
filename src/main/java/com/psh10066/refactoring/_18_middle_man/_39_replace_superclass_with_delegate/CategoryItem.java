package com.psh10066.refactoring._18_middle_man._39_replace_superclass_with_delegate;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CategoryItem {

    private Integer id;

    private String title;

    private List<String> tags;

    public boolean hasTag(String tag) {
        return this.tags.contains(tag);
    }
}
