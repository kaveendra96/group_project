package lk.cmb.ucsc.drivingschool.repo;

import lk.cmb.ucsc.drivingschool.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User,Long> {
    public User findByFirstname(String firstname);
    public User findByUsername(String username);
    public User findTopByOrderByIdDesc();

}
