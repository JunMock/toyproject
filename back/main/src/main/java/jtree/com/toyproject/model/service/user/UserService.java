package jtree.com.toyproject.model.service.user;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jtree.com.toyproject.model.dao.UserRepository;
import jtree.com.toyproject.model.dto.User;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User create(User user) {
        Optional<User> tmp = userRepository.findById(user.getUserId());
        if (tmp.isPresent())
            throw new UserIdAlreadyExistsException(user.getUserId() + " is already exists.");
        return userRepository.save(user);
    }

    public User update(User user) {
        if (!userRepository.existsById(user.getUserId()))
            throw new UserIdNotFoundException(user.getUserId() + "is not found.");

        userRepository.save(user);
        return user;
    }

    public void delete(Integer id) {
        if (!userRepository.existsById(id))
            throw new UserIdNotFoundException(id + "is not found.");

        userRepository.deleteById(id);
    }

    public User find(Integer id) {
        return userRepository.findById(id).get();
    }


}
