package com.app.backendbydips4.repository;

import com.app.backendbydips4.model.Document;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DocumentRepository extends SimpleJpaRepository<Document, String> {
    private final EntityManager em;
    public DocumentRepository(EntityManager em) {
        super(Document.class, em);
        this.em = em;
    }
    @Override
    public List<Document> findAll() {
        return em.createNativeQuery("Select * from \"backendbydips4\".\"Document\"", Document.class).getResultList();
    }
}