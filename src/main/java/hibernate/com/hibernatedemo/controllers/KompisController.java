package hibernate.com.hibernatedemo.controllers;

import hibernate.com.hibernatedemo.models.Kompis;
import hibernate.com.hibernatedemo.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path="/kompis")
public class KompisController {

    @Autowired
    private KompisRepository kompisRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addBook(@RequestParam String name, @RequestParam String email, @RequestParam String phone) {
        Kompis k = new Kompis();
        k.setNamn(name);
        k.setEmail(email);
        k.setPhone(phone);
        kompisRepository.save(k);
        return "Kompis sparad";

    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Kompis> getAllKopisar(){
        return kompisRepository.findAll();
    }

    @RequestMapping(path="/name/{name}")
    public Kompis getKompisByName(@PathVariable("name") String name){
        return kompisRepository.findByNamn(name);
    }

    @RequestMapping(path="/phone/{phone}")
    public Kompis getKompisByPhone(@PathVariable("phone") String phone){
        return kompisRepository.findByPhone(phone);
    }

    @RequestMapping(path="bye/{name}/delete")
    public String deleteKompisById(@PathVariable("name") String name){
        Kompis unfriend = kompisRepository.findByNamn(name);
        kompisRepository.delete(unfriend);
        return "kompis deleted";
    }






}
