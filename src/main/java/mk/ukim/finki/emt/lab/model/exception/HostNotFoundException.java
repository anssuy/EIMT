package mk.ukim.finki.emt.lab.model.exception;

public class HostNotFoundException extends RuntimeException {
    public HostNotFoundException(Long id) {
        super("Host with id %d does not exist.".formatted(id));
    }
}
