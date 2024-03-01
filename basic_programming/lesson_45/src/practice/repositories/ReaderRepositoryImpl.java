package practice.repositories;

import practice.interfaces.ReaderRepository;
import practice.models.Reader;

import java.util.ArrayList;
import java.util.List;

public class ReaderRepositoryImpl implements ReaderRepository {

    List<Reader>readers;

    public ReaderRepositoryImpl() {
        readers = new ArrayList<>();
    }

    @Override
    public void registerReader(Reader reader) {
        if (readers.contains(reader)) {
            System.out.println("Reader has already exist");
        } else {
            readers.add(reader);
            System.out.println("Reader has been added");
        }

    }

    @Override
    public List<Reader> findAllReaders() {
        return readers;
    }
}
