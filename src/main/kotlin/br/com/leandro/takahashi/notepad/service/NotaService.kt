package br.com.leandro.takahashi.notepad.service

import br.com.leandro.takahashi.notepad.model.Nota
import br.com.leandro.takahashi.notepad.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
class NotaService {

    @Autowired
    lateinit var notaRepository: NotaRepository

    fun salvar(nota: Nota) : Nota {
        return notaRepository.save(nota)
    }

    fun buscarTodos() : List<Nota> {
        return notaRepository.findAll()
    }

    fun apagar(id: String) {
        notaRepository.deleteById(id)

    }

    fun buscarPor(id: String): Nota {
        return notaRepository.findById(id).get()
    }

    fun buscarPorTituloContendo(titulo: String): List<Nota> {
        return notaRepository.findByTituloContainingIgnoreCase(titulo)
    }


}