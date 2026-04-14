package br.mackenzie.fci.restdb;

public class TitulosController {
    @RestController
    public class TitulosController{


        @Autowired
        private TitulosCampeonatosRepo titulosRepo;

        @GetMapping("/api/titulos")
        public Itereble<TitulosCampeonatos> getTitulos(){
            Itereble<TitulosCampeonatos> titulos =  titulosRepo.findAll();
            return titulos; 
        }

        @PostMapping("/api/titulos")
        public void createTitulo(@RequestBody Titulo t){ // ResquetBody coloca os parametros dentro do corpo da request
            return titulosRepo.save(t);
        }
    }
}
