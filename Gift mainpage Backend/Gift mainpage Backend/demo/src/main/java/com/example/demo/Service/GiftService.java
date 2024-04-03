package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Gift;
import com.example.demo.Repositary.GiftRepo;
@Service
public class GiftService {
    @Autowired
    GiftRepo mr;
    @SuppressWarnings("null")
    public Gift create (Gift mm)
    {
        return mr.save(mm);
    }
    public List<Gift> getAll()
    {
        return mr.findAll();
    }
    public Gift getMe(int id)
    {
        return mr.findById(id).orElse(null);
    }
    @SuppressWarnings("null")
    public boolean updateDetails(int id,Gift mm)
        {
            if(this.getMe(id)==null)
            {
                return false;
            }
            try{
                mr.save(mm);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
public boolean deleteMedicine(int id)
        {
            if(this.getMe(id) == null)
            {
                return false;
            }
            mr.deleteById(id);
            return true;
        }

}