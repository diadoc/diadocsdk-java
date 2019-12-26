package Diadoc.Api.exceptions;

import Diadoc.Api.helpers.System7Emu;

public class DiadocSdkException extends Exception {
    public DiadocSdkException(Exception ex) {
        super(ex);
    }

    public DiadocSdkException(String message) {
        super(message);
    }

    private String formatMessage(Throwable[] exceptions) {
        String text = super.toString();
        for (int i = 0; i < exceptions.length; i++){
            text = String.format("%s%s---> (Inner Exception #%s) %s%s%s", text, System7Emu.lineSeparator(), i, exceptions[i].toString(), "<---", System7Emu.lineSeparator());
        }
        return text;
    }
}
