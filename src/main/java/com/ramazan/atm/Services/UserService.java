package com.ramazan.atm.Services;

import com.ramazan.atm.Entities.User;
import com.ramazan.atm.Repository.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private IUserRepository iUserRepository;

    public UserService(IUserRepository iUserRepository){
        this.iUserRepository = iUserRepository;
    }

    public List<User> getAllUsers(){
        return iUserRepository.findAll();
    }

    public  User saveOneUser(User newUserRequest){
        User toSave = new User();
        toSave.setId(newUserRequest.getId());
        toSave.setUserName(newUserRequest.getUserName());
        toSave.setPassword(newUserRequest.getPassword());
        toSave.setMoney(newUserRequest.getMoney());
        return iUserRepository.save(toSave);
    }

    public User getOneUser(Long userId){
        return iUserRepository.findById(userId).orElse(null);
    }

    public User updateOneUser(Long userId, User newUser){
        Optional<User> user = iUserRepository.findById(userId);
        if(user.isPresent()){
            User foundUser = user.get();
            foundUser.setUserName(newUser.getUserName());
            foundUser.setPassword(newUser.getPassword());
            foundUser.setMoney(newUser.getMoney());
            iUserRepository.save(newUser);
            return foundUser;
        }
        return null;
    }

    public void deleteById(Long userId){
        iUserRepository.deleteById(userId);
    }

    public User getOneByUserName(String userName){
        return iUserRepository.findByUserName(userName);
    }
}
