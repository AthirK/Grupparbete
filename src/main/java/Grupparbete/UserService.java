package Grupparbete;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserService
{
    public List<UserDTO> getActiveAdminUsers(List<User> users)
    {
        return users.stream()
                .filter(user -> user.isActive() && user.getRole() == UserRole.ADMIN)
                .map(this::convertToDTO)
                .sorted(Comparator.comparing(UserDTO::getUsername))
                .collect(Collectors.toList());
    }

    private UserDTO convertToDTO(User user)
    {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
