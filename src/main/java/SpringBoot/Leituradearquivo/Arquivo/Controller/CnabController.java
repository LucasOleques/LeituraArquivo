package SpringBoot.Leituradearquivo.Arquivo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import SpringBoot.Leituradearquivo.Arquivo.Model.Transacao;
import SpringBoot.Leituradearquivo.Arquivo.Service.CnabService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/cnab")
public class CnabController {

    @Autowired
    private CnabService cnabService;
    
    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam MultipartFile file) {
        cnabService.arquivoProcessar(file);

        
        return ResponseEntity.ok("Arquivo processado com sucesso!");
    }

    @GetMapping("/transacao")
    public List<Transacao> listarTransacoes() {
        return cnabService.listarTransacoes();
    }  
}
