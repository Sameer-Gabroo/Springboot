//package com.example.SpringBoot1.controller;
//
//import com.example.SpringBoot1.entitiy.journalEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController //this is used to create End point in the form of methods
//@RequestMapping("/-bhai")
//public class journalEntityController {
//
////    private Map<long, journalEntity> studentMap = new HashMap<>();
//    private Map<Long, journalEntity> studentMap = new HashMap<>();
//
//@GetMapping()
//public List<journalEntity> getAll(){
//return new ArrayList<>(studentMap.values());
//}
//
//@PostMapping()
//    public boolean add(@RequestBody journalEntity myEntity){
//    studentMap.put(myEntity.getId(),myEntity);
//    return true;
//}
//
//@GetMapping("id/{myID}")
//public journalEntity GetJournalEntityByID(@PathVariable Long myID){
//return studentMap.get(myID);
//}
//
//@DeleteMapping("id/{myID}")
//public journalEntity deleteJournalEntityByID(@PathVariable Long myID){
//        return studentMap.remove(myID);
//    }
//
//   @PutMapping("id/{myID}")
//   public journalEntity updateJournalEntityByID(@PathVariable Long id,@RequestBody journalEntity myEntity ){
//       return studentMap.put(id,myEntity);
//    }
//
//}
