package SpringBoot.Leituradearquivo.Arquivo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import SpringBoot.Leituradearquivo.Arquivo.Model.*;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    
}