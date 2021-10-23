import java.util.List;

public interface UserManagermentService {
	void register(User user);
	List<UserDto> list();
	void delete(Integer userId);

}
