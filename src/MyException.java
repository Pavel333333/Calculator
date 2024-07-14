class CustomException extends Exception {
    public CustomException(boolean message) {
        super(String.valueOf(message));
    }

}

