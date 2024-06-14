package BackEndC3.ClinicaOdontologica.exception;

public class ResourceNotFoundException extends Exception {
    //llega el string y no sabe que hacer con él

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
