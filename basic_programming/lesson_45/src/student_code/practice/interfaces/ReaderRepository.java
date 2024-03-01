package student_code.practice.interfaces;

import student_code.practice.models.Reader;

import java.util.List;

// Слой доступа к данным (Data Access Layer)
public interface ReaderRepository {

    void registerReader(Reader reader);

    List<Reader> findAllReaders();
}

