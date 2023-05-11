package personal.model;

public class UserMapper {
    public String map(User user) {
        return String.format("%s,%s,%s,%s", user.getId(), user.getFirstName(), user.getLastName(), user.getPhone());
    }

    public User map(String line) {
        String[] lines = line.split(",");
        if (lines.length != 4) {
            throw new IllegalArgumentException("Invalid input format");
        }
        return new User(lines[0], lines[1], lines[2], lines[3]);
    }
}
