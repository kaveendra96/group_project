package lk.cmb.ucsc.drivingschool.utility;


import lk.cmb.ucsc.drivingschool.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenarateId {
    @Autowired
    private UserRepo userRepo;

   public String genarateID(){
     String id=userRepo.findTopByOrderByIdDesc().getId();
     int idInt=Integer.parseInt(id);
     idInt=idInt+1;
     return idInt+"";
    }
}
