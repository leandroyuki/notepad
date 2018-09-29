package br.com.leandro.takahashi.notepad.repository

import br.com.leandro.takahashi.notepad.model.Nota
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NotaRepository : MongoRepository<Nota, String> {
    fun findByTituloContainingIgnoreCase(titulo: String): List<Nota>
}