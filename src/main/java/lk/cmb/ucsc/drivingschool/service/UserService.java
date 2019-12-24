package lk.cmb.ucsc.drivingschool.service;

import lk.cmb.ucsc.drivingschool.model.User;
import lk.cmb.ucsc.drivingschool.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    //create
    public User createUser(User user){
        return userRepo.save(user);
    }
    public User getByFirstname(String firstname){
        return userRepo.findByFirstname(firstname);
    }
    public User update(String firstname,String lastname){
        User user=userRepo.findByFirstname(firstname);
        user.setLastname(lastname);
        return userRepo.save(user);
    }
    //delete User
    public void delete(String firstname){
        User user=userRepo.findByFirstname(firstname);
        userRepo.delete(user);
    }


}
