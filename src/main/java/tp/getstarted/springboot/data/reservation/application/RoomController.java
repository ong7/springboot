package tp.getstarted.springboot.data.reservation.application;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import tp.getstarted.springboot.data.reservation.dao.BaseQuestionRepository;
import tp.getstarted.springboot.data.reservation.dao.RoomRepository;
import tp.getstarted.springboot.data.reservation.dao.UserRepository;
import tp.getstarted.springboot.data.reservation.entity.BaseQuestion;
import tp.getstarted.springboot.data.reservation.entity.Room;
import tp.getstarted.springboot.data.reservation.entity.User;
import tp.getstarted.springboot.data.reservation.service.NextSequenceService;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@RestController
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private NextSequenceService nextSequenceService;
    @Autowired
    private BaseQuestionRepository baseQuestionRepository;
    @Autowired
    private UserRepository userRepository;


    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String getReservations(){
        return "reservations";
    }



    @RequestMapping(value = "/rooms", method = RequestMethod.GET)
    List<Room> findAll(@RequestParam(required = false) String roomNumber){
        List<Room> rooms = new ArrayList<>();
        if (null == roomNumber){
            //
            //findAll(), qui permet de récupérer toutes les données de l'entité concernée.
            // findAll() retourne un Iterable,
            // qu'il nous faut spécifier comme type de retour de la méthode.
            //
            //
            //delete(int id) : supprime le produit correspondant à l'id passée en argument
            //count() : calcule le nombre de produits
            //save(Product produit) : ajoute le produit  passé en argument.
            // Cette méthode peut également recevoir un Iterable<> de produits pour ajouter plusieurs produits
            //
            Iterable<Room> results = this.roomRepository.findAll();
            results.forEach(room -> {
                rooms.add(room);
            });
        }
        else{
            Room room = this.roomRepository.findByNumber(roomNumber);
            if (null!=room){
                rooms.add(room);
            }
        }
        return rooms;
    }



    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody(required = false) User user) {
        log.info("Saving user.");
        System.out.println(user);
        userRepository.save(user);
        return user;
    }

    @RequestMapping(value = "/questions", consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
    public List<BaseQuestion> addNewUsers(@RequestBody(required = false) BaseQuestion baseQuestion) {
        log.info("Saving baseQuestion.");
        System.out.println(baseQuestion);
        //BaseQuestion baseQuestion1 = new BaseQuestion();
        baseQuestion.setQuestionID(nextSequenceService.getNextSequence("customSequences"));
        baseQuestionRepository.save(baseQuestion);
        List<BaseQuestion> questionList = new ArrayList<>();
        questionList.add(baseQuestion);
        System.out.println();
        return questionList;
    }

    @RequestMapping(value = "/{questionId}", method = RequestMethod.GET)
    HttpStatus deleteQuestion(@PathVariable Long questionId){
        log.info("Delete question " + questionId);
        baseQuestionRepository.deleteById(questionId);
        return HttpStatus.OK;
    }

    @RequestMapping(value = "/getallqst/", method = RequestMethod.GET)
   List<BaseQuestion> findAll(){

        List<BaseQuestion> questionList = new ArrayList<>();
        Iterable<BaseQuestion> results = this.baseQuestionRepository.findAll();
        results.forEach(qst -> {
            questionList.add(qst);
            System.out.println(qst);
        });

        return questionList;
    }




    @RequestMapping(value = "/getqst/{id}", method = RequestMethod.GET)
       List<BaseQuestion> findbyid(@PathVariable Long id){
        List<BaseQuestion> questionList = new ArrayList<>();
        BaseQuestion obj = baseQuestionRepository.findById(id).get();
        questionList.add(obj);
        System.out.println(obj);
        return questionList;
    }








}
