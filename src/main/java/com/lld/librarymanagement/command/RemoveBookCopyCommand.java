package com.lld.librarymanagement.command;

import java.util.List;
import java.util.Objects;

public class RemoveBookCopy implements Command{
    @Override
    public boolean match(String input) {
        List<String> inputWords= List.of(input.split(" "));
        return inputWords.size()==2 && Objects.equals(inputWords.get(0), "remove_book_copy");
    }

    @Override
    public void execute(String input) {

    }
}
