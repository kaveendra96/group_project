package lk.cmb.ucsc.drivingschool.security;

import lk.cmb.ucsc.drivingschool.model.User;
import lk.cmb.ucsc.drivingschool.repo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService  implements UserDetailsService {
    private UserRepo userRepo;

    public UserPrincipalDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = this.userRepo.findByUsername(s);
        if(user==null){
            throw new UsernameNotFoundException("No user found"+s);
        }
        UserPrincipal userPrincipal= new UserPrincipal(user);
        return userPrincipal;
    }
}
