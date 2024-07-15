class CustomException extends Exception {
    public CustomException(String message) {
        super(String.valueOf(message));
    }

    public CustomException(boolean message) {
        super(String.valueOf(message));
    }

}
