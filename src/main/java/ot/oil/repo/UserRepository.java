package ot.oil.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ot.oil.domains.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);
}
