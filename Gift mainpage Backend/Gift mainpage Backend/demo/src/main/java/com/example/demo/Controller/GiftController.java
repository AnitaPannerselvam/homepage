package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Gift;
import com.example.demo.Service.GiftService;
@RestController
public class GiftController {
    @Autowired
    GiftService ms;
    @PostMapping("/api/Gift")
    public ResponseEntity<Gift>addelements(@RequestBody Gift m)
    {
        Gift mm=ms.create(m);
        return new ResponseEntity<>(mm,HttpStatus.CREATED);
    }
    @GetMapping("/api/Gifts")
    public ResponseEntity<List<Gift>> showinfo()
    {
        return new ResponseEntity<>(ms.getAll(),HttpStatus.OK);
    }
    @GetMapping("/api/Gift/{GiftId}")
    public ResponseEntity<Gift> getById(@PathVariable Integer ticketId)
    {
        Gift obj=ms.getMe(ticketId);
        return new ResponseEntity<>(obj,HttpStatus.OK);
    }
    @SuppressWarnings("null")
    @PutMapping("/api/Gift/{GiftId}")
    public ResponseEntity<Gift> putMethodName(@PathVariable("GiftId") int id, @RequestBody Gift m) {
        if(ms.updateDetails(id,m) == true)
        {
            return new ResponseEntity<>(m,HttpStatus.OK);
        }
        
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
@DeleteMapping("/api/Gift/{GiftId}")
    public ResponseEntity<Boolean> delete(@PathVariable("GiftId") int id)
    {
        if(ms.deleteMedicine(id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }
}

